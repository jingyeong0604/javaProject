package chp6_prac;

public class Account19Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account19 account = new Account19();
		
		account.setBalance(10000);
		System.out.println("현재 잔고:"+ account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: "+ account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: "+account.getBalance());

		account.setBalance(300000);
		System.out.println("현재 잔고"+ account.getBalance());
	}

}
