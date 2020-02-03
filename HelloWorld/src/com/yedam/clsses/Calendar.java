package com.yedam.clsses;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("월을입력하세요");
			int month = scn.nextInt();
			if (month >12)
				break;	
			createCal(month);
			System.out.println("");
		}
	}
	static void createCal(int month) {
		String[] day = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		int days = getMonthDay(month);
		int start = getFirstDay(month);
		System.out.println(month+"월은"+days+"일");
		//요일 출력
		for(int i = 0; i < day.length; i ++) {
			System.out.print(" "+day [i]);
		}
		System.out.println();
		//첫째 위치찾기(앞에 공백 배치)
		for( int i = 0; i<start-1;i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <=days; i++) {
			System.out.printf("%4d",i);
			if ((start-1+i)%7==0) {
				System.out.println();
			}
		}
	}
	//2020년 1 ,2,3,4 월에 해당하는 첫째날의 요일
	//일 = 1, 월 = 2, 화 = 3, ~ 토=7
	//1월 = 수 
	static int getFirstDay(int mon) {
		switch(mon) {
		case 1:	//1월은 수요일날 시작
			return 4;
		case 2:	//2월은 화요일날 시작
			return 7;
		case 3:	//3월은 일요일날시작
			return 1;
		case 4:	//4월은 수요일날 시작
			return 4;	
		case 5:
			return 6;
		case 6:
			return 2; 
		default :
			return 0; 
		}
		
	}
	//월 입력 하면 해당월의 날짜를 반환해주는 메소드.
	//1,3,5,7,8,10,12 =31 2=28 4,6,9,11=30
	static int getMonthDay(int mon) {
		if((mon<=7 && mon%2==1)||(mon>=8 && mon%2==0))
			return 31;
		else if (mon == 2)
			return 28;
		else
			return 30;
//		if (mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
//			return 31;
//		else if (mon == 2)
//			return 28;
//		else
//			return 30;

	}
}
