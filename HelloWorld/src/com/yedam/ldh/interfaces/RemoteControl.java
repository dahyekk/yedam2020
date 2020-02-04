package com.yedam.ldh.interfaces;

public interface RemoteControl {
	//필드 (기본적 public, static 필드명 대문자)
	//final = 한번설정하면 바꿀 수 없음.(상수필드)
	public static final int MAX_VOLUM = 10;
	int MIN_VOLUME = 0;
	//생성자 (X)
	
	//(추상)메소드
	public abstract void turnON();
	public void turnOff();
	
}
