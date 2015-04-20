package com.cgq.leetCode;

import com.cgq.utils.MyPrint;

/**
 * @comment String to integer
 * @author cgqfzy
 * @version 1.0
 * @date Apr 13, 2015 2:27:52 PM
 */
public class StringToInteger {

	public int atoi(String str){
		if (str == null){
			return Integer.MIN_VALUE;
		}
		str = str.trim();
		if(str.length() == 0){
			return 0;
		}
		int result = 0;
		boolean isPositive = true;
		boolean isSignal = false;
		char first = str.charAt(0);
		if ('-' == first){
			isPositive = false;
			isSignal = true;
		}else if ('+' == first) {
			isSignal = true;
		}else if(!(first > '0' && first < '9')) {
			return Integer.MIN_VALUE;
		}
		int i = isSignal ? 1: 0;
		for (; i < str.length()	; i++) {
			char ch = str.charAt(i);
			if (!(ch > '0' && ch < '9')) {
				return Integer.MIN_VALUE;
			}
			int cur = ch - '0';
			if (cur > Integer.MAX_VALUE - result * 10 ){
				return Integer.MAX_VALUE;
			}
			result = result * 10 + cur;
		}
		return isPositive ? result : -result;
	}
	
	public static void main(String[] args) {
		MyPrint.print(new StringToInteger().atoi("+1"));
	}
}
