package com.shinhan.day03;

import java.util.Scanner;

public class 진경 {
	private static int num;
	private static int student;
	private static int[] arr;
	public static void main(String[] args) {
		// chp5
		//f6();
		//f7();
		
		//f8();
		f9();
		
		//chp6
		
		
		
	}

	

	private static void f9() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 |4.분석 |5.종료");
		System.out.println("--------------------------------------------");
	
		student=0;
		while(true) {
			System.out.print("선택>");
			num=sc.nextInt();
			if(num==1) {
				System.out.print("학생수>");
				student=sc.nextInt();
				continue;
			}else if(num==2) {
				arr=new int[student];
				for(int i=0; i<arr.length; i++) {
					System.out.print("score["+i+"]: ");
					int a=sc.nextInt();
					arr[i]=a;
			}
			continue;
			}else if(num==3) {
				for(int i=0; i<arr.length; i++) {
				
				System.out.println("scores["+i+"]"+arr[i]);
			}
			continue;
			}else if(num==4){
				int max=0; int sum=0;
				for(int i=0; i<arr.length; i++) {
					if(max<arr[i]) max=arr[i];
					sum+=arr[i];
			}
			System.out.println("최고 점수:"+max);
			System.out.println("평균 점수:"+(double)sum/arr.length);
			continue;
		}else {
			System.out.println("프로그램 종료");
			break;
		}
	}
	}

	private static void f6() {
		// TODO Auto-generated method stub
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}

		};
		System.out.println(array.length);
		System.out.println(array[2].length);
	}

	private static void f7() {
		int[] array= {1,5,3,8,2};
		int max=0;
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		
		System.out.println("max : "+max);
		
	}

	private static void f8() {
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}	
				};
		int sum=0; int bookSum=0;
		int avg=0;
		for(int i=0; i<array.length; i++) {
			bookSum=0;
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
				bookSum+=array[i][j];
			}
			System.out.println("avg " +(j+1)+": " +bookSum/array[i].length);
		}
		System.out.println("sum: "+sum);
		
	}

}
