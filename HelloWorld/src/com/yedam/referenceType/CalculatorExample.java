package com.yedam.referenceType;

public class CalculatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		sum (num1, num2);
		minus(num1,num2);
		multi(55, 4);
		divide(10,7);
		print(7,"*");
		printStar(10,"+");
		int r = sum2(4,7);
		minus(r,7);
		
	}
	// int -> 반환값 == int
	public static int sum2(int a , int b) {
		int result ;
		result = a+b;
		return result;
	}
	//void ->  반환값 없음
	public static void print(int a, String str) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}
	public static void printStar(int a, String s) {
		for (int i = 0; i <a; i ++) {
			for (int j = 0; j<=i; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
	public static void sum(int a, int b) {
		int result = a+b;
		System.out.println("두수의 합은 : "+result);
	}
	public static void minus(int x, int y) {
		int result = x-y;
		System.out.println("두수의 차이는 : "+result);
	}
	public static void multi(int x, int y) {
		int result = x * y;
		System.out.println("두수의 곱은 : "+result);
	}
	public static void divide(int x, int y ) {
		double result = (double) x / y;
		System.out.println("두수를 나누면 : "+ result);
	}
}
