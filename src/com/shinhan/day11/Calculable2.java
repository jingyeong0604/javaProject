package com.shinhan.day11;

//함수형 표현 ...람다식...람다표현식으로 표현가능한지!
// ->interface에 한개의 메소드만 존재함
@FunctionalInterface
public interface Calculable2 { //interface: 추상 메서드를 정의함
	
	int calculate(int x, int y);
	//함수가 하나만 있을 때 람다식 사용 가능
	//검사하는 어노테이션이 존재함.->@FunctionalInterface
	//함수가 하나 더 생기면 람다식 못 만듦.
	
}
