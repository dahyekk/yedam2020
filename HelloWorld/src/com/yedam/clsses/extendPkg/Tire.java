package com.yedam.clsses.extendPkg;

public class Tire {
	public int maxRotation; 		//최대 회전수.
	public int accumulateRotation; 	//누적 회전수.
	public String location;			//바퀴위치 (왼앞/오앞/왼뒤/오뒤)
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location= location;
		this.maxRotation = maxRotation;
	}
	//메소드
	public boolean roll() {	//타이어회전
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location +"Tire 수명 :"+(maxRotation-accumulateRotation)+" 회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크 ***");
			return false;
		}
	}
}
