package com.yedam.referenceType;

import java.util.Scanner;

public class Exercise09_2 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int cnt = 0;
		int[] scores =new int[30];
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("학생수는 "+studentNum+"명");
				break;
			case 2:
				System.out.println("입력하실 학생수를 입력해주세요 \n(최대학생수는 30명)\n>");
				cnt = scanner.nextInt();
				System.out.println("입력하실 학생수는 "+cnt+"명");
				for (int i =0; i<cnt;i++) {
					System.out.println(i+1+"번째 학생 :");
					scores[studentNum]= scanner.nextInt();
					studentNum++;
				}
				break;
			case 3:
				System.out.println("*점수 리스트 *");
				if (studentNum==0) {
					System.out.println("학생이없습니다.");
				}else {
					for (int i = 0; i <studentNum; i++) {
						System.out.println((i+1)+"번학생 : "+scores[i]);
					}
				}
				break;
			case 4:
				//최고점수, 평균점수 구하기
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
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료 ");
		
	}
}
