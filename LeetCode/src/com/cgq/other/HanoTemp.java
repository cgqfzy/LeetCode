package com.cgq.other;

public class HanoTemp {

	public static void hanio(char cola,char colb,char colc, int n){
		if (n ==1){
			move(cola, colc);
			return;
		}
		hanio(cola, colc, colb, n - 1);
		move(cola, colc);
		hanio(colb, cola, colc, n - 1);
	}
	
	public static void move(char cola,char colb){
		System.out.println(cola + "-->" + colb);
	}
	public static void main(String[] args) {
		hanio('A', 'B', 'C', 1);
	}
}
