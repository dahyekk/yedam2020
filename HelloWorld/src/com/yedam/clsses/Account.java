package com.yedam.clsses;

public class Account {
	
	//필드
	private String ano;
	private String owner;
	private int balance;
	//생성자
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	//메소드
	public String getAno() {
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int amount) {	//amount입금금액
		if(amount>=10&&amount<=1000000) {
			balance += amount;
		}else {
			balance +=0;
		}
	}
	public void withdrawBalance(int amount) {//출금금액
		if(amount >=10&& amount<=10000) {
			balance -= amount;
		}else {
			balance -= 0;
		}
	}
	@Override
	public String toString() {
		return "ano=" + ano + ", owner=" + owner + ", balance=" + balance ;
	}
	public void showInfo() {
		System.out.println("이름     : "+this.owner);
		System.out.println("계좌번호 : "+this.ano);
		System.out.println("잔액     : "+this.balance);
	}
	
	
}
