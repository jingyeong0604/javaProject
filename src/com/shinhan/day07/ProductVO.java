package com.shinhan.day07;

import java.util.Objects;

public class ProductVO {
	private String name;
	private int price;
	private String maker;
//저장하는 법 : 생성자를 통해서 new, setter를 통해서 

	public ProductVO(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + ", maker=" + maker + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maker, name, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; //들어온 객체랑 같은지
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVO other = (ProductVO) obj;
		return Objects.equals(maker, other.maker) && 
				Objects.equals(name, other.name) && 
				price == other.price;
	}
	
	

}