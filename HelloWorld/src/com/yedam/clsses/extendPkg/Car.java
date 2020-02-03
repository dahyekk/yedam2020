package com.yedam.clsses.extendPkg;

public class Car {
//	Tire frontLeft = new Tire("앞왼쪽",3);
//	Tire frontRight = new Tire ("앞오른쪽",7);
//	Tire backLeft = new Tire("뒤왼쪽",8);
//	Tire backRight = new Tire("뒤오른쪽",9);
	Tire[] tires = { new Tire("앞왼쪽",3),
					 new Tire("앞오른쪽",7),
					 new Tire("뒤왼쪽",8),
					 new Tire("뒤오른쪽",10)
				   };
	
	int run() {
		for (int i = 0; i <tires.length; i ++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
//		if(tires[0].roll()==false) {
//			stop();
//			return 1;
//		}
//		if(tires[1].roll()==false) {
//			stop();
//			return 2;
//		}if(tires[2].roll()==false) {
//			stop();
//			return 3;
//		}if(tires[3].roll()==false) {
//			stop();
//			return 4;
//		}
//		return 0;
//	}

}
