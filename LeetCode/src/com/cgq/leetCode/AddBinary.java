package com.cgq.leetCode;

import com.cgq.utils.MyPrint;

/**
 * @comment Given two binary strings, return their sum (also a binary string).
		For example,
		a = "11"
		b = "1"
		Return "100".
 * @author cgqfzy
 * @version 1.0
 * @date Apr 14, 2015 10:53:13 AM
 */
public class AddBinary {

	public String addBinary(String a,String b){
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}
		StringBuilder builder = new StringBuilder();
		int al = a.length();
		int bl = b.length();
		int maxl = al;
		int minl = bl;
		if(al < bl){
			maxl = bl;
			minl = al;
			String tmp = a;
			a = b;
			b = tmp;
		}
		for (int i = 0; i < maxl - minl; i++) {
			builder.append('0');
		}
		b = builder.append(b).toString();
		builder.setLength(0);
		int re = 0;
		int bi = 0;
		int ai = 0;
		for (int i = maxl - 1; i >= 0; i--) {
			ai = a.charAt(i) - '0';
			bi = b.charAt(i) - '0';
			switch (ai + bi + re) {
			case 0:
				builder.append('0');
				re = 0;
				break;
			case 1:
				builder.append('1');
				re = 0;
				break;
			case 2:
				builder.append('0');
				re = 1;
				break;
			default:
				builder.append('1');
				re = 1;
				break;
			}
		}
		if (re == 1){
			builder.append('1');
		}
		return builder.reverse().toString();
	}
	
	public String addBinary2(String a,String b){
		if(a == null || a.isEmpty()) {
            return b;
        }
        if(b == null || b.isEmpty()) {
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        StringBuilder stb = new StringBuilder();

        int i = aArray.length - 1;
        int j = bArray.length - 1;
        int aByte;
        int bByte;
        int carry = 0;
        int result;

        while(i > -1 || j > -1 || carry == 1) {
            aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
            bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
            result = aByte ^ bByte ^ carry;
            carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
            stb.append(result);
        }
        return stb.reverse().toString();
	}
	
	private String reverse(String str){
		char[] chs = str.toCharArray();
		char tmp = ' ';
		int N = chs.length;
		for (int i = 0; i < N / 2; i++) {
			tmp = chs[i];
			chs[i] = chs[N -i -1];
			chs[N -i -1] = tmp;
		}
		return new String(chs);
	}
	
	public static void main(String[] args) {
		String at = "11";
		String bt = "1";
		MyPrint.print(new AddBinary().addBinary(at, bt));
	}
}
