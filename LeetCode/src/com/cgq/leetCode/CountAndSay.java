package com.cgq.leetCode;

import com.cgq.utils.MyPrint;

/**
 * @comment The count-and-say sequence is the sequence of integers beginning as follows:
		1, 11, 21, 1211, 111221, ...
		
		1 is read off as "one 1" or 11.
		11 is read off as "two 1s" or 21.
		21 is read off as "one 2, then one 1" or 1211.
		Given an integer n, generate the nth sequence.
		
		Note: The sequence of integers will be represented as a string.
 * @author cgqfzy
 * @version 1.0
 * @date Apr 14, 2015 5:05:52 PM
 */
public class CountAndSay {

	public String countAndSay(int n){
		String str = new Integer(n).toString();
		System.out.println(str);
		char[] chs = str.toCharArray();
		int preVal = chs[0] - '0';
		int val = preVal;
		int count = 1;
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < chs.length; i++) {
			val = chs[i] - '0';
			if (preVal == val) {
				count ++;
			}else {
				//记录
				builder.append(count);
				builder.append(preVal);
				preVal = val;
				count = 1;
			}
		}
		builder.append(count);
		builder.append(preVal);
		return builder.toString();
	}
	
	public static void main(String[] args) {
		CountAndSay cas = new CountAndSay();
		MyPrint.print(cas.countAndSay(1));
	}
	
}
