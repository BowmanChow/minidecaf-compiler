# Generated from ./IR2asm/IR2asm.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .IR2asmParser import IR2asmParser
else:
    from IR2asmParser import IR2asmParser

# This class defines a complete generic visitor for a parse tree produced by IR2asmParser.

class IR2asmVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by IR2asmParser#program.
    def visitProgram(self, ctx:IR2asmParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#global_var.
    def visitGlobal_var(self, ctx:IR2asmParser.Global_varContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#func.
    def visitFunc(self, ctx:IR2asmParser.FuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#instruction.
    def visitInstruction(self, ctx:IR2asmParser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#globaladdr.
    def visitGlobaladdr(self, ctx:IR2asmParser.GlobaladdrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#store_reg.
    def visitStore_reg(self, ctx:IR2asmParser.Store_regContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#call.
    def visitCall(self, ctx:IR2asmParser.CallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#label.
    def visitLabel(self, ctx:IR2asmParser.LabelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#br.
    def visitBr(self, ctx:IR2asmParser.BrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#beqz.
    def visitBeqz(self, ctx:IR2asmParser.BeqzContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#bnez.
    def visitBnez(self, ctx:IR2asmParser.BnezContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#prologue.
    def visitPrologue(self, ctx:IR2asmParser.PrologueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#epilogue.
    def visitEpilogue(self, ctx:IR2asmParser.EpilogueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#frameaddr.
    def visitFrameaddr(self, ctx:IR2asmParser.FrameaddrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#load.
    def visitLoad(self, ctx:IR2asmParser.LoadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#store.
    def visitStore(self, ctx:IR2asmParser.StoreContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#pop.
    def visitPop(self, ctx:IR2asmParser.PopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#push.
    def visitPush(self, ctx:IR2asmParser.PushContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#ret.
    def visitRet(self, ctx:IR2asmParser.RetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#two_op.
    def visitTwo_op(self, ctx:IR2asmParser.Two_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#one_op.
    def visitOne_op(self, ctx:IR2asmParser.One_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#lor.
    def visitLor(self, ctx:IR2asmParser.LorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#land.
    def visitLand(self, ctx:IR2asmParser.LandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#eq.
    def visitEq(self, ctx:IR2asmParser.EqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#ne.
    def visitNe(self, ctx:IR2asmParser.NeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#lt.
    def visitLt(self, ctx:IR2asmParser.LtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#gt.
    def visitGt(self, ctx:IR2asmParser.GtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#le.
    def visitLe(self, ctx:IR2asmParser.LeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#ge.
    def visitGe(self, ctx:IR2asmParser.GeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#add.
    def visitAdd(self, ctx:IR2asmParser.AddContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#sub.
    def visitSub(self, ctx:IR2asmParser.SubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#mul.
    def visitMul(self, ctx:IR2asmParser.MulContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#div.
    def visitDiv(self, ctx:IR2asmParser.DivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#rem.
    def visitRem(self, ctx:IR2asmParser.RemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#neg.
    def visitNeg(self, ctx:IR2asmParser.NegContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#bitwise.
    def visitBitwise(self, ctx:IR2asmParser.BitwiseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by IR2asmParser#lnot.
    def visitLnot(self, ctx:IR2asmParser.LnotContext):
        return self.visitChildren(ctx)



del IR2asmParser