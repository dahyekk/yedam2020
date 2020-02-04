package com.yedam.clsses;
import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] input= new int[3];
		int[] answer = new int[3];
		for (int i = 0; i <answer.length; i++) {
			answer[i]= (int)(Math.random()*9)+1;
			for (int j = 0; j< answer.length; j ++) {
				if(answer[i]==answer[j])
					answer[i]++;
			}			
			System.out.println(answer[i]);			
		}
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			for ( int i = 0; i <input.length; i ++ ) {
				System.out.println(">");
				input[i] = scn.nextInt();
			}
			int strike= 0, ball = 0;
			for (int i = 0; i <input.length; i ++) {
				if(answer[i]==input[i]) {
					strike++;
				}else {
					for (int j = 0; j < input.length; j++) {
						if (answer[i]==input[j]) {
							ball++;
						}
					}
				}
//			for (int i = 0; i <input.length; i++) {
//				for (int j = 0; j<3; j++) {
//					if(answer[i]==input[j]) {
//						if(i==j) {
//							strike++;
//						}else {
//							ball++;
//						}
//					}
//				}
			}
			System.out.println(strike+"Strike"+ball+"ball");
			if(strike == input.length) {
				break;
			}
		}
		
	}
}
