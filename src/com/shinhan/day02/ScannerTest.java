package com.shinhan.day02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

//java.lang패키지에 있는 class는 import 없이 사용한다.

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		f2();
	}

	private static void f2() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int score=sc.nextInt();
		String name=sc.next();
		System.out.println(name);
		
	}

	private static void f1() throws IOException{
		// TODO Auto-generated method stub
		//사용자 입력받기
		System.out.println("f1 function");
		InputStream is=System.in;
		
		int i;
		while((i=is.read()) != 13) {
			System.out.println((char)i);
		}
		
	}

}
