package com.shinhan.day11;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamTest2 {

	public static void main(String[] args) {
		List<Student> data = Arrays.asList(new Student("홍", 100),
				new Student("홍", 100),
				new Student("홍", 100),
				new Student("홍", 100)
				
				);
		//stream이 자동으로 만들어져서 stream을 통해 내부 반복자 이용
		//data.forEach(st -> System.out.println(st));
		
		
		//중간처리하기
		//mapToInt : 중간처리
		//map: 변형한다의 의미, 점수들만 추출함.
		//average: 최종처리 ...평균 구함
		double avg = data.stream().mapToInt(st -> st.getScore()).average().getAsDouble();
		System.out.println(avg);
		
		OptionalDouble opAvg = data.stream().mapToInt(st -> st.getScore()).average();
		opAvg.ifPresentOrElse(a->{
			System.out.println("평균:"+ a);
		}, ()->{System.out.println("평균 계산할 수 없음");});
		
		
	}

}
