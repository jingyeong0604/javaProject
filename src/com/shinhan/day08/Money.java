package com.shinhan.day08;

//1.	사칙 연산 메쏘드(add, minus, multiply, devide)에서는 자신의 금액(amount)과 인자로 넘어온 Money 객체의 금액(amount)을 계산하고, 
//계산된 금액으로 새로운 Money 객체로 생성하여 리턴한다.
//2.	equals 메쏘드에서는 인자로 넘어온 Object 객체가 Money 타입인지를 확인하고, 
//Money 타입인 경우에 금액이 동일한지를 확인한다. 이 두가지 조건이 만족하는 경우에 true를 리턴한다.

public class Money implements Comparable<Money>{
    int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    
    public Money add(Money money) {
        //더하기 구현
    	
    	return new Money(amount+money.amount);
    	
    }
    public Money minus(Money money) {
        //빼기 구현
    	return new Money(amount-money.amount);
    }
    public Money multiply(Money money) {
        //곱하기 구현
    	return new Money(amount * money.amount);
    }
    public Money devide(Money money) {
        //나누기 구현
    	return new Money(amount/money.amount);
    } 
    public boolean equals(Object object) {
        //Object equals 메쏘드 재정의
//    	if(object instanceof Money money) {
//    		if(object.equals(money)) return true;
//    		return false;
//    	}
//    	return false;
    	
    	//주소 같으면 같아.
    	if(this==object) return true;//주소 같으면 같다.
    	if(object==null || getClass() !=object.getClass()) return false;
    	return amount == ((Money)object).amount;
    }
    
    public static void main(String[] args){
        Money five  = new Money(5);
        Money two   = new Money(2);
        Money three = new Money(3);
        Money ten   = new Money(10);
        
        if( five.equals(two.add(three))
            && three.equals(five.minus(two))
            && ten.equals(five.multiply(two))
            && two.equals(ten.devide(five)) )  {
            System.out.println("Money Class 구현을 완료 하였습니다.");
        }
    }



	@Override
	public int compareTo(Money obj) {
		// TODO Auto-generated method stub
		
		return (amount-obj.amount)*-1; //-1 0 1 ->asending sort 
	}


}


