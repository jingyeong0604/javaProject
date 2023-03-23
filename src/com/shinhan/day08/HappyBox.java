package com.shinhan.day08;

public class HappyBox<T> {
	T kind;
	int price;
	
	
	public <T> HappyBox(T kind2, int i) {
		// TODO Auto-generated constructor stub
	}
	public Object getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Box [kind=" + kind + ", price=" + price + "]";
	}
	
	

}
