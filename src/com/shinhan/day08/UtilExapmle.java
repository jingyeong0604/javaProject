package com.shinhan.day08;

public class UtilExapmle {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		System.out.println("---------------------------------------");
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원",20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);

	}

}
