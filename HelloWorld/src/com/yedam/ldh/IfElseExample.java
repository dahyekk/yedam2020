package com.yedam.ldh;
//ctl+shift+enter 줄정렬

public class IfElseExample {
	public static void main(String[] args) {
		int result = 98;
		if (result>=90) {
			if(result>=95) {
			System.out.println("A+학점");
			}else {
				System.out.println("A학점");
			}
		}else if (result>=80) {
			if(result>=85) {
			System.out.println("B+학점");
			}else
			{
				System.out.println("B학점");
			}
		}else if (result>=70) {
			if(result >=75) {
				System.out.println("C+학점");
			}else {
				System.out.println("C학점");
			}
		}else {
			System.out.println("F학점");
		}
	}
}
