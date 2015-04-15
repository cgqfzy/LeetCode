package com.cgq.leetCode;

import java.util.NoSuchElementException;

/**
 * @comment
 *  A message containing letters from A-Z is being encoded to numbers using the following mapping:
	
	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26
	Given an encoded message containing digits, determine the total number of ways to decode it.
	
	For example,
	Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
	
	The number of ways decoding "12" is 2.
 * @author cgqfzy
 * @version 1.0
 * @date Apr 14, 2015 5:31:37 PM
 */
public class DecodeWays {

	public int numDocodings(String s){
		s = s.trim();
		
		if (!isValid(s)) return 0;
		char[] chs = s.toCharArray();
		return numDecodings(chs,0,chs.length - 1);
	}

	private boolean isValid(String s){
		if (s.isEmpty()){
			return false;
		}
		boolean isZeroGreSeen = false;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
			if ('0' == ch){
				if (!isZeroGreSeen){
					return false;
				}
			}else {
				isZeroGreSeen = true;
			}
		}
		return true;
	}
	private int numDecodings(char[] chs, int begin,int end) {
		if (begin == end ){
			if(!(chs[begin] >= '0' && chs[begin] <= '9')){
				throw new NoSuchElementException("Illegal character");
			}
			if ('0' == chs[begin]) return 0;
			else return 1;
		}else if (end - begin == 1) {
			int val = (chs[begin] - '0') * 10 + chs[end] - '0';
			if (val > 26) return 1;
			else return numDecodings(chs, begin, begin) + numDecodings(chs, end, end);
		}else{
			int mid = begin + (end - begin) / 2;
			return numDecodings(chs, begin, mid) + numDecodings(chs, mid + 1, end);
		}
	}
	
	public static void main(String[] args) {
		DecodeWays dw = new DecodeWays();
		System.out.println(dw.numDocodings("01"));
	}
}

