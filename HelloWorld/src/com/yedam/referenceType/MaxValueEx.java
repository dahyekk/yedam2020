package com.yedam.referenceType;

public class MaxValueEx {
	public static void main(String[] args) {
		int[] maxAry = {7,30,5,9,14,8,47};
		int max = 0;
		int min= maxAry[0];
		for (int i = 0; i<maxAry.length; i++){
			if(maxAry[i]>max) {
				max = maxAry[i];
			}
			if(maxAry[i]<min) {
				min = maxAry[i];
			}
		}
		System.out.println("최대값 > "+max);
		System.out.println("최소값 > "+min);
		int [] maxAry2 = { 9,19,101,500,37,45,55};
		max = getMaxValue(maxAry2);
		System.out.println("최대값 > "+max);
		min = getMinValue(maxAry2);
		System.out.println("최소값 > "+min);
		
	}
	public static int getMaxValue(int[] ary) {
		int max=0;
		for (int i = 0; i<ary.length; i++){
			if( ary[i] > max ) {
				max = ary[i];
			}
		}
		return max;
	}
	public static int getMinValue(int[] ary) {
		int min=ary[0];
		for (int i = 0; i<ary.length; i++){
			if(ary[i]<min) {
				min = ary[i];
			}
		}
		return min;
	}
}
