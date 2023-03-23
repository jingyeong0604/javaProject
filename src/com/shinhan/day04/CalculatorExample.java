package com.shinhan.day04;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2);
		sum(1,2,3);//오버로딩
		sum(1,2,3,4,5);
		sum(1.5, 2.5);
	}
	
	//메서드 Overloading :메서드 이름은 같고 매개변수 사양이 다름.
	
	//파라미터 자동형변환 된다.
	static void sum(int...arr){//int[] a
		int total=0;
		for(int su:arr) {
			total+=su;
		}
		if(total==0) return;//return: 함수 중단하고 호출하는 곳으로 돌아감.
		System.out.println("가변길이 매개변수");
	}
	
	static void sum(int a, int b){
		System.out.println("합계:"+ (a+b));
	}
	static void sum(double a, double b){
		System.out.println("합계:"+ (a+b));
	}
	
	static void sum(int a, int b, int c){
		System.out.println("합계:"+ (a+b+c));
	}
	
	private static void f1() {
		Calculator[] arr=new Calculator[4];
		
		
		arr[0]=new Calculator("red");
		arr[0].setModel("A모델");
		arr[1]=new Calculator("black");
		arr[2]=new Calculator("B모델","blue");
		arr[3]=new Calculator("C모델","green",2000);
		
		for(Calculator cc:arr) {
			print(cc);
		}
	}

	private static void print(Calculator cal) {
		// TODO Auto-generated method stub
		System.out.println(cal.getModel());
		System.out.println(cal.getColor());
		System.out.println(cal.getPrice());
		cal.powerOn();
		cal.powerOff();
		System.out.println(cal.plus(1,2));
		System.out.println(cal.sub(1,2));
	}

}
