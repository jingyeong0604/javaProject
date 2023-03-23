package com.shinhan.day03;

public class Account {
	String accNo;
	int balance;
	
//	public Account(String accNo) {
//	
//	}
//	
	
	public Account(String accNo, int balance) {
		// TODO Auto-generated constructor stub
		this.accNo=accNo;
		this.balance=balance;
	}

	
	void getBalance() {
		//잔고
		System.out.println(accNo +" 계좌의 잔고는 "+balance+"입니다.");
	}
	void getAccNo() {
		
		System.out.println(accNo+" 계좌가 개설되었습니다.");
	}

	public void withdraw(int i) {
		balance-=i;
		System.out.println(accNo+"계좌에 "+i+"원이 출금되었습니다.");
		
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		balance+=i;
		System.out.println(accNo+"계좌에 "+i+"원이 입금되었습니다.");
	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
}
