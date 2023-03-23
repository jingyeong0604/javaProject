package com.shinhan.day03;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		//f1();
		//f2();
		//f6();
		System.out.println(args.length);
		if(args.length<2) {
			//main빠지기
			//return;
			//프로그램 종료
			System.exit(0);//0이 정상종료 -1 비정상 종료
			
		}
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("더하기: "+(a+b));
		
		
	}

	private static void f6() {
		int[] arr1=new int[] {100,90,50,88};
		int[] arr2=new int[10];
		int[] arr3=new int[10];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		//원본 배열, 원본 배열 복사 시작 인덱스, 새 배열, 새배열 봍여넣기 시작 인덳, 복사 항목수
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	private static void f5() {
		// TODO Auto-generated method stub
		// 선언+생성..자동 초기화
		int[] arr = new int[5];
		
		//선언+생성+초기화
		int[] arr2=new int[] {100,90,88,100,1};
		int[] arr3= {100,0,88,100};//new int[] 생략가능
		int[] arr4;
		arr4 = new int[]{100,0,88,100};//new int[] 생략불가
		
		int[][] arr5=new int[][] {{100,90,88,100},{100,90,88}};
		for(int[] aa:arr5) {
			System.out.println(Arrays.toString(aa));
		}
	}

	private static void f4() {
		int[][] arr2;
		arr2=new int[3][];
		arr2[0]=new int[3];
		arr2[1]=new int[4];
		arr2[2]=new int[2];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
			System.out.println();
		}
	}

	private static void f3() {
		//2차원 배열: 배열의 배열
		//1.배열 변수 선언
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		//2.배열 생성
		arr1= new int[3][4];
		arr2=new int[3][];
		arr3=new int[3][];
		
		//3.배열 사용
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0]);
		
		for(int[] aa:arr1) {
			for(int su: aa) {
				System.out.print(su+"\n");
			}
			
		}
	}

	private static void f2() {
		//1.배열 변수 선언
		int[] scores;
		
		//2.배열 생성... 배열의 개수는 필수이다. 생성시 자동초기화된다.
		//(정수:0 실수:0.0 boolean:false, 객체:null)
	
		scores=new int[26];
		
		//3.배열 사용
		scores[0]=100;
		scores[1]=90;
		scores[2]=89;
		
		int total=0;
		
		System.out.println(scores.length);
		
		for(int i=0; i<scores.length; i++) {
			total+=scores[i];
		}
		
		for(int index=0; index<scores.length ; index++) {
			System.out.println(scores[index]);
		}
		
		//향상for, 확장 for
		for(int score: scores) {
			total+=score;
		}
		
		System.out.println("총점은 "+total);
		
	}

	private static void f1() {
		//배열 :  하나의 이름으로 같은 타입의 Heap에 연속공간을 만드는 자료구조
		//1.배열변수 선언
		int[] arr1=null;
		double[] arr3;
		boolean[] arr4;
		String[] arr5;
		
		//2.배열 생성.. 배열의 개수는 필수이다. 생성시 자동 초기화 된다.
		//(정수:0, 실수:0.0, boolean: false, 객체:null)
		
		arr1 = new int[5];
		arr3 = new double[6];
		arr4=new boolean[8];
		arr5=new String[6];
		//3.배열 사용
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
	}

}
