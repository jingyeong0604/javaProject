package chp6_prac;

public class Account19 {
	private int balance;
	final int MIN=0;
	final int MAX=1000000;
	
	public Account19(String accNo, String owner, int balance2) {
		// TODO Auto-generated constructor stub
	}
	
	public Account19() {
		// TODO Auto-generated constructor stub
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance<0 || balance>1000000) {
			return;
		}
		this.balance = balance;
	}
	
	
	
}
