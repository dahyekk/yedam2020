package com.yedam.clsses.extendPkg;

public class DmbCellPhone extends CellPhone{
	int channel;
	public DmbCellPhone() {//Default부모값의 생성자 땡겨옴.
		super();
	}
	public DmbCellPhone( String model, String color,int channel) {
		super(model, color);//부모를 가르킴-> CellPhone의 매개값2개인 생성자 호출.
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널 : "+channel+" 번 DMB방송 수신.");
	}
	void changeChannel(int channel) {
		System.out.println("채널"+channel +"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DBM 수신종료.");
	}
	
}
