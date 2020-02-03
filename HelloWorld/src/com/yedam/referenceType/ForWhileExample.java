package com.yedam.referenceType;

import java.util.Scanner;

//1. 1차원 배열 (크기 10)
//2. 2차원 배열[5][5]
//3.야구게임
public class ForWhileExample {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			menu();
			int cnt = scn.nextInt();
			switch(cnt) {
			case 1: 
				method1();
				break;
			case 2:
			method2();
			break;
			case 3:
			method3();
			break;
			case 4:
				run = false;
			break;
			}
		}
	}
	public static void menu() {
		System.out.println("==============================");
		System.out.println("1. 1차원배열 2. 2차원배열 3. 야구게임 4.종료");
		System.out.println("==============================");
		System.out.println("실행하실 프로그램을 선택하세요 >");
	}
	public static void method1() {
		System.out.println("1차원배열크기 10으로생성");
		int[] ary= new int[10];
		for (int i = 0; i <10; i++) {
			ary[i]= i+1;
			System.out.printf("%3d",ary[i]);
			if (i % 5 ==4) {
				System.out.println();
			}
		}
	}
	public static void method2() {
		System.out.println("2차원 배열크기 [5][5]생성");
		int cnt = 1;
		int[][] ary = new int[5][5];
		for(int i = 0; i <ary.length;i++) {
			for (int j = 0; j<ary[i].length; j++) {
				ary[i][j] = cnt;
				cnt++;
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println("");
		}
		System.out.println("아래로 출력");
		for(int i = 0; i <ary.length;i++) {
			for (int j = 0; j<ary[i].length; j++) {
				System.out.printf("%3d",ary[j][i]);
			}
			System.out.println("");
		}
	}
	public static void method3() {
		System.out.println("  * 야구게임 *");
		boolean run = true;
		int[] ary = new int[3];
		int[] ary2 = new int[3];
		int s = 0, b = 0;
		for (int i =0; i < ary.length; i++) {
			ary [i] = (int)(Math.random()*5);
			System.out.println("숫자를 입력해주세요");
			ary2[i]= scn.nextInt();
		}
		for (int i = 0; i <ary.length; i++) {
			if (ary[i]==ary2[i]) {
				s++;
			}else {
				for (int j = 0; j<ary.length; j++) {
					if(ary[i]==ary2[j]) {
						b++;
				}
				}
			}
		}
		System.out.println(s+"Strke, "+b+"bol");
	}
}
