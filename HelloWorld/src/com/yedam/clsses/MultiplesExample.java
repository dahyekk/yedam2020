package com.yedam.clsses;

import java.util.Scanner;

//2, 3 배수 이외의 경우 기타
//종료 = 999
public class MultiplesExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int choice =0;
		while(true) {
			System.out.println("숫자를 입력하세요 \n[ 종료는 999 ] \n >");
			choice = scn.nextInt();
			if (choice == 999) 
				break;
			else if (choice%2==0 && choice%3 ==0) {
				System.out.println("2의배수이면서 3의배수입니다");
			}
			else if (choice%2 ==0)
				System.out.println("2의배수입니다.");
			else if (choice%3 ==0)
				System.out.println("3의배수입니다.");
			else
				System.out.println("기타");
		}
		System.out.println("종료");
	}
}
