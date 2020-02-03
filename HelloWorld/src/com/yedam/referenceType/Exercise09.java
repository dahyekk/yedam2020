package com.yedam.referenceType;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("학생수를 입력해주세요 > ");
				studentNum = scanner.nextInt();
				System.out.println("학생수는 "+studentNum+"명입니다");
				scores = new int[studentNum];
				break;
			case 2:
				System.out.println("점수를 입력해 주세요 > ");
				for (int i = 0; i <scores.length; i++) {
					System.out.println((i+1)+"번학생 :  ");
					scores[i]= scanner.nextInt();
				}
				break;
			case 3:
				System.out.println("*점수 리스트 *");
				for (int i = 0; i <scores.length; i++) {
					System.out.println((i+1)+"번학생 : "+scores[i]);
				}
				break;
			case 4:
				//최고점수, 평균점수 구하기
				int max = 0, sum = 0;
				double avg =0.0;
				for (int i = 0; i <scores.length; i++) {
					sum += scores[i];
					if (scores[i]>max) {
						max = scores[i];
					}
				}
				avg = (double) sum /scores.length;
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
