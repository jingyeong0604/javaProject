package com.shinhan.day07;

public class ProductTest {
	public static void main(String[] args) {
		ProductVO[] productList = { new ProductVO("마이쭈", 25000, "Samsong"), new ProductVO("꿈틀이", 32000, "Samsong"),
				new ProductVO("짱구", 17050, "Samsong"), new ProductVO("새우깡", 24500, "Samsong"),
				new ProductVO("고소미", 75000, "Daehoo") };
		
		productList = selectProduct(productList, 25000);
		for (int i = 0; i < productList.length; i++) {
			System.out.println(productList[i].toString());
		}
	}
	// 매개변수로 들어온 배열에서 가격이 특정 금액 이상인 상품만 추출하여 새로운 배열에 담아서 리턴하는 메서드를 구현하시오.

	//Object를 상속받아서 ProductVo만든것이다.
	//자동형변환 : 부모타입의 참조 변수 = 자식객체
	private static ProductVO[] selectProduct(Object[] productList, int i) {
		//static이 붙었으므로 클래스꺼여서 새로 객체를 만들어서 접근할 필욘 없음.
		
		
		//i금액 이상인거
		//강제형변환이 필요함.->자식타입의 참조변수= 부모객체
		//전제조건 : 부모 객체가 자식타입에서 자동형변환 된 경우만 가능.->이 문제에서는 productvo로만 바꿔야함.
		
	
		int index=0;
		for(Object obj: productList) {
			
			//ProductVO prd=(ProductVO)productList[j];
			if((obj instanceof ProductVO product)){//아니면 for문 실행
			if(product.getPrice()>=i) {
				//plist[index]=product;
				index++;
			}
			}
		
	}
		ProductVO[] plist = new ProductVO[index];
		index=0;
		for(Object obj: productList) {
			
			//ProductVO prd=(ProductVO)productList[j];
			if(obj instanceof ProductVO product){//아니면 for문 실행
			if(product.getPrice()>=i) {
				plist[index]=product;
				index++;
			}
			}
		
	}
		return plist;
	
	
}
}
