package com.yedam.ldh.interfaces;

public class Audio implements RemoteControl {

	@Override
	public void turnON() {
		System.out.println("Audio를 킵니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

}
