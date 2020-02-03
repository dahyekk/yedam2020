package com.yedam.clsses;

public class People {
//필드
	String name;
	int age;
	String job;
	String address;
	
//생성자
	People(){
		
	}
	People(String name, int age, String job,String address ){
		this.name = name;
		this.age = age;
		this.job = job;
		this.address = address;
	}
//메소드
	void pInformation() {
		System.out.println("이름은 "+name);
		System.out.println("나이는 "+age);
		System.out.println("직업은 "+job);
		System.out.println("주소는 "+address);
	}
	String returnName() {
		return name; 
	}
	int returnAge() {
		return age;
	}
	String retrunJob() {
		return "직업은" + job;
	}
	
}
