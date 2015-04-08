package com.cgq.leetCode;


/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * http://en.wikipedia.org/wiki/Reverse_Polish_notation
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * Some examples:
	  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
	  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * @author kkb
 *
 */
public class ReversePolishNotation {

	private static final int MAX_NUM_STACK = 100;
	public int evalRPN(String[] tokens){
		if(tokens.length == 1){
			try {
				return Integer.parseInt(tokens[0]);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				return -1;//表示输入错误
			}
		}
		//记录操作数的栈
		int[] numStack = new int[MAX_NUM_STACK];
		//指向栈顶位置
		int stackPointer = 0;
		int tmp  = 0;
		int numPost = 0;
		int numPre = 0;
		
		for (int i = 0; i < tokens.length; i++) {
			//是操作符
			if(tokens[i] == "*" || tokens[i] == "/" || tokens[i] == "+" || tokens[i] == "-"){
				if(stackPointer < 2){
					return -1;//输入错误
				}else{
					
					switch (tokens[i].charAt(0)){
						case '*':
							tmp = numStack[--stackPointer] * numStack[--stackPointer];
							numStack[stackPointer++] = tmp;
							break;
						case '-':
							numPost = numStack[--stackPointer];
							numPre = numStack[--stackPointer];
							tmp = numPre - numPost;
							numStack[stackPointer++] = tmp;
							break;
						case '+':
							tmp = numStack[--stackPointer] + numStack[--stackPointer];
							numStack[stackPointer++] = tmp;
							break;
						case '/':
							numPost = numStack[--stackPointer];
							numPre = numStack[--stackPointer];
							if (numPost == 0){
								throw new ArithmeticException("/ by zore");
							}
							tmp = numPre / numPost;
							numStack[stackPointer++] = tmp;
							break;
						default:
							return -1;//输入错误
					}
				}
				
			}else{
				//是数字，直接入栈
				numStack[stackPointer++] = Integer.parseInt(tokens[i]);
			}
		}
		if (stackPointer == 1){
			return numStack[--stackPointer];
		}else{
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		ReversePolishNotation rpn = new ReversePolishNotation();
		System.out.println(rpn.evalRPN(new String[]{"0","3","/"}));
	}
}
