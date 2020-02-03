package com.yedam.clsses.extendPkg;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override //재정의
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location +"KumhoTire 수명 :"+(maxRotation-accumulateRotation)+" 회");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire 펑크 ***");
			return false;
		}
	}
}
