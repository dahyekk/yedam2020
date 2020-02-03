package com.yedam.ldh;

public class LoopExample {
	public static void main(String[] args) {
		//1~100수중에서 3의 배수이면서 7의 배수 출력
		// ||또는 &&그리고
		int i ;
		for (i=1;i<=100;i++) {
			if ( i %3 ==0 && i %7==0 ) {
				System.out.println(i);				
			}
		}
		// 3의배수랑 7배수 같이 출력
		i = 1;
		while(true) {
			if ( i %3 ==0 || i %7==0 ) {
				System.out.println(i);		
			}
			if (i >=100) {
				break;
			}
			i++;
		}
	}
}
