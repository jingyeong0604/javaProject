package com.shinhan.day02;

import java.util.Arrays;

public class ReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f4();
	}

	private static void f4() {
		// TODO Auto-generated method stub
		String subjects="자바, db, jtm, css, kjavaScro ";
		String[] arr=subjects.split(",");
		System.out.println(Arrays.toString(arr));
		for(String s:arr) {
			System.out.println(s);
		}
	}

	private static void f3() {
		// TODO Auto-generated method stub
		String subject="이것이 자바다.";
		for(int index=0;index<subject.length(); index++) {
			System.out.println(subject.substring(index, index+1));
		}
	}

	private static void f2() {
		// TODO Auto-generated method stub
		String name=null;//아직 힙에 생성된 객체는 없다.
		System.out.println(name);
		System.out.println(name.length());
		
	}

	private static void f1() {
		// TODO Auto-generated method stub
		int a=10;
		String s1="자바"; //상수pool에 컴파일시 들어감, load시에 메서드 영역에 상수pool에 
		String s2="자바";
		String s3=new String("자바");
		String s4=new String("자바");
		System.out.println(s1==s2);//주소 같다
		
		s1 = s1+ "aa";
		s2 = s2+ "aa";
		
		System.out.println(s1==s2);//주소 다르다
	}

}
