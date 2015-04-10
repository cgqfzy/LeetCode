package com.cgq.leetCode;
/**
 * alidate if a given string is numeric.
Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
Note: It is intended for the problem statement to be ambiguous. 
You should gather all requirements up front before implementing one.
 * @author cgqfzy
 *
 */
public class ValidNumber {

	public boolean isNumber(String s) {
		if (s == null){
			return false;
		}
		String str = s.trim();
		if (str.length() == 0){
			return false;
		}
		boolean isFloat = false;
		boolean isIndex = false;
		boolean isFirstZore = false;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= '1' && str.charAt(i) <= '9'){
				
			}else if ('0' == str.charAt(i)) {
				if (!isFirstZore){
					isFirstZore = true;
				}else{
					
				}
			}else if ('.' == str.charAt(i)) {
				if (!isFloat){
					isFloat = true;
				}else{
					return false;
				}
				
			}else if ('e' == str.charAt(i)) {
				if (!isIndex){
					isIndex = true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
		return true;
	}
}
