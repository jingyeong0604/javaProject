package com.shinhan.day03;

public class Spliting {
	
//	임의의 문자열(String str)과 구분자(char separator)를 입력 받아 
//	str에 포함된 구분자를 기준으로 str을 문자열 배열로 만들어 반환하는 기능의 split() 메소드를 작성하세요.
//
//	<<수행결과>>
//	배열 크기 : 4
//	서울시 강남구 역삼동 삼성SDS멀티캠퍼스
//
//	<<참고 및 주의사항>>
//	- String 클래스의 split() 메소드를 사용하지 말고 직접 구현해야 합니다.
//	- main 메소드의 내용은 채점하지 않으므로 테스트 목적으로 수정할 수 있습니다.
//	- 주어진 메소드의 signature는 변경하지 않습니다.

	
	//class :object를 만드는 틀
	//object: class를 이용해서 만든 독립된 개체, instatnce (실체)
	
	public static void main(String[] args) {
		Spliting p = new Spliting();
		
		String addr = "서울시,강남구,역삼동,삼성SDS멀티캠퍼스";
		
		String[] addrArr = p.split(addr, ',');
//		
//		String[] arr=addr.split(",|@|#");
//		for(String s: arr) {
//			System.out.println(s);
//		}
		System.out.println("배열 크기 : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}		
	}

	public String[] split(String str, char separator){
		String res="";
		int cnt=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==separator) {
				//몇 개의 단어로 이루어져있는지 cnt 변수로 확인하기
				cnt++;
				continue;
			}
		
		}
		//cnt 변수로 새로운 배열을 만들어줌
		//ans배열에 ,나오기 전까지의 캐릭터값을 더해줌.
		//,가 나오지 않앗다면 인덱스 더해주기(다음 인덱스에 캐릭터들 넣기 위해)
		//System.out.println(cnt);
		String[] ans=new String[cnt+1];
		int len=0; int a=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==separator) {
				len++;
				System.out.println("!11111111");
				continue;
				
			}else {
				ans[len]+=str.charAt(i);
				//System.out.print(str.charAt(i)+" ");
				
			}
			//System.out.println();
		
		}
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		return ans;
		
		
		
}



}
