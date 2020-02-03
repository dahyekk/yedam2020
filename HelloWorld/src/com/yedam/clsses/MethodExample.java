package com.yedam.clsses;

public class MethodExample {
	public static void main(String[] args) {
		Method m = new Method();
		m.setLeftField(30);
		m.setRightField(4);
		int result = m.thisSum() + m.thisMinus();
		int result2 = m.sum(20,10) * m.minus(30, 25);
		System.out.println("1필드의 계산결과"+ result);
		System.out.println("1두 매개값 계산결과 "+result2);
		m.setLeftField(100);
		m.setRightField(50);
		result = m.thisSum() + m.thisMinus();
		result2 = m.sum(20,10) * m.minus(30,2);
		System.out.println("필드의 계산결과"+ result);
		System.out.println("두 매개값 계산결과 "+result2);
				
	}
}
