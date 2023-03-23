package exam;

import java.util.LinkedList;
import java.util.Queue;

public class Prob2 {

	public static void main(String[] args) {
		System.out.println(leftPad("Samsung",10,'#'));
		System.out.println(leftPad("SDS",5,'*'));
		System.out.println(leftPad("Multicampus",5,'@'));
		
	}

//	<< 매개변수 정보 >>
//	String str   : 변환하려는 문자열
//	int size     : 변환될 문자열의 길이
//	char fillChar : 빈 공백을 채울 문자
//

	public static String leftPad(String str, int size, char fillChar) throws IllegalSizeException{
		//str: 변환하려는 문자열
		//size: 변환될 문자열의 길이
		//fillChar: 빈 공백을 채울 문자
		
		
//		변환할 수 없는 상황(늘리려는 크기보다 실제 문자열의 길이가 클 경우)이 되면 예외로 간주하여 "
//		라는 예외 메시지를 포함한 IllegalSizeException이라는 사용자 정의 예외를 발생 시킨다. 따라서 IllegalSizeException이라는 사용자 정의 예외클래스를 정의해서 구현해야 한다. 
		try {
			if (str.length() > size) {
				throw new IllegalSizeException("문자열의 길이보다 size가 큽니다.");

			}
		} catch (IllegalSizeException e) {
			System.out.println(e.getMessage());
			
		}
		String nStr = "";
		for (int i = 0; i < size - str.length(); i++) {
			nStr += String.valueOf(fillChar);
		}
		// System.out.println(nStr);
		return nStr + str;
	}
}

//구현하시오.
class IllegalSizeException extends Exception{
	IllegalSizeException(String str){
		super(str);
	}
}



