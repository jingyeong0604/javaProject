package com.shinhan.day10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import com.shinhan.day05.Account;

import chp7_prac.Employee;



public class CollectionTest2 {

	public static void main(String[] args) {
		f14();
		String[] arr=("A","B","C");
		int[] arr2= {100,99,88};
		List<String>() data = Arrays.asList(arr);
		List<Integer>() data2 = Arrays.asList(arr);
		
	}
	
	private static void f14() {
		Set<Fruit> data=new HashSet<>();
		data.add(new Fruit("귤", 100));
		data.add(new Fruit("귤",100));
		data.add(new Fruit("귤",100));
		data.add(new Fruit("귤",100));
		data.add(new Fruit("귤",100));
		Set<Fruit> data2=Set.copyOf(data);
		//수정불가
		
		data2.add(new Fruit("사과",200));
		for(Fruit f:data2) {
			System.out.println(f);
		}
		
	}
	

	private static void f13() {
		Map<String, Integer> data=Map.of("김",100,"양", 0, "이",40);
		
//		data.put->불가능함
		for(String key:data.keySet()) {
			System.out.println(key+"---"+data.get(key));
		}
		
	}

	private static void f12() {
		Set<Integer> listData = Set.of(200,88,99,55,82); //값은 중복 불가
		//listData.get(11);
		
	}

	private static void f11() {
		//수정불가한 Collection
		//int[] arr=new int[] {100,88,99,55,80};
		List<Integer> listData=List.of(1,2,3,4,5);
		/
		//불가 listData.add(999);
		for(Integer a: listData) {
			System.out.println(a);
		}
		for(int a: listData) {
			System.out.println(a);
		}

	private static void f10() {
		Queue<Fruit> data = new LinkedList()<>();
		data.offer(new Fruit("귤1",2000));
		data.offer(new Fruit("귤3",8000));
		data.offer(new Fruit("귤2",7000));
		data.offer(new Fruit("귤4",5000));
		
		while(!data.isEmpty()) {
			Fruit f = data.poll();
			System.out.println(f);
		}
		
	}
	
	private static void f9() {
		Stack<Fruit> data = new Stack<>();
		data.push(new Fruit("귤1",2000));
		data.push(new Fruit("귤3",8000));
		data.push(new Fruit("귤2",7000));
		data.push(new Fruit("귤4",5000));
		
		while(!data.isEmpty()) {
			Fruit f = data.pop();
			System.out.println(f);
		}
		
	}

	private static void f6() {
		Set<Board> data = new TreeSet<>();
		data.add(new Board("언뇽허새요", "회식", 1, "jin"));
		data.add(new Board("언뇽허s새요", "회d식", 2, "jin"));
		data.add(new Board("언뇽s허새요", "회sd식", 5, "jin"));
		data.add(new Board("a언뇽허새요", "회asd식", 8, "jin"));
		
	}

	private static void f5() {
		//default: key로 sort 한다
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Apple", 40);
		treeMap.put("pple", 19);
		treeMap.put("ple", 180);
		treeMap.put("le", 100);//같은 키가 있으면 key replace
		
		for(String key: treeMap.keySet()) {
			System.out.println(key +"==>"+ treeMap.get(key));
		}
		
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.get(treeMap.firstKey()));
		System.out.println("lower entry: "+treeMap.lowerEntry("홍길동3"));
		
		
		NavigableMap<String, Integer> data2 = treeMap.descendingMap();
		for(String key: data2.keySet()) {
			System.out.println(key+ data2.get(key));
		}
	}

	private static void f4() {
		TreeSet<Integer> scores=new TreeSet<>();
		//set 중복 허용ㄴㄴ
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for(Integer s: scores) {
			System.out.println(s+" ");
		}
		System.out.println("first: "+ scores.first());
		System.out.println("first: "+ scores.last());
		System.out.println("higher: "+ scores.higher(50));
		System.out.println("lower: <"+scores.lower(50));
		System.out.println("ceiling:>= "+scores.ceiling(50));
		System.out.println("floor:<= "+scores.floor(50));
		
		System.out.println("========tailSet: >= ==============");
		SortedSet<Integer> data = scores.tailSet(50);
		for(Integer i:data) {
			System.out.println(i);
		}
		
		SortedSet<Integer> data2 = scores.headSet(50,true);
		NavigableSet<Integer> data3 = scores.headSet(50,true);
		
		for(Integer i:data2) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		
		System.out.println("가장 낮은 점수: ");
	}

	private static void f3() {
		Set<Employee> data=new TreeSet<>();
		data.add(new Employee("직원1","과장",1000));
		data.add(new Employee("직원2","부장",11000));
		data.add(new Employee("직원3","대리",100));
		data.add(new Employee("직원4","사원",6000));
		data.add(new Employee("직원5","인턴",8000));
		
		
	}

	private static void f2() {
		Set<Account> data=new TreeSet<>();
		
		data.add(new Account("1234","홍5",1000));
		data.add(new Account("1224","홍4",11000));
		data.add(new Account("1164","홍2",100));
		data.add(new Account("1254","홍1",6000));
		data.add(new Account("1634","홍5",8000));
		
		for(Account s:data) {
			System.out.println(s);
		}
		
		
		
	}
	private static void f1() {
		Set<String> data=new TreeSet<>();
		data.add("월1");
		data.add("월5");
		data.add("월5");//같은 값이 있으므로 add되지 않는다.
		data.add("월2");
		data.add("월4");
		
		for(String s:data) {
			System.out.println(s);
		}
		
		
		
	}

}
