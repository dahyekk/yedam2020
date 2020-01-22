
public class HelloWorld {
	/*
	 * ctrl+/ 주석 단축키
	 * ctrl+d 라인삭제
	 * 여러라인 주석처리할때 사용 /**'
	 * 작성자 : 이다혜 2020.01.21
	 */
	public static void main (String[] args) {
		//변수(값을 담음) 지정.  type명 변수명 
		int age = 20;
		int year = 2020;
		
		// Hellow World 출력구문
		//sout ctrl space -> System.out.println 자동완성
		System.out.println("올해는" + year + "년");
		System.out.println("내 나이는" + age + "입니다.");
		System.out.println("Hello, World");
//		System.out.println("Hello, World"); 
		
		int height = 170;
		int weight = 65;
		int firstDayOfYear =1;
		int firstdayOfYear =2;
		
		int num1, num2, num3;
		num1=10;
		num2=20;
		
		int summary = num1+num2;
		
		long sum = 0;
		int firstValue = 2000000000;
		int secondValue = 1000000000;
		sum = (long)firstValue +secondValue;
		System.out.println("두수의 합은 : "+sum);
//		int 범위 -2147483648 ~ 2147483647
	}
}
