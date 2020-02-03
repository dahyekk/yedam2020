package com.yedam.referenceType;

class Strong{
	int f1;
	String str;
	void print(){
		
	}
}
public class ReferencdTypeExample {
	public static void main(String[] args) {
		int num1 = 10;
		byte by1 = 10;
		by1 = (byte)num1;
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1.equals(str2));
		
//		Strong str = new Strong();
//		Strong str2 = new Strong();
//		str.f1=10;
//		str.str = "hello";
//		//위치값
//		System.out.println(str);
//		//안에 담긴값
//		System.out.println(str.f1);
//		System.out.println(str.str);
		
	}
}
