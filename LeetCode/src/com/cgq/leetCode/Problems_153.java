package com.cgq.leetCode;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
 * @author cgqfzy
 *
 */
public class Problems_153 {

	public int findMin(int[] num) {
        if (num.length == 1){
            return num[0];
        }
        if (num[0] < num[num.length -1]){
            return num[0];
        }
        int left = 0;
        int right = num.length - 1;
        int mid = 0;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(num[mid] > num[left] ){
                left = mid + 1;
            }else {
                right = mid ;
            }
        }
        System.out.println(left);
        return num[left];
    }
	
}
