package com.yedam.referenceType;

import java.util.Scanner;

public class Exercise09_3 {
	static int studentNum = 0;
	static int[] scores = null;
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			printMenu();			
			int selecNo = scn.nextInt();
			switch(selecNo){
			case 1:
				 CreateStudent();
				break;
			case 2:
				InputScore();
				break;
			case 3:
				scoreList();
				break;
			case 4:
				analyScore();
				break;
			case 5:
				run = false;
				break;
			}
		}
	}
	public static void printMenu() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("---------------------------------------------------------------");
		System.out.println("선택 > ");
	}
	public static void CreateStudent() {
		System.out.println("학생수를 입력해주세요 > ");
		studentNum = scn.nextInt();
		System.out.println("학생수는 "+studentNum+"명입니다");
		scores = new int[studentNum];
	}
	public static void InputScore() {
		System.out.println("점수를 입력해 주세요 > ");
		for (int i = 0; i <scores.length; i++) {
			System.out.println((i+1)+"번학생 :  ");
			scores[i]= scn.nextInt();
		}
	}
	public static void scoreList() {
		System.out.println("*점수 리스트 *");
		if (studentNum==0) {
			System.out.println("학생이없습니다.");
		}else {
			for (int i = 0; i <studentNum; i++) {
				System.out.println((i+1)+"번학생 : "+scores[i]);
			}
		}
	}
	public static void analyScore() {
		int max = 0, sum = 0;
		double avg =0.0;
		for (int i = 0; i <studentNum; i++) {
			sum += scores[i];
			if (scores[i]>max) {
				max = scores[i];
			}
		}
		avg = (double) sum /studentNum;
		System.out.println("최고점수는 "+max+"점");
		System.out.println("평균점수는 "+avg+"점");
	}
}
