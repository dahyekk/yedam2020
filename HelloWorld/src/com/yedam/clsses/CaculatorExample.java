package com.yedam.clsses;

import java.util.Scanner;

public class CaculatorExample {
	public static void main(String[] args) {
		Caculator.cal(4, 5, "*");
		
		Caculator c1 = new Caculator();
		Scanner scn = new Scanner(System.in);
		while(true){
			System.out.println("사칙연산 부호 : +, - , * , / \n q:종료");
			String opertor = scn.nextLine();
			if (opertor.equals("q")) 
				break;
			System.out.println("첫번째 수 입력 : ");
			int num1 = scn.nextInt();
			System.out.println("두번째 수 입력 : ");
			int num2 = scn.nextInt();
			scn.nextLine();
			c1.cal(num1,num2,opertor);
		}
		System.out.println("종료.");
	}
}
