grammar IR2asm;
import IR2asmLex;
program: main_fun;

main_fun: 'main' '{' instruction* '}';

instruction: push | ret | two_op | one_op;

push: 'PUSH' Integer;
ret: 'RET';
two_op:
	lor
	| land
	| eq
	| ne
	| lt
	| gt
	| le
	| ge
	| add
	| sub
	| mul
	| div
	| rem;
one_op: neg | bitwise | lnot;
lor: 'LOR';
land: 'LAND';
eq: 'EQ';
ne: 'NE';
lt: 'LT';
gt: 'GT';
le: 'LE';
ge: 'GE';
add: 'ADD';
sub: 'SUB';
mul: 'MUL';
div: 'DIV';
rem: 'REM';
neg: 'NEG';
bitwise: 'NOT';
lnot: 'LNOT';