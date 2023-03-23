package chp6_prac;

import java.util.Scanner;

public class BankApplication {
	
	static String[] account=new String[100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
	}

	private static void f1() {
		System.out.println("---------------------------------------");
		System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료");
		System.out.println("---------------------------------------");
		System.out.print("선택>");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		Account a;
		
		for(int i=0; i<100; i++) {
			if(n.equals("1")) {
				a=new Account();
				System.out.println("-----------");
				System.out.println("   계좌생성   ");
				System.out.println("-----------");
				System.out.print("계좌번호");
				String acc=sc.nextLine();
				account[i]=acc;
				a.setAccNo(acc);
				
				System.out.print("계좌주");
				String person=sc.nextLine();
				a.setName(person);
				
				System.out.print("초기입금액");
				String money=sc.nextLine();
				a.setBaseMoney(money);

				System.out.print("결과: 계좌가 생성되었습니다.");
			}
			else if(n.equals("2")) {
				System.out.println("-----------");
				System.out.println("   계좌목록   ");
				System.out.println("-----------");
				
			
			}
			else if(n.equals("3")) {
	
			}
			else if(n.equals("4")) {
				
			}
			else if(n.equals("5")) {
	
			}
		}
	}

}
