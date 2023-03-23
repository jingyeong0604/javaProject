package com.shinhan.day05;

import java.io.Serializable;
import java.util.Objects;

//부모class로 사용할 예정
public class Account implements Comparable<Account>, Serializable{
	//1.field
	private String accNo;
	private String owner;
	private int balance;
	double a;
	public Account() {
		//default 생성자는 그냥 놔두는게 좋음
	}
	//생성자
	public Account(String accNo, String owner, int balance) {
		//super();
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
		
	}
	
	public Account(String accNo, String owner) {
		//super();
		this.accNo = accNo;
		this.owner = owner;

	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(a, accNo, balance, owner);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Double.doubleToLongBits(a) == Double.doubleToLongBits(other.a) && Objects.equals(accNo, other.accNo)
				&& balance == other.balance && Objects.equals(owner, other.owner);
	}
	
	
	//메서드
	public void deposit(int amount) {
		balance+= amount;
		
	}
	
	public int withdraw(int amount) {
		if(amount> balance) {
			System.out.println("잔고부족");
			return 0;
		}
		balance -= amount;
		return amount;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", owner=" + owner + ", balance=" + balance + ", a=" + a + "]";
	}
	@Override
	public int compareTo(Account acc) {
		

//		return owner.compareTo(acc.owner)*-1;//accending, *-1하면 decending
//		return accNo.compareTo(acc.accNo); //accending
		int result= acc.balance-balance;//decending
		if(result==0) return owner.compareTo(acc.owner);
		return result=0;
		
		
	}
	
	
	
}
