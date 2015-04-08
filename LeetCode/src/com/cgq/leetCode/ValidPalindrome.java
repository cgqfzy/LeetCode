package com.cgq.leetCode;
/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
  判断是否是回文
 * @author cgqfzy
 *
 */
public class ValidPalindrome {

	
	public boolean isPalindrome(String str) {
		if (str == null || str.length() == 0){
			return true;
		}
		int lo = 0;
		int hi = str.length() - 1;
		while(lo < hi){
			// 非法字符   且 lo < hi 则跳过
			while(!isValidChar(str.charAt(lo)) && lo < hi){
				lo ++;
			}
			while(!isValidChar(str.charAt(hi)) && lo < hi){
				hi --;
			}
			if (hi >= 0 && lo < str.length() && !isSame(str.charAt(lo), str.charAt(hi))){
				return false;
			}
			lo ++;
			hi --;
		}
		return true;
    }
	
	private boolean isValidChar(char ch){
		if ((ch >= 'a' && ch <= 'z') || 
			(ch >= 'A' && ch <= 'Z') ||
			(ch >= '0' && ch <= '9')){
			return true;
		}
		return false;
	}
	
	private boolean isSame(char ch1,char ch2){
		if(ch1>='A' && ch1<='Z')  
	        ch1 = (char)(ch1-'A'+'a');  
	    if(ch2>='A' && ch2<='Z')  
	        ch2 = (char)(ch2-'A'+'a');  
	    return ch1==ch2;  
	}
}
