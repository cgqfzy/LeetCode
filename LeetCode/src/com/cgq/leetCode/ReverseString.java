package com.cgq.leetCode;

import java.util.regex.Pattern;

/**
 * Given an input string, reverse the string word by word.
	For example,
	Given s = "the sky is blue",
	return "blue is sky the".
	Clarification:
		What constitutes a word?
			A sequence of non-space characters constitutes a word.
		Could the input string contain leading or trailing spaces?
			Yes. However, your reversed string should not contain leading or trailing spaces.
		How about multiple spaces between two words?
			Reduce them to a single space in the reversed string.
 * @author kkb
 *
 */
public class ReverseString {
	public String reverseWords(String s) {
        if (s == null){
            return null;
        }
        char[] chList = s.toCharArray();
        boolean isStringSpace = true;
        for (int i = 0; i < chList.length; i++) {
			if(chList[i] != ' '){
				isStringSpace = false;
				break;
			}
		}
        if (!isStringSpace) {
	        String[] strList = s.trim().split("[ ]+");
	        StringBuffer sBuffer = new StringBuffer();
	        for(int i = strList.length - 1 ; i >= 0; i-- ){
	            sBuffer.append(strList[i] + " ");
	        }
	        return sBuffer.toString().trim();
		}else{
			return "";
		}
		
	}
	
}
