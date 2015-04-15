package com.cgq.leetCode;

/**
 * @comment Given a roman numeral, convert it to an integer. Input is guaranteed
 *          to be within the range from 1 to 3999.
 * @author cgqfzy
 * @version 1.0
 * @date Apr 13, 2015 3:17:45 PM
 */
public class RomanToInteger {

	public int romanToInt(String str) {
		int res = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (romanToInt(str.charAt(i)) < romanToInt(str.charAt(i + 1))) {
				res -= romanToInt(str.charAt(i));
			}else{
				res += romanToInt(str.charAt(i));
			}
		}
		return res + romanToInt(str.charAt(str.length() - 1));
	}

	private int romanToInt(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		default:
			return 1000;
		}
	}
}
