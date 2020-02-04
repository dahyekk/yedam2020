package com.yedam.clsses.extendPkg;

public class ComFriend extends Friend{
	private String company;
	
	public ComFriend(String name, String phone, String company) {
		super(name, phone);
		this.company = company;
	}

	@Override
	public void shoInfo() {
		System.out.println("회사 친구 이름 "+super.getName());
		System.out.println("회사 친구 번호 "+super.getPhone());
		System.out.println("친구의 회사 "+company);
	}
	
}
