package com.yedam.referenceType;

public class ArayMethodExample {
	public static void main(String[] args) {
		int[] intAry = {3,7,5,8,4};
//		System.out.println("배열의 길이 : "+intAry.length);
		int sum = 0;
//		for (int i = 0; i<intAry.length; i++) {
//			sum += intAry[i];
//		}
//		System.out.println("배열안의값의 합은  "+sum);
		
		sum = sumArrayMethod(intAry);
		System.out.println("합은 > "+sum);
		int[] intAry2 = {13,5,17,18,4};
		sum = sumArrayMethod(intAry2);
		System.out.println("합은 > "+sum);
		
		}
	//배열 요소의 합 계산하는 method.
	public static int sumArrayMethod(int[] ary) {
		int sum=0;
		for (int i = 0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}
