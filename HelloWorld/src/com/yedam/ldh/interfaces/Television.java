package com.yedam.ldh.interfaces;

public class Television implements RemoteControl{

	@Override
	public void turnON() {
		System.out.println("TV를 킵니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

}
