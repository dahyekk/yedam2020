package com.yedam.clsses.extendPkg;

public class Child extends Parent{
	String field2;
	void method2() {
		System.out.println("자식 클래스의 메소드2");
	}
	@Override
	void method1() {
		System.out.println("자식 클래스의 메소드1");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
