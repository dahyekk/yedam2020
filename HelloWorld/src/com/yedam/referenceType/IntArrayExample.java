package com.yedam.referenceType;

public class IntArrayExample {
	public static void main(String[] args) {
		//3행 4열 [3][4]
		int[][] intAry = {{2,3,4,5},
							 {1,2,3,4},
							 {5,6,7,8}
							 };
		System.out.println("intAry 크기 : "+intAry.length);
		System.out.println("intAry[0]의 크기 : "+intAry[0].length);
		System.out.println("intAry[1]의 크기 : "+intAry[1].length);
		System.out.println("intAry[2]의 크기 : "+intAry[2].length);
		for (int i = 0; i<intAry.length;i++) {
			for (int j = 0; j<intAry[0].length; j++) {
				System.out.print(intAry[i][j]+" ");
			}
			System.out.println();
		}
	}
}
