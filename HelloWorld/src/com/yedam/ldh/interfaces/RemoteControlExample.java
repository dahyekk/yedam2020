package com.yedam.ldh.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnON();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnON();
		rc.turnOff();
		
		Television t1 = new Television();
		Audio a1 = new Audio();
		rc = t1;
		rc = a1;
	}
	
}
