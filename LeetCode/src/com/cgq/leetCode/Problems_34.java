package com.cgq.leetCode;

import com.cgq.utils.MyPrint;

/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
	Your algorithm's runtime complexity must be in the order of O(log n).
	If the target is not found in the array, return [-1, -1].
	For example,
	Given [5, 7, 7, 8, 8, 10] and target value 8,
	return [3, 4].
 * @author cgqfzy
 *
 */
public class Problems_34 {

	public int[] searchRange(int[] array,int target){
		if (array.length == 1){
			if (array[0] == target){
				return new int[]{1};
			}else{
				return new int[]{-1,-1};
			}
		}
		
		int left = 0;
		int right = array.length - 1;
		int mid = 0;
		while(left <= right){
			mid = left + (right - left) /2;
			if(array[mid] == target){
				int pre = mid;
				MyPrint.print(mid);
				while(array[pre] == target){
					pre --;
				}
				int post = mid;
				while(array[pre] == target){
					pre ++;
				}
				return makeIndexArray(pre + 1, post -1);
				
			}else if (array[mid] > target) {
				right = mid -1;
			}else{
				left = mid + 1;
			}
		}
		
		return new int[]{-1,-1};
	}
	
	private int[] makeIndexArray(int start,int end){
		int[] res = new int[end - start + 1];
		for (int i = start; i <= end; i++) {
			res[i- start] = i;
		}
		return res;
	}
	
	
	public int findMinIndex(int[] array,int left,int right,int target){
		int mid = 0;
		while(left < right){
			mid = left + (right - left) / 2;
			if(array[mid] < target){
				right = mid -1;
			}else{
				left = mid;
			}
		}
		return left;
	}
	
}
