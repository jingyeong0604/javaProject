package com.shinhan.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day05.Account;

public class StreamTest {

	public static void main(String[] args) {
		f7();

	}

	private static void f7() {
		// TODO Auto-generated method stub
		
	}

	private static void f6() {
		Account[] arr = {new Account("1234","hong3"),
				new Account("1134","hong1"),
				new Account("1245","hong2"),
				new Account("1264","hong2"),
				new Account("1124","hong2"),
				new Account("1144","hong2")
				};
		
		List<Account> data1 = Arrays.asList(arr);
		List<Account> data2 = Arrays.asList(arr);
		data1.parallelStream().forEach(acc ->{
		
			System.out.println(acc);
			System.out.println(Thread.currentThread().getName());
			System.out.println("////////////////////////");
		});//stream: 중간에 필텨링 가능
		
		System.out.println("-----------------------------------------------");
		data1.forEach(acc ->System.out.println(acc));//단순히 내부 반복자로 돌림
		
		
	}

	private static void f5() {
		Set<Account> data1 = new HashSet<>();
		data1.add(new Account("1234","hong3"));
		data1.add(new Account("1134","hong1"));
		data1.stream().forEach(acc ->System.out.println(acc));//stream: 중간에 필텨링 가능
		System.out.println("-----------------------------------------------");
		data1.forEach(acc ->System.out.println(acc));//단순히 내부 반복자로 돌림
	}

	private static void f4() {
		Account[] arr = {new Account("1234","hong3"),
				new Account("1134","hong1"),
				new Account("1254","hong2")};
		List<Account> data1 = Arrays.asList(arr);
		List<Account> data2 = Arrays.asList(arr);
		data1.stream().forEach(acc ->System.out.println(acc));//stream: 중간에 필텨링 가능
		System.out.println("-----------------------------------------------");
		data1.forEach(acc ->System.out.println(acc));//단순히 내부 반복자로 돌림
		
		
		
	}

	private static void f3() {
		Account[] arr = {new Account("1234","hong3"),
				new Account("1134","hong1"),
				new Account("1254","hong2")};
		
		Arrays.stream(arr).forEach(acc ->System.out.println(acc));
		
	}

	private static void f2() {
		//배열
		String[] arr1 = {"자바","웹","front","back","framework"};
		
		//1.내부 반복자를 이용하고자 한다면 stream을 얻는다.
		Stream<String> st =  Arrays.stream(arr1);
		//2.내부반복자로 값을 처리한다.
		Consumer<String> consumerF = (s)->{
			System.out.println(s+"***");
		};
		st.forEach(consumerF);
		
		Arrays.stream(arr1).forEach((s)->{
			System.out.println(s+"***");
		});
		
	}

	private static void f1() {
		//1.배열
		int[] arr1 = new int[] {100,30,70,20,50};
		//forEach : stream안에 들어있는 메소드 내부 반복자임.
		Arrays.stream(arr1).forEach(a-> System.out.println(a));
		
		//original stream
		IntStream is =Arrays.stream(arr1);
		IntConsumer func1 = (a)-> {
			System.out.println("a="+a);
		};
		is.forEach(func1);
		
	}

}
