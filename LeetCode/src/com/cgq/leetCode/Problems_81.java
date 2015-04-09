package com.cgq.leetCode;

public class Problems_81 {

	public boolean search(int[] array, int target) {
		// find the pivot
		int pivot = findPivot(array, 0, array.length - 1);
		System.out.println(pivot);
		int left = 0;
		int right = array.length - 1;
		if (pivot != -1){
			if (target < array[left]) {
				left = pivot;
			} else if (target > array[left]) {
				right = pivot - 1;
			} else {
				return true;
			}
		}
		int mid = 0;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return true;
			} else if (array[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}

	public int findPivot(int[] array,int start,int end){
		if (start == end){
			return -1;
		}
		
		if (start + 1 == end){
			if (array[start] > array[end]){
				return end;
			}
			return -1;
		}
		int mid = start + (end - start) / 2;
		if (array[mid] > array[end]){
			return findPivot(array, mid, end);
		} 
		if (array[mid] < array[end]){
			return findPivot(array, start, mid);
		}
		int p = findPivot(array, start, mid);
		int q = findPivot(array, mid, end);
		if (p == -1){
			return q;
		}
		if (q == -1){
			return p;
		}
		return -1;
	}
	
}
