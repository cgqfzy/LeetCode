package com.cgq.leetCode;
/**
 * 
 * @author kkb
 *	@function
 *	Find the contiguous subarray within an array (containing at least one number) which has the largest product.
	For example, given the array [2,3,-2,4],
	the contiguous subarray [2,3] has the largest product = 6.
 */
public class ContiguousLargestProduct {
	/**
	 * 求数组的连续最大面积
	 * @param A
	 * @return 数组A的连续最大面积
	 */
	public int maxProduct(int[] A){
		if (A.length == 1){
			return A[0];
		}
//		int minProduct =0;
		int maxProduct = 0;
		int minCurrent = 0,maxCurrent = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] < 0){
				//注意赋值的顺序
				int tmpMaxCurrent = maxCurrent;
				int tmpMinCurrent = minCurrent;
				//记录下最大的值
				maxCurrent = Math.max(A[i], tmpMinCurrent * A[i]);
				//记录下最小的值
				minCurrent = Math.min(A[i], tmpMaxCurrent * A[i]);
//				minProduct = Math.min(minCurrent, minProduct);
				
				maxProduct = Math.max(maxCurrent, maxProduct);
				
			}else if(A[i] > 0){
				//记录下最小的值
				minCurrent = Math.min(A[i], minCurrent * A[i]);
//				minProduct = Math.min(minCurrent, minProduct);
				//记录下最大的值
				maxCurrent = Math.max(A[i], maxCurrent * A[i]);
				maxProduct = Math.max(maxCurrent, maxProduct);
			}else {
				minCurrent = 0;
				maxCurrent = 0;
			}
			
		}
		return maxProduct;
	}

	
	public static void main(String[] args) {
		ContiguousLargestProduct solution = new ContiguousLargestProduct();
		int[] testArray = {7,-2,-4};
		System.out.println(solution.maxProduct(testArray));
	}
}

/**
	Input:	[-2,3,-4]
	Expected:	24
	Input:	[-2,0,-1]
	Expected:	0
	Input:	[-2]
	Expected:-2
	Input:	[7,-2,-4]
	Expected:	56
 * 
 */