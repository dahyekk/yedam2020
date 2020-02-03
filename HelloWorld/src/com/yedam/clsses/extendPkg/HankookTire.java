package com.yedam.clsses.extendPkg;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override //재정의
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location +"HankookTire 수명 :"+(maxRotation-accumulateRotation)+" 회");
			return true;
		}else {
			System.out.println("***"+location+"HankookTire 펑크 ***");
			return false;
		}
	}
}