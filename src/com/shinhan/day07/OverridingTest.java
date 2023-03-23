package com.shinhan.day07;

import java.util.Objects;

//
//예) 
//MySum ms1 = new MySum(i, j);
//MySum ms2 = new MySum(j, i);
//String s1 = new String("30");
//ms1.equals(ms2) 호출 결과는 true입니다.
//ms1.equals(s1) 호출 결과는 false입니다.
//
//<출력결과>
//
//30
//30
//ms1과 ms2의 합계는 동일합니다.
//ms1과 s1의 값은 동일하지 않습니다.

class OverridingTest {
    public static void main(String args[]){
        int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(i, j);
        String s1="30";
        
        System.out.println(ms1);

        if(ms1.equals(ms2))
            System.out.println("ms1과 ms2의 합계는 동일합니다.");

        if(ms1.equals(s1)) {
            System.out.println("ms1과 s1는 동일합니다.");
        }
        else{
            System.out.println("ms1과 s1는 동일하지않습니다.");
        }
    }
}
//조건1: main 메소드에서 MySum 객체를 출력하면 
//객체 생성시에 전달한 두 정수의 덧셈 결과를 출력하도록 
//toString 메소드를 오버라이딩합니다.
//
//예) 
//MySum ms1 = new MySum(i, j);
//System.out.println(ms1);

class MySum {
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

	

    /* 조건1 */
    //Object의 toString은 주소를 문자로 return
    @Override
	public String toString() {
		//return "MySum [first=" + first + ", second=" + second + "]";
    	return String.valueOf(first + second);
    }



	@Override
	public int hashCode() {
		return Objects.hash(first, second);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySum other = (MySum) obj;
		return first+ second== other.first + other.second;
	}

    /* 조건2 */
	//
	//호출시에 출력값은 i와 j의 산술 연산 덧셈 결과입니다.
	//(참고 : String.valueOf 메소드는 int를 String으로 변경합니다)
	//
	//조건2: main 메소드에서 MySum 클래스의 equals 메소드 호출시 
	//전달하는 매개변수가 MySum 객체를 참조하고 현재 객체의 
	//toString 메소드와 전달 객체의 toString 메소드 내용이 동일하면 
	//true를 리턴하고 나머지 경우에는 false 를 리턴하도록 
	//equals 메소드를 오버라이딩합니다.
    
    //object의 equals는 주소 비교
//	@Override
//	public boolean equals(Object obj) {
//		if(!(obj instanceof MySum)) return false;
//		MySum my = (MySum)obj;
//		//return first+second ==(my.first + my.second);//방법 1
//		return this.toString().equals(my.toString());//방법 2
//	}

}


