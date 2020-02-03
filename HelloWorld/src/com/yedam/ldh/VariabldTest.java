package com.yedam.ldh;

public class VariabldTest {
	public static void main(String[] args) {
		int sum, num1, num2;
		double avg;
		num1 = 15;
		num2 = 34;
		sum = num1+num2;
		avg = (double)sum/2;
//		== avg = sum/2.0;
		System.out.println("두수 "+num1+" 과"+num2+" 의 합은 "+avg+" 입니다");
		System.out.println("두수의 평균은"+avg);
		
//		int num1, num2;
//		num1 = 20;
//		num2 = 35;
//		System.out.println("두수"+num1+"과"+num2+"의 합은"+ (num1+num2));
//		System.out.println("두수의평균은 "+(num1+num2)/2.0);
	}
}