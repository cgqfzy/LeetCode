package com.cgq.leetCode;

/**
 * There are two sorted arrays A and B of size m and n respectively. 
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * @author cgqfzy
 *
 */
public class Problems_4 {

	public double findMedianSortedArrays(int A[],int B[]){
		int length = A.length + B.length;
		if (length % 2 == 1) {
			return findMedianSortedArrays(A, 0 , A.length , B ,0 ,B.length, length/2 + 1);
		}else{
			return (findMedianSortedArrays(A, 0, A.length, B, 0, B.length, length/2 + 1) 
				+ findMedianSortedArrays(A, 0, A.length, B, 0, B.length, length / 2)) / 2;
		}
	}

	private double findMedianSortedArrays(int[] A, int aStart, int aEnd, int[] B,
			int bStart, int bEnd,int position) {
		if ((aEnd - aStart) > (bEnd - bStart)){
			return findMedianSortedArrays(B, bStart, bEnd, A, aStart, aEnd,position);
		}
		if (aEnd - aStart == 0) {
			return B[bStart + position - 1];
		}
		if (position == 1){
			return A[aStart] < B[bStart] ? A[aStart] : B[bStart];
		}
		int aPosition = (aEnd - aStart) < (position/2) ? (aEnd - aStart) : (position/2);
		int bPosition = position - aPosition;
		if (A[aStart + aPosition - 1] == B[bStart + bPosition -1]){
			return A[aStart + aPosition -1];
		}else if (A[aStart + aPosition -1] < B[bStart + bPosition -1]) {
			return findMedianSortedArrays(A, aStart + aPosition, aEnd, 
					B, bStart, bEnd, position - aPosition);
		}else {
			return findMedianSortedArrays(A, aStart, aEnd, 
					B, bStart + bPosition, bEnd, position - bPosition);
		}
	}
	
	
}
