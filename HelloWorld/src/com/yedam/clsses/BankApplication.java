package com.yedam.clsses;
import java.util.Scanner;

public class BankApplication {
	//static Account[] acntAry = new Account[10];
	public static void main(String[] args) {
		Account[] acntAry = new Account[10];
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("=========================================================");
			System.out.println(" 1.계좌생성 2. 예금 3. 출금  4.계좌목록 5. 계좌조회 9.종료");
			System.out.println("=========================================================");
			System.out.println("선택 >");
			int selectNo = scn.nextInt();
			scn.nextLine();
			if(selectNo == 1) {//계좌생성
				System.out.println("계좌번호입력 : ");
				String ano = scn.nextLine();
				System.out.println("소유주 입력 : ");
				String owner = scn.nextLine();
				System.out.println("금액 입력 : ");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for (int i = 0; i<acntAry.length; i++) {
					if(acntAry[i]==null) {
						acntAry[i]= acnt;
						break;
					}
				}
			}else if (selectNo == 2) {//예금
				System.out.println("조회 계좌 입력");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo, acntAry);
				System.out.println("금액 입력 : ");
				int amount = scn.nextInt();
				acnt.setBalance(amount);
			}else if (selectNo == 3) {
				System.out.println("조회 계좌 입력");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo, acntAry);
				System.out.println("출금액 입력 : ");
				int amount = scn.nextInt();
				acnt.withdrawBalance(amount);
			}else if (selectNo == 4) {
				for (int i = 0; i < acntAry.length; i++) {
					if(acntAry[i]!=null) { //값이 있는경우만 출력
					System.out.println(acntAry[i]);
					}
				}
			}else if (selectNo == 5) {
				System.out.println("조회 계좌 입력");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo, acntAry);
				acnt.showInfo();
			}else if (selectNo == 9) {
				run = false;
			}
		}//end of while
	}//end of main()
	//매개값으로 배열 사용가능
	public static Account findAccount(String acntNo, Account[] ary){
		Account acnt = null;
		for (int i = 0; i <ary.length; i ++) {
			if( ary[i] != null && acntNo.equals(ary[i].getAno())) {
				acnt = ary[i];
			}
		}
		return acnt;
	}

}//end of class
