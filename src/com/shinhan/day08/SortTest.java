package com.shinhan.day08;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		f4();

	}

	private static void f4() {
		Car[] arr= {new Car("A",4000),new Car("C",30),new Car("D",30),new Car("B",1),new Car("F",5)};
		print("before ",arr);
		Arrays.sort(arr);
		print("가격asc, 모델desc after ",arr);
		
		
		Arrays.sort(arr, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				int result = o1.price-o2.price;
				if(result==0) return o1.model.compareTo(o2.model);
				return result;
			}
		});
		print("가격desc, 모델asc after ",arr);
	}

	private static void print(String title, Car[] arr) {
		System.out.println("=================="+ title +"==================");
		for(Car car:arr) {
			System.out.println(car);
		}
		
	}

	private static void f3() {
		//A: 65, a:97
		Money[] arr= {new Money(10),new Money(5), new Money(9), new Money(6)};
		System.out.println("before: "+ Arrays.toString(arr));
		Arrays.sort(arr);//Comparable 인터페이스를 구현하지 않으면 비교 불가.
		System.out.println("after: "+Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Money>() {

			public int compare(Money o1, Money o2) {
				// TODO Auto-generated method stub
				return o2.amount-o1.amount;
			}
			
		});//Comparator 인터페이스를 익명구현
		
		System.out.println("after: "+arr.toString());
		
		
	}
	
	
	private static void f2() {
		//A: 65, a:97
		String[] arr= {"Spring","java","jps","servlet","react","html","css","Springboot"};
		System.out.println("before: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after: "+Arrays.toString(arr));
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			//익명구현 클래스, String, String을 비교함.
			//비교할 떄는 순서가 중요 앞에거 그대로 놔두면 오름차순
			//순서 바꾸션 내림차순
		});
		
		System.out.println("after: "+Arrays.toString(arr));
	}

	private static void f1() {
		Integer[] arr = new Integer[] {100, 30, 80, 20, 99};
		System.out.println("before: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after: "+Arrays.toString(arr));
		Arrays.sort(arr,new DecendingInteger());
		System.out.println("desc after :"+ arr);
	}

}
