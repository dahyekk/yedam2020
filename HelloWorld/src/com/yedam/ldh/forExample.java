package com.yedam.ldh;

public class forExample {
	public static void main(String[] args) {
		for (int i = 0; i<26;i++) {
			char chr1 = (char)(65+i);
			System.out.println(chr1);
		}
		boolean trueOrFalse = false;
		if (3!=5) {
			System.out.println("참입니다.");
		}
/*
 * 	char chr = 65;
 * for(int i = 0; i<26; i++){
 * 	System.out.println(chr++);
 * }
 */
		int sum = 0;
/*		sum = sum+1;
		sum = sum+2;
		sum = sum+3;
		sum = sum+4;
		sum = sum+5;
*/
		for ( int i = 1; i<=100; i++) {
			if (i%2==0) 
				sum = sum+i;
			System.out.println(i+", "+sum);
		}
//		System.out.println("1~100 중짝수들의 합 : "+sum);
		
		int varl = 5;
		for (int i = 1; i<10; i++) {
			System.out.println(varl +" * "+i+" = "+varl*i);
		}
		
	}
}
