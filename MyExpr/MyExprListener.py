# Generated from ./MyExpr/MyExpr.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyExprParser import MyExprParser
else:
    from MyExprParser import MyExprParser

# This class defines a complete listener for a parse tree produced by MyExprParser.
class MyExprListener(ParseTreeListener):

    # Enter a parse tree produced by MyExprParser#program.
    def enterProgram(self, ctx:MyExprParser.ProgramContext):
        pass

    # Exit a parse tree produced by MyExprParser#program.
    def exitProgram(self, ctx:MyExprParser.ProgramContext):
        pass


    # Enter a parse tree produced by MyExprParser#main_fun.
    def enterMain_fun(self, ctx:MyExprParser.Main_funContext):
        pass

    # Exit a parse tree produced by MyExprParser#main_fun.
    def exitMain_fun(self, ctx:MyExprParser.Main_funContext):
        pass


    # Enter a parse tree produced by MyExprParser#int_type.
    def enterInt_type(self, ctx:MyExprParser.Int_typeContext):
        pass

    # Exit a parse tree produced by MyExprParser#int_type.
    def exitInt_type(self, ctx:MyExprParser.Int_typeContext):
        pass


    # Enter a parse tree produced by MyExprParser#statement.
    def enterStatement(self, ctx:MyExprParser.StatementContext):
        pass

    # Exit a parse tree produced by MyExprParser#statement.
    def exitStatement(self, ctx:MyExprParser.StatementContext):
        pass


    # Enter a parse tree produced by MyExprParser#return_stat.
    def enterReturn_stat(self, ctx:MyExprParser.Return_statContext):
        pass

    # Exit a parse tree produced by MyExprParser#return_stat.
    def exitReturn_stat(self, ctx:MyExprParser.Return_statContext):
        pass


    # Enter a parse tree produced by MyExprParser#expression.
    def enterExpression(self, ctx:MyExprParser.ExpressionContext):
        pass

    # Exit a parse tree produced by MyExprParser#expression.
    def exitExpression(self, ctx:MyExprParser.ExpressionContext):
        pass


    # Enter a parse tree produced by MyExprParser#add_none.
    def enterAdd_none(self, ctx:MyExprParser.Add_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#add_none.
    def exitAdd_none(self, ctx:MyExprParser.Add_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#add_operate.
    def enterAdd_operate(self, ctx:MyExprParser.Add_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#add_operate.
    def exitAdd_operate(self, ctx:MyExprParser.Add_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#mul_none.
    def enterMul_none(self, ctx:MyExprParser.Mul_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#mul_none.
    def exitMul_none(self, ctx:MyExprParser.Mul_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#mul_operate.
    def enterMul_operate(self, ctx:MyExprParser.Mul_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#mul_operate.
    def exitMul_operate(self, ctx:MyExprParser.Mul_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#unary_none.
    def enterUnary_none(self, ctx:MyExprParser.Unary_noneContext):
        pass

    # Exit a parse tree produced by MyExprParser#unary_none.
    def exitUnary_none(self, ctx:MyExprParser.Unary_noneContext):
        pass


    # Enter a parse tree produced by MyExprParser#unary_operate.
    def enterUnary_operate(self, ctx:MyExprParser.Unary_operateContext):
        pass

    # Exit a parse tree produced by MyExprParser#unary_operate.
    def exitUnary_operate(self, ctx:MyExprParser.Unary_operateContext):
        pass


    # Enter a parse tree produced by MyExprParser#primaryInteger.
    def enterPrimaryInteger(self, ctx:MyExprParser.PrimaryIntegerContext):
        pass

    # Exit a parse tree produced by MyExprParser#primaryInteger.
    def exitPrimaryInteger(self, ctx:MyExprParser.PrimaryIntegerContext):
        pass


    # Enter a parse tree produced by MyExprParser#primaryParen.
    def enterPrimaryParen(self, ctx:MyExprParser.PrimaryParenContext):
        pass

    # Exit a parse tree produced by MyExprParser#primaryParen.
    def exitPrimaryParen(self, ctx:MyExprParser.PrimaryParenContext):
        pass


    # Enter a parse tree produced by MyExprParser#parameter.
    def enterParameter(self, ctx:MyExprParser.ParameterContext):
        pass

    # Exit a parse tree produced by MyExprParser#parameter.
    def exitParameter(self, ctx:MyExprParser.ParameterContext):
        pass


