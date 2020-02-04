package com.yedam.clsses.abstractPck;

public abstract class Animal {
	//필드
	String kind;
	//기본생성자 존재.
	
	//메소드
	void breath() {
		System.out.println("숨을 쉰다.");
	}
	
	//추상메소드 -> 실체클래스에서 상속받았을때 구현.
	abstract void sound();
	abstract void sleep();
	
}
