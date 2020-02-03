package com.yedam.ldh;
import java.util.Scanner;

public class Excersice07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);
//		while(run) {
//			
//			System.out.println("========================");
//			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔액 | 4. 종료 ");
//			System.out.println("========================");
//			int menu = scn.nextInt();
//			if (menu == 1) {
//				System.out.println("예금액 입력 > ");
//				int inputAmt = scn.nextInt();
//				balance = balance+inputAmt;
//				System.out.println(inputAmt+"원이 입금되었습니다.\n잔액은 "+balance+"입니다.");
//			}else if (menu == 2) {
//				System.out.println("출금액 입력 >");
//				int outputAmt = scn.nextInt();
//				balance = balance - outputAmt;
//			}else if (menu == 3) {
//				System.out.println("잔액 > "+balance +" 원");
//			}else if (menu == 4) {
//				break;
//			}		
//		}
//		System.out.println("프로그램 종료 ");
		while(run) {
			System.out.println("========================");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔액 | 4. 종료 ");
			System.out.println("========================");
			int menu = scn.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("예금액 입력 > ");
				int inputAmt = scn.nextInt();
				balance = balance +inputAmt;
				break;
			case 2:
				System.out.println("출금액 입력 >");
				int outputAmt = scn.nextInt();
				balance = balance - outputAmt;
				break;
			case 3:
				System.out.println("잔액 > "+ balance+" 원");
				break;
			case 4:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
}
