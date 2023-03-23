package com.shinhan.day07;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import com.shinhan.day04.Calculator;

public class ObjectTest4 {

	public static void main(String[] args)  {
		f15();

	}
	
	private static void f15() {
		Date d1=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		String result = sdf.format(d1);
		System.out.println(result);
		System.out.println(d1);
		
	}

	private static void f14() {
		DecimalFormat df = new DecimalFormat("000,000,000");
		long money = 10000000000000000L;
		String result = df.format(money);
		System.out.println(result);
		
		
	}

	private static void f13() {
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getTime ());
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+1);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthValue());
		
		
	}

	private static void f12() {
		//Math.max(10, 20);
		int a=10;
		int b=20;
		int max;
		if(a>b) max=a;
		else max=b;
		max=Math.max(a, b);
		
		//round, ceil(무조건 정수로 올림), floor(무조건 버림)
		double c=3.9;
		System.out.println(Math.ceil(c));
		System.out.println(Math.floor(c));
		
	}

	private static void f11() {
		Integer a=10;
		Integer b=10;
		System.out.println(a==b);
		
	}

	private static void f10() {
		String s="이것이 자바다 12345 This is 6789 Java 55";
		//숫자만 추출해서 출력하기
//		char[] ch=s.toCharArray();
//		String ans="";
//		for(char arr:ch) {
//			if(Character.isDigit(arr)) {
//				ans+=arr;
//			}
//		}
//		System.out.println(ans);
//		
		
		
		StringBuilder sb=new StringBuilder();
		char[] ch=s.toCharArray();
		for(char arr:ch) {
			if(Character.isDigit(arr)) {
				sb.append(arr);
			}
		}
		
		
	}

	private static void f9() {
		String s="이것이자바다 this is java";
		System.out.println(s.substring(0,1));
		System.out.println(s.charAt(0));
		
		char[] arr=s.toCharArray();
		for(char ch: arr) {
			if(Character.isUpperCase(ch)) {
				System.out.println(ch+ "---------대문자");
			}else {
				System.out.println(ch+ "-----------대문자 아님");
			}
		}
		
		
//	private static void f8() {
//		String score="100";
//		int score2=Integer.parseInt(score);
//		System.out.print(score2+ 200);
//		
//		int su=10;
//		System.out.println(Integer.toBinaryString(su));
//		System.out.println(Integer.bitCount(su));
//	}
//
//	private static void f7() {
//		
//		int a=10;//기본형(용도: 값저장, 연산, 비교)
//		Integer b=20;//참조형(객체:기본형+기능) Auto Boxing : new Integer(20)
//		
//		System.out.println(a+b.intValue()+200);
//		
//		float f=b.floatValue();
//		
//		System.out.println(Integer.MAX_VALUE);
//		int su=Integer.compare(10, 5);
//		System.out.println(su);
//		
//		int[] arr= {10,90,20,70,50};
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		}
	}
	private static void f6() {
//		LocalDate dt= LocalDate.now();
//		System.out.println(dt.toString().split(":"));
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.toString());
		System.out.println(dt);
		
		System.out.println(dt.getYear());
		StringTokenizer st=new StringTokenizer(s,"T");
		
		while(st.hasMoreTo)
	}
	private static void f4() {
		String fruits ="사과, 오렌지/딸기 포도,망고 ";
		String friu="010-2134-234 1234"; 
		StringTokenizer st=new StringTokenizer(fruits,",-/ ");
			
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		
		}
	}


	private static void f3() {
		String fruits ="사과, 오렌지/딸기 포도,망고 ";
		String[] arr=fruits.split(",|/| |");
		for(String f: arr) {
			System.out.println(f);
		}
		
	}

	private static void f2() throws UnsupportedEncodingException {
		String s1="자바"; //가장 일반적, String은 고정문자열
		System.out.println(s1+"프로그램");
		s1=s1+"프로그램"; //메모리 낭비
		System.out.println(s1);
		 
		StringBuilder sb=new StringBuilder("자바StringBuilder");
		StringBuffer sf=new StringBuffer("자바StringBuffer");
		
		sb.append("프로그램");
		System.out.println(sb);
		sf.append("프로그램");
		System.out.println(sf);
		
		
		String s2=new String(sf);
		String s3=new String(sb);
		
		
		String s4=new String("자바프로그램");
		byte[] arr1=s4.getBytes("utf-8");// 한글1자 -> 3byte
		byte[] arr2=s4.getBytes("euc-kr");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
	}

	private static void f1() throws UnsupportedEncodingException {
		String s1="자바";//가장 일반적
		String s2=new String("자바");
		byte[] arr1=new byte[] {65, 66, 67, 97, 98, 99};
		char[] arr2 = new char[] {'A','B','C','a','b','c'};
		String s3 = new String(arr1);
		String s4 = new String(arr2);
		
		System.out.println(s1 + s2+ s3+ s4);
		String s5 = new String(arr1, "utf-8");
		System.out.println(s5);
		System.out.println(s5.length());
		
		System.out.println((int)'가');
	}

}
