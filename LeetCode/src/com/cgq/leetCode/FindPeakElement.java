package com.cgq.leetCode;

/**
 * A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 * @author cgqfzy
 *
 */
public class FindPeakElement {

	 public int findPeakElement(int[] array) {
		 return findPeak(array, 0, array.length -1);
	  }
	 
	 private int findPeak(int[] array,int start,int end){
		 if (start == end){
			 return start;
		 }
		 if (start + 1 == end){
			 return array[start] > array[end] ? start : end;
		 }
		 int mid = start + (end - start) /2;
		 if (array[mid] > array[mid -1] && array[mid] > array[mid +1]) {
			 return mid;
		 }else if (array[mid] > array[mid -1] && array[mid] < array[mid +1]) {
			return findPeak(array, mid + 1, end);
		}else{
			return findPeak(array, start, mid -1);
		}
	 }
	
}
