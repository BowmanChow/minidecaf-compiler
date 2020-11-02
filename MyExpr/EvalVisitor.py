import sys
from .MyExprParser import MyExprParser
from .MyExprVisitor import MyExprVisitor


class EvalVisitor(MyExprVisitor):

    def visitProgram(self, ctx: MyExprParser.ProgramContext):
        return ctx.main_fun().accept(self)

    def visitMain_fun(self, ctx: MyExprParser.Main_funContext):
        self.variable_list = []
        self.condition_counter = 0
        string = ""
        for i in ctx.block_item():
            string += i.accept(self)
        return f"""\
main{{
PROLOGUE {self.variable_list.__len__()}
{string}
PUSH 0
RET
EPILOGUE {self.variable_list.__len__()}
}}
"""

    def visitStat_expr(self, ctx):
        if ctx.expression() is None:
            return ""
        else:
            return f"""\
{ctx.expression().accept(self)}
POP
"""

    def visitStat_condition(self, ctx):
        self.condition_counter += 1
        counter = self.condition_counter
        return f"""\
{ctx.expression().accept(self)}
BEQZ else_label{counter}
{ctx.statement()[0].accept(self)}
BR end_label{counter}
LABEL else_label{counter}
{"" if ctx.statement().__len__() <= 1 else ctx.statement()[1].accept(self)}
LABEL end_label{counter}
"""

    def visitDeclaration(self, ctx: MyExprParser.DeclarationContext):
        if ctx.expression() is None:
            string = """\
PUSH 0"""
        else:
            string = ctx.expression().accept(self)
        if ctx.Identifier().getText() in self.variable_list:
            raise Exception(
                f"indentifier {ctx.Identifier().getText()} has been declared")
        else:
            self.variable_list.append(ctx.Identifier().getText())
        return f"""\
{string}
FRAMEADDR {self.variable_list.index(ctx.Identifier().getText())}
STORE
POP
"""

    def visitReturn_stat(self, ctx: MyExprParser.Return_statContext):
        return f"""\
{ctx.expression().accept(self)}\
RET
"""

    def visitAssign(self, ctx: MyExprParser.AssignContext):
        if not (ctx.Identifier().getText() in self.variable_list):
            raise Exception(f"Undefined variable {ctx.Identifier().getText()}")
        return f"""\
{ctx.expression().accept(self)}
FRAMEADDR {self.variable_list.index(ctx.Identifier().getText())}
STORE
"""

    def visitCondition(self, ctx):
        self.condition_counter += 1
        counter = self.condition_counter
        return f"""\
{ctx.logical_or().accept(self)}
BEQZ else_label{counter}
{ctx.expression().accept(self)}
BR end_label{counter}
LABEL else_label{counter}
{ctx.conditional().accept(self)}
LABEL end_label{counter}
"""

    def visitOr_operate(self, ctx: MyExprParser.Or_operateContext):
        return f"""\
{ctx.logical_or().accept(self)}\
{ctx.logical_and().accept(self)}\
LOR
"""

    def visitAnd_operate(self, ctx: MyExprParser.And_operateContext):
        return f"""\
{ctx.logical_and().accept(self)}\
{ctx.equality().accept(self)}\
LAND
"""

    def visitEqual_operate(self, ctx: MyExprParser.Equal_operateContext):
        return f"""\
{ctx.equality().accept(self)}\
{ctx.relational().accept(self)}\
{"EQ"   if ctx.op.text == '=='  else
"NE" if ctx.op.text == '!=' else ''}
"""

    def visitRelation_operate(self, ctx: MyExprParser.Relation_operateContext):
        return f"""\
{ctx.relational().accept(self)}\
{ctx.additive().accept(self)}\
{"LT"   if ctx.op.text == '<'   else
"GT"    if ctx.op.text == '>'   else
"LE"    if ctx.op.text == '<='  else
"GE"    if ctx.op.text == '>='  else ''}
"""

    def visitAdd_operate(self, ctx: MyExprParser.Add_operateContext):
        return f"""\
{ctx.additive().accept(self)}\
{ctx.multiplicative().accept(self)}\
{"ADD"  if ctx.op.text == '+'   else
"SUB"   if ctx.op.text == '-'   else ''}
"""

    def visitMul_operate(self, ctx: MyExprParser.Mul_operateContext):
        return f"""\
{ctx.multiplicative().accept(self)}\
{ctx.unary().accept(self)}\
{"MUL"  if ctx.op.text == '*'   else
"DIV"   if ctx.op.text == '/'   else
"REM"   if ctx.op.text == '%'   else ''}
"""

    def visitUnary_operate(self, ctx: MyExprParser.Unary_operateContext):
        return f"""\
{ctx.unary().accept(self)}\
{"NEG"  if ctx.op.text == '-'   else
"NOT"   if ctx.op.text == '~'   else
"LNOT"  if ctx.op.text == '!'   else ''}
"""

    def visitPrimaryInteger(self, ctx: MyExprParser.PrimaryIntegerContext):
        i = int(ctx.Integer().getText())
        if i > 2**31 - 1:
            raise Exception('int too large')
        return f"""PUSH {str(i)}
"""

    def visitPrimaryParen(self, ctx: MyExprParser.PrimaryParenContext):
        return ctx.expression().accept(self)

    def visitPrimaryIdentifier(self, ctx):
        if not ctx.Identifier().getText() in self.variable_list:
            raise Exception(
                f"Undefined variable {ctx.Identifier().getText()}")
        return f"""\
FRAMEADDR {self.variable_list.index(ctx.Identifier().getText())}
LOAD
"""
