package com.yedam.ldh;

public class ForArrayExample {
	public static void main(String[] args) {
		// 1. 배열크기가 100인 배열 intAry (1~100값담기)
		int[] intAry = new int[100];  //생성시 0의값으로 초기화
		int sum= 0, sum2=0;
		for (int i = 0; i <100; i++) {
			intAry[i] = i+1;
			//배열 홀수번째 위치에 있는 값 합하는 구문.
			if ((i+1)%2==1) {
				sum += intAry[i];
			}
			if (intAry[i]%2==1) {
				sum2 += intAry[i];
			}
		}
		System.out.println(sum);
		System.out.println(sum2);
	}
}
