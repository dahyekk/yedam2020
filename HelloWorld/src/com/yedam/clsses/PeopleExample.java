package com.yedam.clsses;

public class PeopleExample {
	public static void main(String[] args) {
		People p1 = new People();
		p1.name="이모";
		p1.age =42;
		p1.job="의사";
		p1.address="강원도";
		p1.pInformation();
		System.out.println(p1.returnName()+"는"+p1.returnAge()+"살");
		
		People p2 = new People();
		p2.pInformation();
		People p3 = new People("zone",32,"백수","부산");
		p3.pInformation();
	}	
}
