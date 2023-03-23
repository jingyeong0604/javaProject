package exam;

class Prob3 {
	public static void main(String args[]){
		PhoneCharge skt = new PhoneCharge("김현우", 100, 50, 1);
		PhoneCharge ktf = new PhoneCharge("신희만", 200, 100, 2);
		PhoneCharge lgt = new PhoneCharge("조유성", 150, 500, 10);
		skt.printCharge();
		ktf.printCharge();
		lgt.printCharge();
	}
}

class PhoneCharge{	
	//구현하시오.
	private String user; // 폰사용자이름
	private int call; //통화시간(분단위)
	private int sms; //문자전송건수
	private int data;// 데이터통신량(GB단위)
	private int total; //통신요금(원) 
	
	public PhoneCharge(String user, int call, int sms, int data) {
		this.user = user;
		this.call = call;
		this.sms = sms;
		this.data = data;
		calcCharge();
	}

	public void printCharge() {
		//김현우 사용자는 이번달에 사용하신 전화요금이 3000원 입니다.
		System.out.println(user+" 사용자는 이번달에 사용하신 전화요금이 "+total+"원 입니다.");

	}
	
	public int calcCharge() {
		//PhoneCharge skt = new PhoneCharge("김현우", 100, 50, 1);
		int a=call*10;
		if(call>=200) a=call*20;
		
		
		int b=sms*20;
		if(sms>=300) b=sms*80;
		
		int c=data*1000;
		if(data>=7) c=data*2000;
		total=a+b+c;
		return a+b+c;
		
	}
	
		
}
 
