package com.cgq.leetCode;


public class MajorityElement {

	public int majorityElement(int[] num){
		int majorityElement = -1;
		int count = 0;
		for (int tmp : num) {
			if(tmp != majorityElement && count == 0){
				majorityElement = tmp;
				count ++;
			}else if (majorityElement != tmp && count > 0) {
				count --;
			}else{
				count ++;
			}
		}
		return majorityElement; 
	}
	
}
