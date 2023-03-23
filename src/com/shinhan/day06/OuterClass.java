package com.shinhan.day06;

public class OuterClass {
	//1.field(instance field, static field)
	int a=10;
	static int b=20;
	int score=100;
	//2.생성자..default제공
	//3.메서드(instance method, static method)
	void method1() {
		System.out.println("OuterClass ...instance method");
	}
	
	static void method2() {
		System.out.println("OuterClass ...instance method");
	}
	
	//4.block(instance block{}, static block: static {}
	//5.inner class: 3가지: instance, class, local

	class InstanceInnerClass{
		int score=200;//field
		String s1="InstanceInnerClass임"; 
		static String s2="InstanceInnerClass임";
		
		void method3() {//매개변수 지역변수 
			int score=300; //함수내의 변수 ->지역변수
			System.out.println("InnerClass ...instance method");
			System.out.println("외부의 instance field 접근: "+a);
			System.out.println("외부의 static field 접근: "+b);
			System.out.println("지역변수 socre="+score);

			System.out.println("멤버변수 this.socre="+this.score);
			System.out.println("OuterClass.this.socre="+OuterClass.this.score);
			System.out.println("--------------------------------");
		}
		
		static void method4() {
			System.out.println("InnerClass ...instance method");
		}
	}
	
	static class StaticInnerClass{
		String s1="InstanceInnerClass임";
		static String s2="InstanceInnerClass임";
		
		void method3() {
			System.out.println("StaticInnerClass ...instance method");
		}
		
		static void method4() {
			System.out.println("StaticInnerClass ...instance method");
			System.out.println("외부의 static field접근:" +b);
			System.out.println("-----------------------------------");
		}
	}
	
	void f1() {
		//---static에서 non-static 호출 불가
		//LocalClass static 불가
		//LocalClass는 함수내에 있는 class, static 불가
		//
		int max=100;
		class LocalClass{
			String s3="LocalClass임";
			static String s4="LocalClass임 static";
			
			void method5() {
				System.out.println("LocalClass ...instance method");
				//System.out.println(s3);
				System.out.println(s4);
				System.out.println(a);
				System.out.println(b);
				System.out.println(max);
				max=200;
				System.out.println("-----------------------------------");
			}
			
			static void method6() {
				System.out.println("LocalClass ...instance method");
			}
			
			LocalClass local = new LocalClass();
		
			
		}
	}

}
