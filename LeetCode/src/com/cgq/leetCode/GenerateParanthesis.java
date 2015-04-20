package com.cgq.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @comment 
 * 	Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
	For example, given n = 3, a solution set is:
	"((()))", "(()())", "(())()", "()(())", "()()()"
 * @author cgqfzy
 * @version 1.0
 * @date Apr 15, 2015 8:39:11 PM
 */
public class GenerateParanthesis {

	public List<String> generateParenthesis(int n) {
        ArrayList<String> results = new ArrayList<>();
        if (n == 1){
        	results.add("()");
        	return results;
        }
        if(n == 2){
        	ArrayList<String> tmp = (ArrayList<String>) generateParenthesis(1);
        	for (String string : tmp) {
				results.add("(" + string + ")");
				results.add("()" + string);
			}
        	return results;
        }
        if(n == 3){
        	ArrayList<String> tmp = (ArrayList<String>) generateParenthesis(2);
        	for (String string : tmp) {
				results.add("(" + string + ")");
				results.add("()" + string);
			}
        	return results;
        }
		return null;
    }
	
	private void generatePatathesis(List<String> res,int n){
		
	}
}
