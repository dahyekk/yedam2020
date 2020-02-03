package com.yedam.common;


public class StudentExample {
	public static void main(String[] args) {
		for(int i = 0; i <args.length;i++)
			System.out.println(args[i]);
		com.yedam.clsses.Student stn = new com.yedam.clsses.Student();
		stn.study();
		com.yedam.referenceType.Student stn2 = new com.yedam.referenceType.Student();
		stn2.showMajor();
	}
}
