package com.shinhan.day09;

import java.util.Arrays;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"title","price"})//동일성 체크->동등 비교(기본:주소, 재정의:내용)

public class Book<T> extends Object implements Comparable<Book> {
	private T title;//book을 사용할 때 결정되는 T타입
	private int price;
	private String publisher;
	private String[] author;
	private static int count;
	private static final String COMPANY = "신한출판사";
	
	@Override
	public int compareTo(Book obj) {
		
		return this.price-obj.price;//나의 가격-들어온 책의 가격 ->음수라면 앞에가 작음(디폴트 순서 즉 어센딩)
	}
	
	
	public static<T> Book<T> makeBook(T title, int price) {
		return new Book<>(title,price,"홍대출판사",new String[] {"ㄴㅇㄹ","ㅎㅇㄹ"});
	}
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(price, title);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return price == other.price && Objects.equals(title, other.title);
//	}
	
//	@Override
//	public String toString() {
//		return "Book [title=" + title + ", price=" + price + ", publisher=" + publisher + ", author="
//				+ Arrays.toString(author) + "]";
//	}
	
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getPublisher() {
//		return publisher;
//	}
//	public void setPublisher(String publisher) {
//		this.publisher = publisher;
//	}
//	public String[] getAuthor() {
//		return author;
//	}
//	public void setAuthor(String[] author) {
//		this.author = author;
//	}
	
	public static int getCount() {
		return count;
	}
	
//	public static void setCount(int count) {
//		Book.count = count;
//	}
//	public static String getCompany() {
//		return COMPANY;
//	}
//	
//	public Book() {
//		
//	}
//	
	public Book(T title, int price, String publisher, String[] author) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.author = author;
		count++;
	}
	
	
}
