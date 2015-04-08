package com.cgq.leetCode;

import com.cgq.utils.MyPrint;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid. The brackets must close in the
 * correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * @author cgqfzy
 * 
 */
public class ValidParentheses {

	private static final int CAPACITY = 100;

	public boolean isValid(String s) {
		char[] cStack = new char[CAPACITY];
		int top = -1;
		char[] str = s.trim().toCharArray();
		if (str.length == 0) {
			return true;
		}
		cStack[++top] = ' ';
		char pre = ' ';
		for (char ch : str) {
			switch (ch) {
			case '(':
				cStack[++top] = ch;
				break;
			case ')':
				pre = cStack[top--];
				if ('(' != pre ){
					return false;
				}
				break;

			case '[':
				cStack[++top] = ch;
				break;

			case ']':
				pre = cStack[top--];
				if ('[' != pre ){
					return false;
				}
				break;
			case '{':
				cStack[++top] = ch;
				break;
			case '}':
				pre = cStack[top--];
				if ('{' != pre ){
					return false;
				}
				break;
			default:
				break;
			}
		}
		return top == 0;
	}
}
