package com.shinhan.day11;

public class LambdaTest2 {
	public static void main(String[] args) {
		new LambdaTest2().f2(100);//f2에 static이 안붙어있어서 new LambdaTest2()를 붙여줌.
	}
	static String subject = "자바";
	
	private void f2(int su1) {
		//파라미터는 지역변수
			
			int su2 = 200;//함수 안에 있는 변수는 지역변수임.
			//내부 클래스에서 지역변수는 final의 특성을 가짐.
			
			//1.익명 구현 클래스
			
			Calculable2 f = (a,b)-> {

					System.out.println("람다 표현식..."+ subject);
					//su1++; su2++; final의 특성을 가지고 있어 사용할 수 없음.
					return a+b+su1+su2;
				};

			int res = f.calculate(1, 2);
			System.out.println(res);
			
			
	
	}

	private static void f1(int su1) {//파라미터는 지역변수
		
		int su2 = 200;//함수 안에 있는 변수는 지역변수임.
		//내부 클래스에서 지역변수는 final의 특성을 가짐.
		
		//1.익명 구현 클래스
		
		Calculable2 f = new Calculable2() {
			
			@Override
			public int calculate(int x, int y) {
				System.out.println("익명구현 객체");
				//su1++; su2++; final의 특성을 가지고 있어 사용할 수 없음.
				return x+y+su1+ su2;
			}
		};
		int res = f.calculate(1, 2);
		System.out.println(res);
		
		
	}
}
