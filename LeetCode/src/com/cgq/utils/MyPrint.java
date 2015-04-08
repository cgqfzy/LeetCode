package com.cgq.utils;

public class MyPrint {

	public static void printArray(int[] array){
		StringBuffer sBuffer = new StringBuffer("[ ");
		for (int i = 0; i < array.length; i++) {
			sBuffer.append(array[i] + " ");
		}
		sBuffer.append("]");
		System.out.println(sBuffer.toString());
	}
	
	public static void printArray(double[] array){
		StringBuffer sBuffer = new StringBuffer("[ ");
		for (int i = 0; i < array.length; i++) {
			sBuffer.append(array[i] + " ");
		}
		sBuffer.append("]");
		System.out.println(sBuffer.toString());
	}
	
	
	public static void print(Object object){
		System.out.println(object.toString());
	}
	
}
