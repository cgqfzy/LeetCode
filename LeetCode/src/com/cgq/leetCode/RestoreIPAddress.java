package com.cgq.leetCode;

import java.util.ArrayList;

/**
 * @comment
 * @author cgqfzy
 * @version 1.0
 * @date May 15, 2015 11:04:36 AM
 */
public class RestoreIPAddress {

	
	public ArrayList<String> restoreIPAddresses(String s){
		
		ArrayList<String> res = new ArrayList<String>();
		
		String item = new String();
		if(s.length() < 4 || s.length() > 12){
			return res;
		}
		dfs(s,0,item,res);
		return res;
	}

	/**
	 * 
	 * @param s
	 * @param start
	 * @param item
	 * @param res
	 */
	private void dfs(String s, int start, String item, ArrayList<String> res) {
		
		if(start == 3 && isValid(s)){
			res.add(item + s);
		}
		for(int i = 0; i < 3 && i < s.length() -1 ; i++){
			System.out.println(i + " -- " + start + " -- " + item);
			String subStr = s.substring(0, i+1);
			if(isValid(subStr)){
				dfs(s.substring(i+1, s.length()),start+1,item + subStr + '.' ,res);
			}
		}
	
	}

	/**
	 * 判断是否是合法的字符串
	 * @param s
	 * @return
	 */
	private boolean isValid(String s) {
		if(s.charAt(0) == '0'){
			return s.equals("0");
		}
		int num = Integer.parseInt(s);
		if(num < 255 && num > 0){
			return true;
		}else{
			return false;
		}
	}
	
}
