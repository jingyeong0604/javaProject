package com.shinhan.day03;

public class TestAccount {

	public static void main(String[] args) {
//		078-3762-293 계좌가 개설되었습니다.
//		078-3762-293 계좌의 잔고는 1000000원입니다.
//		078-3762-293 계좌에 2000000원이 입금되었습니다.
//		078-3762-293 계좌의 잔고는 3000000원입니다. 
//		078-3762-293 계좌에 500000원이 출금되었습니다.
//		078-3762-293 계좌의 잔고는 3500000원입니다.

		// TODO Auto-generated method stub
		Account acc = new Account( "078-3762-293", 1000000);
		acc.getAccNo();
		acc.getBalance();
		acc.deposit(2000000);
		acc.getBalance();
		acc.withdraw(500000);
		
		acc.getBalance();
		
		System.out.println(acc);
		
	}

}
