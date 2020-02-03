package com.yedam.clsses;
import java.util.Calendar;
import java.util.Scanner;
public class CalendarExample {
	static void createCal(int year, int mon) {
		Calendar cal = Calendar.getInstance();
		cal.set(year,mon,1);

		System.out.println(mon+1+"월은"+cal.getActualMaximum(Calendar.DAY_OF_MONTH)+"일");
		System.out.println("        *"+year+"년"+(mon+1)+"월*");
		String[] day = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		for(int i = 0; i < day.length; i ++) {
			System.out.print(" "+day [i]);
		}
		System.out.println("");
		for( int i = 0; i<cal.get(Calendar.DAY_OF_WEEK)-1;i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <=cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			System.out.printf("%4d",i);
			if ((cal.get(Calendar.DAY_OF_WEEK)-1+i)%7==0) {
				System.out.println();
			}
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int year , mon;
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("달력 조회하기");
			System.out.println("년 >");
			year = scn.nextInt();
			if (year==00) {
				break;
			}
			System.out.println("월 >");
			mon =scn.nextInt()-1;
			createCal(year,mon);
		}
		System.out.println("종료");
		
//		System.out.println("현재년도 "+cal.get(Calendar.YEAR));
//		System.out.println("현재 월 "+cal.get(Calendar.MONTH));
//		System.out.println("현재 일 "+cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일 "+cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("전체일수 : "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
}
