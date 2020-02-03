package com.yedam.ldh;

public class StringExample {
	public static void main(String[] args) {
		System.out.println(3+5);
		System.out.println("두수의합은"+8+"입니다.");
		System.out.println(3+5+"입니다.");
		System.out.println("두수의합은"+3+5+"입니다");
		//앞에 문자가 있어서 3,5를 문자로 인식 괄호로 묶어줘야함
		System.out.println("두수의합은"+(3+5)+"입니다.");
		
		if ( 5%2!=0 ) {
			System.out.println(5%3+"입니다.");
		}
		int var1 = 10;

		if(var1%2==0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		int var3=30, var4=20;
		int biggerValue = 0;
		if(var3>var4) {
			biggerValue = var3;
		}else {
			biggerValue = var4;
		}
		System.out.println("큰수는 "+ biggerValue);
		//3항 연산자 (조건)? T : F
		biggerValue = (var3>=var4)? var3:var4;
		System.out.println("큰수는"+biggerValue);
	}
}
