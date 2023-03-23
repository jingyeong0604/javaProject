package com.shinhan.day07;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Car{
	int price;
	String model;
	public Car(int price, String model) {
		super();
		//object도 만들고car도 만드는것.
		
		this.price = price;
		this.model = model;
	}
	
	//재정의
	
	//동등비교(예, HashSet은 중복불가): hashCode(), equals()가 같아야 같은객체로 판별한다.
	
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	
	


	@Override
	public String toString() {
		return "Car [price=" + price + ", model=" + model + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
	
	
}
public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f6();
	} 

	private static void f6() {
		//Set: 순서가 없다.중복허용 안함.
		Set<Car> data = new HashSet<Car>();
		
		data.add(new Car(100,"A"));
		data.add(new Car(100,"B"));
		data.add(new Car(100,"C"));
		data.add(new Car(100,"D"));
		data.add(new Car(100,"E"));
		data.add(new Car(100,"F"));
		data.add(new Car(100,"A"));
 
		
	}

	private static void f5() {
		
		
		
	}

	private static void f4() {
		Car obj1 = new Car(100,"A모델");
		
		
		Car obj2 = new Car(100,"B모델");
		
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2 ? "주소같다" : "주소 다르다"); // == 객체는 주소 비교
		System.out.println(obj1.equals(obj2)); // Object equals(): 주소 비교

	}

	private static void f3() {
	
		Date obj1 = new Date();
		Date obj2 = new Date();
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1==obj2? "주소같다" : "주소 다르다"); //== 객체는 주소 비교
		System.out.println(obj1.equals(obj2)); //Object equals(): 주소 비교
		
	}
	
	private static void f2() {
		String obj1 = new String();
		String obj2 = new String();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1==obj2? "내용같다" : "내용 다르다"); //== 객체는 주소 비교
		System.out.println(obj1.equals(obj2)); //String equals(): 내용 비교로 재정의됨.
		
	}

}
