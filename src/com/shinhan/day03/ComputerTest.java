package com.shinhan.day03;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
		
	}

	private static void f1() {
		// TODO Auto-generated method stub
		Computer com1=new Computer();
		Computer com2=new Computer("SAMSUNG1234");
		System.out.println("생성된 컴퓨터개수:"+Computer.count);
		Computer com3=new Computer("LG123","WINDOW", 30000);
		System.out.println("생성된 컴퓨터개수:"+com1.count);
		System.out.println("생성된 컴퓨터개수:"+com2.count);
		System.out.println("생성된 컴퓨터개수:"+Computer.count);
		
		
		
		display(com1);
		display(com2);
		display(com3);
		
		com3.computerInfoPrint();
	}

	private static void display(Computer com1) {
		System.out.println("================");
		System.out.println(com1.getModel());
		com1.computerInfoPrint();
	}

}
