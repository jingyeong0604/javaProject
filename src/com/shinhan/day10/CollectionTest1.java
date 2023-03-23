package com.shinhan.day10;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

import com.shinhan.day04.Employee;
import com.shinhan.day05.Account;
import java.util.*;

public class CollectionTest1 {

	public static void main(String[] args) throws IOException {
		f9();
	}
	private static void f9() throws IOException {
		Properties pro = new Properties();
		InputStream fis = new FileInputStream("src/com/shinhan/day10/oracleInfo.properties");
		//pro.load(fis);
		InputStream is = CollectionTest1.class.getResourceAsStream("oracleInfo.properties");
		String driver = pro.getProperty("driver");
		System.out.println(driver);
		
		for(Object key:pro.keySet()) {
			String value =pro.getProperty((String) key);
			System.out.println(key+" : "+value);
		}
		
	}
	private static void f8() {
		//key는 set이다
		//set은 add시에 동등객체인지 확인. 동ㄷㅇ하면 add불가
		//Map은 put()ㅅ에 key를 찾는다.
		Map<Employee, Account> data= new Hashtable();
		data.put(new Employee("유란", "대리", 1000), new Account("1234","유란",2000));
		data.put(new Employee("유란", "대리", 1000), new Account("1342","유란",8000));
		data.put(new Employee("용희", "사원", 7000), new Account("1224","용희",1500));
		
		data.put(new Employee("우린", "대리", 1000), new Account("2323","우린",3500));
		
		
		//향상된 포문
		for(Employee em:data.keySet()) {
			System.out.println("key: "+em);//문자열 출력하는것.
			System.out.println("value:" +data.get(em));
		}
		
		System.out.println("key찾기");
		System.out.println(data.containsKey(new Employee("유란", "대리", 1000)));
		System.out.println("value찾기");
		System.out.println(data.containsValue(new Account("1224","용희",1500)));
		
		
	}
	private static void f7() {
		//Map : 키와 값의 쌍이다 (Entry), 키는 set이므로 중복불가
		//구현class : HashMap, HashTable
		HashMap<String, Integer> data= new HashMap<>();
		data.put("김", 100);
		data.put("박", 190); 
		data.put("정", 96);
		data.put("남", 50);
		data.put("김", 200);
		
		
		System.out.println("키가 중복되면 마지막값 유효:" +data.get("김"));
		
		//1.일반for---index 불가
		//2.향상for
		//entry는 1건을 의미, entrySet은 여러건을 의미함.
		int sum=0;
		for(Entry<String, Integer> entry:data.entrySet()) {
			System.out.println(entry.getKey()+ "==>" + entry.getValue());
			sum+=entry.getValue();
		}
		

		
		//keyset(): 키들을 의미
		for(String Key:data.keySet()) {
			System.out.println(Key+ "==>" + data.get(Key));
			sum+=data.get(Key);
		}
		System.out.println("총점은 "+sum);
		
		//Iterator이용
		Iterator<String> it =data.keySet().iterator();
		while(it.hasNext()) {//다음 data가 있는지 확인학.
			String key = it.next();//다음 data 읽기
			System.out.println(key);
			System.out.println(data.get(key)); //다음 data 읽기
//			System.out.println(data.get(it.next())); 위에서 next를 해줬기 떄문에 그 다음으로 넘어가버림
			
		}
		
		 System.out.println("키찾기: "+data.containsKey("김"));
		 System.out.println("키찾기: "+data.containsKey("김2"));
		 System.out.println(data.containsValue(90));
		 
	
	}
	private static void f6() {
		//set interface => 구현 클래스: HashSet, TreeSet
		Set<Account> data = new HashSet<>();
		data.add(new Account("1234","lee",2000));
		data.add(new Account("1234","lee",2000));
		data.add(new Account("12234","lee",2000));
		data.add(new Account("145","l",2000));
		data.add(new Account("224","e",200));
	

		//3.iterator(내부반복자)
		Iterator<Account> it = data.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		for(Account ac: data) {
			System.out.println(ac);
		}
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//원하는 객체 찾기
		Account searchData = new Account("!234","홍",1234);
		boolean result = data.contains(searchData);
		
	}
	private static void f5() {
		//set interface => 구현 클래스: HashSet, TreeSet
		Set<String> data = new HashSet<>();
		data.add("월요일");
		data.add("화요일");
		data.add("토요일");
		data.add("일요일");
		data.add("월요일");
		
		//1.일반 for ---불가 순서가 없으므로 index 사용 안됨. 단, Tree는 순서가 있음.
		//2.향상for
		for(String week: data) {
			System.out.println(week);//순서 보장 x, 중복 ㄴㄴ
		}
		
		//3.iterator(내부반복자)
		Iterator<String> it = data.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	private static void f4() {
		//ArrayList는 중간의data를 삽입하거나 삭제시 앞으로 당기는 것 떄문에 느리다.
		List<Account> data=new Vector<>();
		long start = System.nanoTime();
		
		for(int i=1; i<=1000; i++) {
			data.add(new Account(i+"","hong"+ i ,100));
		}
		
		for(int i=100; i<200; i++) {
			data.remove(0);
			
		}
		
		for(int i=100; i<=200; i++) {
			data.add(i, new Account(i+"","ong"+ i ,100));
		}
		
		
		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format((end-start))+"ns");
		
	}
	//Vector는 멀티쓰레드에 안정적이다.. 동기화가 됨 
	private static void f3() {
		List<Account> data=new Vector<>();
		long start = System.nanoTime();
		//2000건을 add 2개의 흐름을 만들어서 각자 1000건씩 넣고자한다.
		Thread t1 = new Thread() {
			public void run() {
				for(int i=1; i<=1000; i++) {
					data.add(new Account(i+"","hong"+ i ,100));
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1001; i<=2000; i++) {
					data.add(new Account(i+"","hong"+ i ,100));
				}
			}
		};
		t1.start(); t2.start();
		try {
			t1.join(); t2.join(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(data.size()+"건이 저장되었습니다......");
		
		for(int i=0; i<100; i++) {
			data.remove(0);
			
		}
		
		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format((end-start)));
		
	}

	private static void f2() {
		List<String> data = new ArrayList<String>();
		data.add("자바1");
		data.add("자바2");
		data.add("자바3");
		data.add("자바4");
		data.add("자바5");
		data.add("자바6");
		System.out.println(data.size()+"개");
		
		for(int i=0; i<data.size(); i++) {
			System.out.println(data.get(i));
		}
		String s = data.get(0);
		data.get(0);
		
		//2.향상 for
		for(String l:data) {
			System.out.println(l);
		}
		
		//3.iterator
		Iterator<String> it = data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
	//제네릭스 사용하지 않는것은 바람직하지 않다.
	private static void f1() {
		//List interface:구현class => ArrayList, LinkedList, Vector
		List data = new ArrayList();
		data.add(100);
		data.add("자바");
		data.add(new Account("123","홍길동",1900));
		data.get(0);
		int a = (Integer)data.get(0);
		String s = (String)data.get(1);
		String acc = (String)data.get(2);
		
		
	}

}
