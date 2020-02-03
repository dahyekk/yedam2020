package com.yedam.ldh;

public class Exercise04 {
	public static void main(String[] args) {
		int num1, num2;
		
		while(true) {
			num1 = (int)(Math.random() * 6 )+1;
			num2 = (int)(Math.random() * 6 )+1;
			//빠져나오는조건
			
			if (num1+num2==5) {
				break;
			}
			System.out.println("("+num1+","+num2+")");
		}
	}
}
