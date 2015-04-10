package com.cgq.other;

public class Test {

    public int hammingWeight(int n) {
    	System.out.println(n);
    	if (n < 0){
    		n = Integer.MAX_VALUE + n;
    	}
    	int count = 0;
        while (n != 0) {           // until all bits are zero
            if ((n & 1) == 1)     // check lower bit
                count++;
            n >>>= 1;              // shift bits, removing lower bit
        }
        return count;
    }

    public static void main(String[] args) {
		Test test = new Test();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(test.hammingWeight(-2^31));
	}
}
