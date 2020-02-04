package com.yedam.clsses.extendPkg;

public class Friend {
	//필드
	private String name;
	private String phone;
	//생성자
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	public void shoInfo() {
		System.out.println("이름  : "+this.name);
		System.out.println("연락처: "+this.phone);
	}
	
}
