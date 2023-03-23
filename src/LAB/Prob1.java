package LAB;

public class Prob1 {
	
//	각각의 문자들을 알파벳 상의 세번째 오른쪽 문자로 치환하는 간단한 치환 암호기법(즉, a는 d로, b는 e로, … , x는 a로, y는 b로, z는 c로)입니다.  
//	“everyday we have is one more than we deserve” 라는 문자열에 대해 Caesar Cipher 를 적용하여
//	암호화된 문자열 값을 아래와 같이 출력하도록 Prob1의 클래스의 main 함수를 완성하십시오. (단, 공백에 대해서는 치환을 적용하지 않습니다.) 
	
//	암호화할 문자열 : everyday we have is one more than we deserve
//	암호화된 문자열 : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh
	public static void main(String[] args) {
		String word="everyday we have is one more than we deserve";
		
		//char 배열로 바꾸기
		//현재의 위치에서 +3을 한 알파벳으로 바꿔주기 ->아스키코드 이용?
		
		char[] ch=word.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
		
			char temp=ch[i];
			if(temp!=' ') {
			ch[i]=(char)(Character.getNumericValue(temp)+3+'0');
			}
		}
		
		for(int i=0; i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}


}
