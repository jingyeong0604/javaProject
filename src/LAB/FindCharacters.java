package LAB;

public class FindCharacters {
			//	int countChar(String str, char c)
			//	-	문자열의 각 내용들을 비교하여 입력받는 char c의 값과 동일한 char의 개수를 리턴한다.
			//	-	대소문자는 각각 다른 것으로 간주한다.
	int countChar(String str, char c) {
		char[] arr=str.toCharArray();
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==c) {
				cnt++;
			}
		}
		return cnt;
		
	}
	
//	입력 스트링 : String s  = ”Boys, be ambitious”;
//	a.	c = ’i’ 인 경우  =>  2 리턴
//	b.	c = ’b’ 인 경우  =>  2 리턴 (B와 b는 서로 다르므로 다른 것으로 간주)
//
//public static void main(String[] args) {
//	FindCharacters find = new FindCharacters();
//	String str=”Boys, be ambitious”;
//	char ch='i';
//	System.out.println(find.countChar(str,ch));
//	
//}

	


}
