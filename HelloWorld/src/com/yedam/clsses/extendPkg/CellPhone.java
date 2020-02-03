package com.yedam.clsses.extendPkg;

public class CellPhone {
	private String model;
	private String color;
	//생성자
	public CellPhone() {
		
	}
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	//메소드 기능.
	void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendMessage(String message) {
		System.out.println("자신 : "+message);
	}
	void receiveMessage(String message){
		System.out.println("상대방 :" +message);	
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
