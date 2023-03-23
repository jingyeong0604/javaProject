package LAB;

public class StringComparator {

	public static void main(String[] args) {
		  StringComparator sc = new StringComparator();
		  int result1 = sc.compare("Yongari-2001", "DragonWar", true);
		  int result2 = sc.compare("Yongari-2001", "DragonWar", false);	 
		  System.out.println(result1);//12
		  System.out.println(result2);//9 
		  
		
}

	private int compare(String str1, String str2, boolean isLength) {
		// TODO Auto-generated method stub
//		int compare(String str1, String str2, boolean isLength)
//		-	isLength 값이 true 이면 문자열의 길이가 긴 문자열의 문자 개수를 리턴한다.
//		-	isLength 값이 false 이면 문자 ‘a’가 많은 문자열의 문자 개수를 리턴한다.
//		예) compare(“Yongari-2001”, “DragonWar”, true)   ☞  12   
//		예) compare(“Yongari-2001”, “DragonWar”, false)  ☞  9

		if(isLength) {
			int res=str1.length()-str2.length();
			if(res>0) return str1.length();
			else return str2.length();
		}else {
			int cnt1=0;
			int cnt2=0;
			for(int i=0; i<str1.length(); i++) {
				if(str1.charAt(i)=='a') cnt1++;
			}
			for(int i=0; i<str2.length(); i++) {
				if(str2.charAt(i)=='a') cnt2++;
			}
			
			if(cnt1>cnt2) return str1.length();
			else return str2.length();
		}
	}
}