package com.shinhan.day05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterFaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f3();
		
	}

	private static void f5() {
		String[] arr=new String[] {
				"자바","SQL","WEB","SPRING"
		};
		//List, Set, Map
		//List interface : 순서있고, 중복 가능,ArrayList, Vector, LinkedList

		//Set: 순서없고 중복 불가능
		List<String> data=new LinkedList<String>();
		data.add("자바");
		data.add("SQL");
		data.add("WEB");
		data.add("SPRING");
		print(data);
		
	}
	static void print(List<String> data) {
		for(String s: data) {
			System.out.println(s);
		}
	}
	private static void f3() {
		f4(new Television());
		f4(new Audio());
		
	}

	//자동형변환 + override ==>다형성
	//사용법은 같고 결과는 다양하다.
	private static void f4(RemoteControl remote) {
		remote.powerOn();
		remote.powerOff();
		remote.display();
		RemoteControl.display2();//static 호출
		
		if(remote instanceof Audio audio) {
			audio.display2();
			audio.wifiTurnOn();
		}
		
		if(remote instanceof WIFI wf) {
			wf.wifiTurnOn();
		}
		
	}

	private static void f2() {
		// TODO Auto-generated method stub
		String s1="A";
		String s2="Z";
		
		System.out.println(s1.compareTo(s2));
	}

	private static void f1() {

		//1.객체 생성
		OracleDb db=new OracleDb(); 
		//OracleDB사용

		//Sybase bb 사용
		
		
	}
	private static void use(JDBCInterface db) {
		db.dbConnect("데이터베이스!!" );
	}

}
