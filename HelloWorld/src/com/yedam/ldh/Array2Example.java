package com.yedam.ldh;

public class Array2Example {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		
		for(int i = 0; i<5; i++) {
			intAry[i] = i * 10 +10;
		}
		System.out.println("배열 범위안에서 값을실행.");
		for (int i = 0; i <5; i ++) {
			System.out.println(intAry[i]);
		}
		int[] intAry2 = new int[100];
		for(int i = 0; i <100; i ++) {
			intAry2[i] = (i+1)*5;
			//자리수맞추기
			System.out.printf( "%4d",intAry2[i]);
			if ((i+1)%5==0){
				System.out.println();
			}
			//i%5==4
			//intAry2[i]%25==0 
		}
	}
}
