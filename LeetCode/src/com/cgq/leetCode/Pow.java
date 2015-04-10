package com.cgq.leetCode;

/**
 * Implement pow(x, n)
 * @author cgqfzy
 *
 */
public class Pow {

	/**
	 * 使用移位实现
	 * @param x
	 * @param n
	 * @return
	 */
	public double powShift(double x, int n){
		if(n < 0){
			n = - n ;
			x = 1 / x;
			//return pwoShift(1/x,-n) //测试用例 （1.0000,-2147483648)过不去
		}
		double result = 1;
		for (double f = x; n > 0 ; n = n >> 1) {
			if ( (n & 1) == 1){
				result *= f;
			}
			f = f * f;
		}
		return result;
	}
	
	/**
	 * 简单的递归，不考虑负数情况
	 * @param x
	 * @param n
	 * @return
	 */
	public double pow(double x ,int n){
		if (x == 0){
			return 0;
		}
		if (n == 0){
			return 1;
		}
		if(n == 1){
			return x;
		}
		double tmp = pow(x, n / 2);
		if (n % 2 == 0) {
			return tmp * tmp;
		}
		if (n % 2 == 0){
			return pow(x, n /2) * pow(x, n / 2);
		}else{
			return pow(x, (n - 1) / 2) * pow(x, (n - 1) / 2) * x;
		}	
	}
	/**
	 * 求正整数的二进制逆序表示
	 * @param num
	 * @return
	 */
	public String int2bit(int num){
		StringBuffer sBuffer = new StringBuffer();
		while(num > 0){
			sBuffer.append(num % 2);
			num = num >> 1;
		}
		return sBuffer.toString();
	}
	
}
