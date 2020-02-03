package com.yedam.referenceType;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] ary = {
				{95,96},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i<ary.length; i++) {
			for(int j = 0; j<ary[i].length;j++) {
				sum += ary[i][j];
			}
			avg +=ary[i].length;
		}
		avg = sum/avg;
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
	}
}
