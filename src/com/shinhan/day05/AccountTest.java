package com.shinhan.day05;

public class AccountTest {

	public static void main(String[] args) {
		f3();

	}

	private static void f3() {
		CreditLineAccount acc=new CreditLineAccount("122-155","jin",10000,500);
		acc.deposit(2000);
		int amount = acc.withdraw(300);
		System.out.println(amount + " 출금");
		System.out.println("잔액은: "+acc.getBalance());
		
	}

	private static void f2() {
		CheckingAccount acc=new CheckingAccount("122-155","jin",10000,"123-234");
		acc.deposit(2000);
		int amount = acc.withdraw(300);
		System.out.println(amount + " 출금");
		
		amount=acc.pay("999",200);
		System.out.println(amount+"출금");
		System.out.println(acc.getBalance());
	}

	private static void f1() {
		// TODO Auto-generated method stub
		Account acc=new Account("122-155","jin",10000);
		acc.deposit(2000);
		int amount = acc.withdraw(300);
		System.out.println(amount + " 출금");
		
	}

}
