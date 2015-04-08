package com.cgq.leetCode;

import com.cgq.utils.MyPrint;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.

click to show more practice.

More practice:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * @author kkb
 *
 */
public class MaximumSubArray {

	public int maxSubArray(int[] array){
		int[] maxTmp = new int[array.length];
		maxTmp[0] = array[0];
		for (int i = 1; i < array.length; i++) {
			
			maxTmp[i] = Math.max(array[i], maxTmp[i-1] + array[i]);
		}
		int max = maxTmp[0];
		for (int i = 0; i < maxTmp.length; i++) {
			max = Math.max(max, maxTmp[i]);
		}
		return max;
	}
	
	
	public int maxSubArray1(int[] array){
		int maxSoFar = array[0];
		int maxCurrent = array[0];
		for (int i = 0; i < array.length; i++) {
			maxCurrent = Math.max(array[i], maxCurrent + array[i]);
			maxSoFar = Math.max(maxSoFar, maxCurrent);
		}
		
		return maxSoFar;
	}
}
