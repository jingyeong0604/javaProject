package com.shinhan.day04;

//자바의 최상위 class : Object(toString, equals, ......)

public class Duck {
	private String name;
	private int legs;
	private	int length;
	
	public Duck(String name, int legs, int length) {
		super();//부모
		this.name=name;
		this.legs=legs;
		this.length=length;
	}
	
	public void fly() {
		System.out.println("참새("+name+")은" +"날아다닙니다.");
	}
	public void sing() {
		System.out.println("참새("+name+")은" +"소리내어 웁니다");
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void display() {
		System.out.println("오리의 이름은"
				+name+"입니다. 다리는 "
				+legs+"개이고 길이는 "
				+length+"입니다.");
	}
	@Override
	public String toString() {
		return "Duck [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
	
	
}
