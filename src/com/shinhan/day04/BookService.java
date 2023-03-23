package com.shinhan.day04;

//BookMgr 클래스의 제약조건 
//1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
//2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
//3. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
//4. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 

//Service : Business logic 구현
public class BookService {
	private BookVO[] booklist;
	
	public BookService(BookVO[] booklist) {
		this.booklist=booklist;
	}
	

	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		
		
		for(BookVO book: booklist) {
			//System.out.println(book.getTitle());
			System.out.println(book);
		}
	}
	
	public void printTotalPrice() {
		System.out.println("=== 책 가격의 총합 ===");
		int sum=0;
		for(BookVO book: booklist) {
			sum+=book.getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+ sum);
	}
}
