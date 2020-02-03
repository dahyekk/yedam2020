package com.yedam.clsses;

public class StudentExample {
	public static void main(String[] args) {
		Student.major = "english";
		
		//student 인스턴스
		Student sn = new Student("chi",20,180,70); 
		Student stnt = new Student();             
		Student snt = new Student();
		System.out.println(snt.getAge());
		
		
		
//			 System.out.println(sn.name);
//			 System.out.println(sn.age);
//			 System.out.println(sn.height);
//			 System.out.println(sn.weight);
//		     stnt.name = "hong";
//		     stnt.age = 20;
//		     stnt.height = 170;
//		     stnt.weight = 65;
//		     System.out.println(stnt.name);
//		     System.out.println(stnt.age);
//		     System.out.println(stnt.height);
//		     System.out.println(stnt.weight);
//		     stnt.study();
//		     System.out.println(stnt.getAge());
//		     snt.name ="park";
//		     snt.age =25;
//		     snt.height =180;
//		     snt.weight=77;
//		     snt.study();
		     
	}
}
