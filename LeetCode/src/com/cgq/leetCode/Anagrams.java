package com.cgq.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * @comment
 * 	Given an array of strings, return all groups of strings that are anagrams.
	Note: All inputs will be in lower-case.
 * @author cgqfzy
 * @version 1.0
 * @date Apr 14, 2015 2:55:27 PM
 */
public class Anagrams {

	public List<String> anagrams(String[] strs){
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> result = new ArrayList<>();
		String tmp = null;
		ArrayList<String> list = null;
		for (String str : strs) {
			tmp = sort(str); 
			if(!map.containsKey(tmp)){
				list = new ArrayList<>();
				list.add(str);
				map.put(tmp, list);
			}else{
				list = map.get(tmp);
				list.add(str);
			}
		}
		
		for (ArrayList<String> res : map.values()) {
			if (res.size() >= 2) {
				result.addAll(res);
			}
		}
		return result;
	}

	private String sort(String str) {
		char[] chs = str.toCharArray();
		Arrays.sort(chs);
		return new String(chs);
	}
	
}
