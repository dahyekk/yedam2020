package com.yedam.ldh;

public class ArrayExample {
	public static void main(String[] args) {
		//int배열타입
		int[] intAry = { 2,3,4,5};
		int[] int2Ary = new int[5];
		int2Ary[0] = 1;
		int2Ary[4] = 10;
		
//		int[] int3Ary = null;
//		int3Ary = new int[] {1,2,3}
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println("================");
		//int타입
		intAry[0]=20;
		intAry[1]=30;
		for (int i = 0; i <4; i++) {
			System.out.println(intAry[i]);
		}
		
		//intAry 에 10, 20, 30, 40 값 할당
		System.out.println("++++++++++++++++");
		int sum =0;
		for(int i = 0; i <4; i ++) {
			intAry[i]= (i+1)*10;
			System.out.println("intAry["+i+"]의 값은 "+intAry[i]);
			//sum = sum+intAry[i];
			sum += intAry[i];
		}		
		System.out.println("intAry 의총합은 = "+sum);
		
	}
}
