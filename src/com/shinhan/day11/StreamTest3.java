package com.shinhan.day11;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day05.Account;

public class StreamTest3 {
	public static void main(String[] args) {
		f13();
	}

	private static void f13() {
		List<Student2> data=new ArrayList<>();
		data.add(new Student2("hong", 20, "남"));
		data.add(new Student2("choi", 25, "남"));
		data.add(new Student2("park", 27, "여"));
		data.add(new Student2("lee", 50, "여"));
		data.add(new Student2("jung", 60, "남"));
		data.add(new Student2("oh", 62, "여"));
		
		//group으로 집계를 하고 다시 group을 Collection으로 만든다.
		//성별로 그룹을 나눈다.
		Map<String, Double> map = data.stream().collect(
				Collectors.groupingBy(s->s.getGender(), //성별로 그룹집계
						Collectors.averagingDouble(s->s.getScore()))//성별로 점수 평균 내기
						//groupingBy에 매개변수는 두개 들어감.
				);
		
		System.out.println(map);
	}

	private static void f12() {
		int[] arr= {1,2,3,4,5};
		
		boolean result1 = Arrays.stream(arr).allMatch(su -> su%2==0);
		System.out.println(result1);
		
		boolean result2 = Arrays.stream(arr).anyMatch(su -> su%2==0);
		System.out.println(result2);
		
		//모든 요소가 만족하지 않는가?
		boolean result3 = Arrays.stream(arr).noneMatch(su -> su%2==0);
		System.out.println(result3);
		
		double d =Arrays.stream(arr)
				.filter(su -> su%2==0)
				.average()
				.orElse(0);
		
		System.out.println(d);
		
	}

	private static void f11() {
		List<Student> data=new ArrayList<>();
		data.add(new Student("김1", 100));
		data.add(new Student("김4", 90));
		data.add(new Student("김3", 80));
		data.add(new Student("김5", 70));
		data.add(new Student("김2", 20));
		
		data.stream().sorted().forEach(st ->{System.out.println(st);});
		
		//이름순 정렬
		data.stream().sorted((a,b)->a.getName().compareTo(b.getName()))
		.forEach(st->{System.out.println(st);});
		
		
	}

	private static void f10() {
		Integer[] arr= {100, 88, 99, 50, 60};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, (a,b)->b-a);
		System.out.println(Arrays.toString(arr));
		
		Student[] arr2= {new Student("김", 80),new Student("김", 70),new Student("김", 90),
				new Student("김", 60),new Student("김", 100),new Student("김", 30)};
	
	
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2, (a,b)->a.getName().compareTo(b.getName()));
		System.out.println(Arrays.toString(arr2));
		
	}

	private static void f9() {
		List<String> data=new ArrayList<>();
		data.add("This is java");
		data.add("I am a best developer");
		
		//String[] arr=data.get(0).split(" ");
		
		data.stream().flatMap(row-> Arrays.stream(row.split(" ")))//stream을 이용해서 공백으로 만듦
				.forEach(word -> {System.out.println(word);});
		
		//스트림쓰지 않고 공백 분리
		for(String row : data) {
			String[] arr =row.split(" ");
			for(String s: arr) {
				System.out.println(s);
			}
		}
	}
		
		
	

	private static void f8() {
		int[] intArray= {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
		.asDoubleStream()
		.forEach(d->System.out.println(d));

		System.out.println();
		
		intStream = Arrays.stream(intArray);
		//객체로 만들고 싶음 ->boxed
		intStream.boxed().forEach(d->System.out.println(d.floatValue()));
	}

	private static void f7() {
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1", 100));
		data.add(new Student("김4", 90));
		data.add(new Student("김3", 80));
		data.add(new Student("김5", 70));
		data.add(new Student("김2", 20));

		// data를 stream으로 만들어서 중간처리, 최종처리
		data.stream().distinct()
		.filter(s->s.getScore()>70)
		.forEach(s-> {System.out.println(s);});
		
		System.out.println("=========이름이 김씨인 사람만 추출==============");
		//이름이 김씨인 사람만 추출
		data.stream()
		.distinct()
		.filter(st ->st.getName().startsWith("김"))
		.forEach(s ->{
			System.out.println(s);
		});
		
		System.out.println("=========이름이 김씨인 사람만 추출...점수 ...평균==============");
		//이름이 김씨인 사람만 추출
		data.stream()
		.filter(st -> st.getName().startsWith("김"))
		.mapToInt(aa -> aa.getScore())//중간처리
		.average()//최종처리
		.ifPresent(d -> {
			System.out.println("평균: "+ d);
		});
	

	}

	private static void f6() {
		List<String> list = new ArrayList<>();
		list.add("홍길동1");
		list.add("홍길동4");
		list.add("홍길동9");
		list.add("홍길동2");
		list.add("홍길동3");
		list.stream().distinct().filter(s -> s.endsWith("3")).forEach(s -> {
			System.out.println(s);
		});

	}

	
	private static void f5() throws URISyntaxException, IOException {
		Path path = Paths.get(StreamTest3.class.getResource("data.txt").getProtocol());
		System.out.println(path);
		System.out.println(Charset.defaultCharset());
		Stream<String> streamData = Files.lines(path, Charset.defaultCharset());
	}

	private static void f41() throws IOException{
		FileInputStream fi = new FileInputStream("src/com/shinhan/day11/data.txt");
		int i;
		while( (i=fi.read())!=-1){
			System.out.println((char)i);
	}
	}
	private static void f3(){
		//내부 반복자
		//1~9까지 range
		//1~10까지 rangeClosed
		IntStream.rangeClosed(1, 10).forEach(su -> {
			System.out.println(su+"*****");
		});
		
		//외부반복자 
		for(int i=1; i<10; i++) {
			System.out.println("일반for문: "+i);
		}
		
	}

	private static void f2() {
		List<Account> data = new LinkedList<>();
		data.add(new Account("169","hong1",1000));
		data.add(new Account("193","hong2",1000));
		data.add(new Account("173","hong3",1000));
		data.add(new Account("125","hong4",1000));
		data.add(new Account("123","hong1",1000));
		
		//모든계좌의 잔고의 합을 출력하기
		//외부 반복자 이용->속도가 느림.
	
		int total=0;
		for(Account acc:data) {
			total+=acc.getBalance();
		}
		System.out.println("잔고의 합계는 "+ total);
		
		//stream 병렬 ->속도가 더 빠름, 내부반복자 사용
		long total2 = data.stream().mapToLong(acc -> acc.getBalance()).sum();
		System.out.println("Account balance 합계:" + total2);
		
		//map: 중간처리 count(): 최종처리
		total2 = data.stream().map(acc -> acc.getOwner()).count();
		System.out.println("건수는 "+ total2);
		
		data.stream().map(acc -> acc.getOwner())
		.forEach(owner -> System.out.println(owner + "예금주님"));
		
	}

	private static void f1() {
		//여러건 저장하기 : 배열, Collection(List, Set, Map)
		List<Student> data = new ArrayList<>();
		data.add(new Student("김1",100));
		data.add(new Student("김4",90));
		data.add(new Student("김3",80));
		data.add(new Student("김5",70));
		data.add(new Student("김2",20));
		
		//data를 stream으로 만들어서 중간처리, 최종처리
		data.stream().forEach((st) -> {
			System.out.println(st);
			System.out.println(st.getName()+"===>"+st.getScore());

		});
		
		System.out.println("==========중간처리 test============");
//		data.stream()
//		.mapToInt(st -> st.getScore())
//		.forEach(score ->{
//			System.out.println(score);
//			});
		
		double d =data.stream()
		.mapToInt(st -> st.getScore())
		.average()
		.getAsDouble();
		System.out.println("average = "+d);
		
		System.out.println("==========optional test=============");
		OptionalDouble option = data.stream()
		.mapToInt(st -> st.getScore())
		.average();
		option.ifPresent(result -> System.out.println(result));//값이 존재하는가
		
		//mapToInt -> 중간처리
		System.out.println("==========optional test2=============");
		data.stream().mapToInt(st -> st.getScore())
		.average()
		.ifPresent(result -> System.out.println(result));//값이 존재하는가
		
		System.out.println("==========optional test3=============");
		data.stream().mapToInt(st -> st.getScore())
		.average()
		.ifPresentOrElse(d->{System.out.println(d);},
				()->{System.out.println("평균계산실패");});
		
	}

}
