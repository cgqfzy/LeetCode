package com.cgq.leetCode;

/**
 * Divide two integers without using multiplication, division and mod operator.
	If it is overflow, return MAX_INT.
 * @author cgqfzy
 *
 */
public class Problems_29 {

	/**
	 * 不使用移位的实现
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public int divide(int dividend, int divisor){
		if (divisor == 0){
			return Integer.MIN_VALUE;
		}
		boolean isMinus = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
		if (dividend < 0){
			dividend = - dividend;
		}
		if (divisor < 0){
			divisor = - divisor;
		}
		
		return isMinus ? -positiveDivide(dividend, divisor): positiveDivide(dividend, divisor);
	}
	/**
	 * 正整数除法
	 * @param dividend 被除数 >0
	 * @param divisor	除数 >0
	 * @return 相除结果
	 */
	public int positiveDivide(int dividend,int divisor){
		if (dividend < divisor){
			return 0;
		}
		int sum = divisor;
		dividend -= divisor;
		int result = 1;
		while (sum < dividend) {
			dividend -= sum;
			sum += sum;
			result += result;
		}
		return positiveDivide(dividend, divisor) + result;
	}
	
	/**
	 * 使用移位实现除法
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public int divideByShift(int dividend,int divisor){
		if( divisor ==0 ){
			return Integer.MAX_VALUE;
		}
		boolean isNeg = (dividend ^ divisor) >>> 31 == 1;
		int res = 0;
		if (dividend == Integer.MIN_VALUE) {
			dividend += Math.abs(divisor);//为什么呢？
			if (divisor == -1) {
				return Integer.MAX_VALUE;
			}
			res ++;
		}
		
		if (divisor == Integer.MIN_VALUE) {
			return res;
		}
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		int digit = 0;
		while(divisor <= ( dividend>>1 )){
			divisor <<= 1;
			digit ++;
		}
		
		
		while (digit >= 0) {
			if(dividend >= divisor){
				res += 1 << digit;
				dividend -= divisor;
			}
			divisor >>= 1;
			digit --;
		}
		
		return isNeg ? -res : res;
	}
}
