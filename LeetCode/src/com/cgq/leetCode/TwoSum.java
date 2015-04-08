package com.cgq.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
	The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

	You may assume that each input would have exactly one solution.

	Input: numbers={2, 7, 11, 15}, target=9
	Output: index1=1, index2=2
 * @author cgqfzy
 *
 */
public class TwoSum {

	public int[] twosSum(int[] numbers,int target){
		
		Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			indexMap.put(numbers[i], i + 1);	
		}
		for (int i = 0; i < numbers.length; i++) {
			int search = target - numbers[i];
			if (indexMap.containsKey(search) && (i +1) != indexMap.get(search)) {
				return new int[]{Math.min(i+1, indexMap.get(search)),Math.max(i+1, indexMap.get(search))};
			}
		}
		return null;
	}
}
