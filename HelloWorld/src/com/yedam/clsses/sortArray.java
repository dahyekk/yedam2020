package com.yedam.clsses;
public class sortArray {
	public static void main(String[] args) {
		boolean run = true;
		int[] sortAry = {13, 55,7,43,50,11,1};
		int change = 0;
		System.out.println("정렬되기전 출력 ");
		for(int i = 0; i <sortAry.length; i ++) {
			System.out.printf("%3d",sortAry[i]);
		}
		//오름차순 정렬
		for (int i = 0; i <sortAry.length;i++) {
			for (int j = i; j<sortAry.length ;j++) {
				if (sortAry[i]>=sortAry[j]) {
					change = sortAry[i];
					sortAry[i] = sortAry[j];
					sortAry[j] = change;
				}
			}
		}
		System.out.println("\n오름차순정렬");
		for(int i = 0; i <sortAry.length;i++) {
			System.out.printf("%3d",sortAry[i]);
		}
		//내림차순 정렬
		for (int i = 0; i <sortAry.length;i++) {
			for (int j = i; j<sortAry.length ;j++) {
				if (sortAry[i]<=sortAry[j]) {
					change = sortAry[i];
					sortAry[i] = sortAry[j];
					sortAry[j] = change;
				}
			}
		}
		System.out.println("\n내림차순정렬");
		for(int i = 0; i <sortAry.length;i++) {
			System.out.printf("%3d",sortAry[i]);
		}
	}
}
