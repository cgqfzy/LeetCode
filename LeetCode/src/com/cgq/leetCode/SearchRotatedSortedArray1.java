package com.cgq.leetCode;

import com.cgq.utils.MyPrint;

/**
 * @author cgqfzy
 *
 */
public class SearchRotatedSortedArray1 {

	/**
	 * 先查询中间转折点
	 * @param A
	 * @param target
	 * @return
	 */
	public int search(int[] A, int target) {
        if (A.length == 0){
            return -1;
        }
        if (A.length == 1){
            return A[0] == target ? 1 : -1;
        }
        //先寻找pivot位置
        
        int left = 0;
        int right = A.length - 1;
        int mid= 0;
        int pivot = 0;
        if (A[0] > A[A.length - 1 ]){
        	while (left < right){
            	mid = left + (right - left) / 2;
                if (A[mid] > A[right]){
                    left = mid + 1;
                }else if (A[mid] < A[right]){
                    right = mid - 1;
                }
            }
        	pivot = left;
        }
        MyPrint.print(pivot);
        if (target < A[0]){
            left = pivot;
            right = A.length - 1;
        }else{
            left = 0;
            right = pivot - 1;
        }
        mid = 0;
        while(left <= right){
           mid = left + (right - left) / 2;
           if(A[mid] == target){ //一定先做等于号的判断
        	   return mid;
               
           }else if(A[mid] > target){
               right = mid -1;
           }else{
        	   left = mid + 1;
           }
        }
        return -1;
    }
}
