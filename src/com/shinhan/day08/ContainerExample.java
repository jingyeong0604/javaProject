package com.shinhan.day08;

public class ContainerExample {

	public static void main(String[] args) {
		

		
		f4();
	}

	private static void f4() {
		// TODO Auto-generated method stub
		
	}

	private static void f2() {

		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println("name1: "+name1);
		System.out.println("jon : "+job);
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2=container2.getKey();
		int age = container2.getValue();
		System.out.println("name2: "+name2);
		System.out.println("age: "+age);
		
	}
	
	private static<T> Container<T> containerFactory(T data) {
		
		return new Container<T>(data);
	}
	
	private static<K,V> Container2<K, V> makeContainer(K key, V value) {
		Container2<K, V>
		return new Container2<K,V>(key, value);
	}

	private static void f3() {
		Container2<String, Integer>  container1 = makeContainer("aa",100);
		System.out.println("key = "+container1.getKey());
		System.out.println("key = "+container1.getValue());
		
		Container2<String, Money> con2 = makeContainer("홍", new Money(100));
		
	}

	private static void f1() {
		Container<String> container1 = new Container();
		container1.set("홍길동");
		String str = container1.get();

		Container<Integer> container2 = makeContainer();
		container2.set(6);
		int value = container2.get();
		
		
		
	}

}
