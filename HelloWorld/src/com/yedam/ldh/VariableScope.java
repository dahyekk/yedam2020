package com.yedam.ldh;

public class VariableScope {
	public static void main(String[] args) {
		int sum, var1 ;
		if (true) {
			int var2;
			var1=10;
			var2=20;
			sum = var1+var2;
			System.out.println("두수의 합은 : "+ sum);
		}
		
		System.out.println(var1);
//		System.out.println(var2); error,, var2는 if 안에 변수
		System.out.println(sum);
		sum=50;
		System.out.println(sum);
		
		//반복문
		for (int i = 0; i<5; i++) {
			var1 = var1+1;
			int var2 = 10;	
			System.out.println("var1 : " +var1+", var2: "+var2);
		}
//		System.out.println("var1 : " +var1+", var2: "+var2);
	}
}
