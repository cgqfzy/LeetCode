package com.cgq.leetCode;

/**
 * Implement int sqrt(int x).

Compute and return the square root of x.
 * @author cgqfzy
 *
 */
public class Sqrt {

	public int mySqrt(int x){
		if (x ==0 || x == 1){
			return x;
		}
		int left = 1;
		int right = x;
		int mid = 0;
		int res = 0;
		while(left <= right){
			mid = left + (right -left) / 2;
			if (mid < x / mid){
				left = mid + 1;
				res = mid;
			}else {
				mid = right -1;
			}
		}
		
		return res;
	}
}
