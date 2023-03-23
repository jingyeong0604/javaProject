package LAB;

public class StringUtil {
//	결과 문자열 : SuperManBatManSpiderMan
//
//	문제 설명 :
//	1.	아래 제시된 소스 코드에 주석으로 된 부분을 채워서 프로그램을 완성한다.
//	2.	String 배열 타입의 파라미터를 받습니다. 
//	3.	인자로 받은 문자열 배열 요소를 하나의 문자열로 결합하고, 결과 문자열을 리턴합니다.

    public static String concatenate(String[] str)
    {	
    	String word="";
    	for(int i=0;i<str.length; i++) {
    		word+=str[i];
    	}
    			return word;
        //문자열을 결합하여 리턴하는 메소드 구현
    }

    public static void main(String args[])  {         
        String[] strArr = {"SuperMan", "BatMan", "SpiderMan"}; 
        String resultStr = concatenate( strArr );
        System.out.println( "결과 문자열 : " + resultStr ); 
    }
}
