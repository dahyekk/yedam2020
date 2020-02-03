package com.yedam.ldh;

public class WhileSumExample {
	public static void main(String[] args) {
		//1~100 수중에서 짝수의 합을 구하는 while
		int sum = 0;
		int i = 0;
		while (true) {
			if (i%2==0) {
				sum= sum+i;
			}
			if(i >=100) {
				break;
			}
			i++;
		}
		System.out.println("1~100까지 숫자중 짝수의합은 : "+sum);
		// 구구단 5단 출력하는 프로그램 (While)
		i = 1;
		sum = 5;
		System.out.println("   *"+sum+"단*");
		while(true) {
			System.out.println( sum +" * " +i+" = "+ sum*i );
			if(i>=9) {
				break;
			}
			i++;
		}
		
/*		int sum = 0;
		int i = 0;
		for (i=0; i <=5; i++) {
			sum = sum+i;
		}
		while(i<=5) {
			sum = sum+i;
			i++;
		}
		System.out.println("합계는 : "+sum);
 		sum = sum+1;
		sum = sum+2;
		sum = sum+3;
		sum = sum+4;
		sum = sum+5;
*/
	}
}
