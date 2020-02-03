package com.yedam.clsses;
//메소드 오버로딩 : 동일한 메소드 사용. 
public class MethodOverloadingExample {
	public static void main(String[] args) {
		int num= 10, num2 = 20;
		Student s1 = new Student();
		double d1 = 1.5, d2 = 2.3;
		System.out.println(s1);
		sum(d1,d2);
		print(sum(d1,d2));		//double받아서 실행할 수 있도록 메소드 정의필요
		print(sum(num, num2));	//int 받아서 실행할 수 있도록 메소드 정의 
			
	}
	static void print(double d) {
		System.out.println(d);
	}
	static void print (String str) {
		System.out.println(str);
	}
	static void print(int str) {
		System.out.println(str);
	}
	static int sum(int a, int b) {
		return a+b;
	}
	static double sum(double a , double b) {
		return a+b;
	}
	static double sum(int a , double b) {
		return a+b;
	}
	static double sum(double a , int b) {
		return a+b;
	}
	static int sum (int a , int b, int c) {
		return a+b+c;
	}
	
}
