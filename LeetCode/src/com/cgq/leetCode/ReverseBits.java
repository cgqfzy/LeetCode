package com.cgq.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @comments Reverse bits of a given 32 bits unsigned integer.
	For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
	Follow up:
	If this function is called many times, how would you optimize it?
 * @author cgqfzy
 * @version 1.0 
 * @date 2015年4月9日 下午11:53:15
 */
public class ReverseBits {

	public int solution(int n){
		int result = 0;
		for (int i = 0; i < 32; i++) {
			result += n & 1;
			n >>>= 1;
			if (i < 31){
				result <<= 1;
			}
		}
		return result;
	}
	
	//used for cache
	// divide the 32-bit int into 8-bit byte 
	private Map<Byte, Integer> cache = new HashMap<>();
	public int reverseBits(int n){
		byte[] bs = new byte[4];
		for (int i = 0; i < bs.length; i++) {
			bs[i] = (byte)((n >>> (i * 8)) & 0xFF);
		}
		int result = 0;
		for (int i = 0; i < bs.length; i++) {
			result += reverseByte(bs[i]);
			if (i < 3){
				result <<= 8;
			}
		}
		return result;
	}
	/**
	 * get reversed byte value
	 * @param b
	 * @return
	 */
	private int reverseByte(byte b) {
		Integer value = cache.get(b);
		if (value != null){
			return value;
		}
		value = 0;
		for(int i = 0; i < 8 ; i++){
			value += ((b >>> i) & 1);
			if (i < 7){
				value <<= 1;
			}
		}
		cache.put(b, value);
		return value;
	}
}
