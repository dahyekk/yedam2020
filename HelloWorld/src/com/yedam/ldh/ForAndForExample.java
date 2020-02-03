package com.yedam.ldh;

public class ForAndForExample {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 1; i <=9 ; i++) {
			for (int j = 2; j<=9; j++) {
				//out.print -> 줄바꾸기 없음
				cnt++;
				System.out.print(j+" * "+i+" = "+i*j+"    ");
			}
			cnt=0;
			System.out.println();
		}
	}
}
