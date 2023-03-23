package com.shinhan.day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Exception 예외: 프로그래머의 노력으로 프로그램이 중단되지 않고 계속 진행하도록 할 수 있음
public class ExceptionTest {

	public static void main(String[] args) throws IOException {
		System.out.println("main start~");
		try {
			f6();
		} catch (RuntimeException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end~"); 
		  
	}

	private static void f6() throws ClassNotFoundException {
		Class cls = Class.forName("com.shinhan.day06.Book");
		System.out.println(cls.getSimpleName());
		
	} 

	private static void f5() throws IOException {
		// 일반 exception: 컴파일시점에 반드시 해결해야함. 
		//2.이 함수를 호출한 곳에 떠넘긴다. 
		FileReader fr = new FileReader("src/com/shinhan/day06/Book.java");
		int i;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}	
		
	}

	private static void f4() {
		int i;
		//try(){}:try종료후 자원자동반납된다.
		try(FileReader fr = new FileReader("src/com/shinhan/day06/Book.java")) {		
			while((i=fr.read())!=-1){
				System.out.print((char)i);
			}		
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
	}

	private static void f3() {
		// 일반 exception: 컴파일시점에 반드시 해결해야함.
		//1.내가한다 2.떠넘긴다. 
//		FileReader fr = null; 
//		try {
//			fr = new FileReader("ssrc/com/shinhan/day06/Book.java");
//			System.out.println("파일존재한다... 파일이열림");
//			int i;
//			while((i=fr.read())!=-1) {
//				System.out.print((char)i);
//			}
//			
//		} catch (FileNotFoundException  eption e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try { 
//				fr.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			 catch (NullPointerException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}

	}

	private static void f2() {
		//if로 조건체크해서 오류가 없는 코드를 수행하지 않고 try~catch로 처리한 이유
		//업무의 로직과 오류처리 로직을 완전히 분리하기 위해서 
		try {
//			int a=10;
//			int b=0;
//			int[] arr=new int[5];
//			System.out.println(arr[5]);
//			
//			System.out.println(a/b);
			
			String s2=null;
			//System.out.println(s2.length());
			System.out.println("오류 없으면 여기 옴, 오류 있으면 여기는 안옴");
			
		}catch(ArithmeticException e){
			//e.printStackTrace();//오류 과정 출력
			System.out.println(e.getMessage());
		}
		catch(ClassCastException|NumberFormatException ex){
			//e.printStackTrace();//오류 과정 출력
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) { //catch는 하위먼저, 상위 나중에 작성한다.
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("이 부분은 반드시 처리한다.... 자원반납코드를 쓴다. dbdisconnect, fileClose");
		}
		
	}

	private static void f1() {
	//실행예외: 컴파일시에 오류없음, 실행시 오류
		
		
		//기타예외: 컴파일시에 반드시 처리해야한다.
		//ArithmeticException
		int[] arr=new int[5];
		int a=10;
		int b=0;
		
		//System.out.println(arr[2]);
		
		//3.classCastException
		Object obj=new String("자바");
		//System.out.println("obj.toString()");
		String s=(String)obj;
		System.out.println(s.length);
		
		//4.numberFormatException
		String su="100";
		int total=Integer.parseInt(su)+200;
		System.out.println(total);
		
		
		
	}

}
