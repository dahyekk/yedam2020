package com.yedam.clsses;

public class studentArrayExample {
	static Student[] stdAry = new Student[3];
	public static void main(String[] args) {		
		//Student만 담을 수 있는 배열	
		Student stu1 = new Student("choi",20,180,70);
		 
		Student stu2= new Student();
	    stu2.setName("hong");
	    stu2.setAge(21);
	    stu2.setHeight(169);
	    stu2.setWeight(49);
	     
	    Student stu3 = new Student();
	    stu3.setName("kang");
	    stu3.setAge(34);
	    stu3.setHeight(174);
	    stu3.setWeight(63);
	    
	    stdAry[0]= stu1;
	    stdAry[1]= stu2;
	    stdAry[2]= stu3;
	    
	    for (int i = 0; i <stdAry.length; i++) {
	    	if (stdAry[i].getName().equals("hong")) {
	    	System.out.println(stdAry[i].getName() + " "+stdAry[i].getAge());
	    	}
	    }
	    Student s1 = getStudent("choi");
	    System.out.println(s1.toString());
	    
	}
	
	public static Student getStudent(String name) {
		Student st1 = null;
		 for (int i = 0; i <stdAry.length; i++) {
			 if(stdAry[i].getName().equals(name))
		    	return stdAry[i];
		 }
		 return st1;
	}

}
