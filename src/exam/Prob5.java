package exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1의 갯수는 3개 입니다.
//2의 갯수는 2개 입니다.
//3의 갯수는 2개 입니다.
//4의 갯수는 4개 입니다.

//answer배열에 저장된 숫자들의 개수를 세어 counter배열에 저장하는 코드이다.  
public class Prob5 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		// 구현하시오 - 숫자들의 개수를 세어 저장하는 코드를 작성한다.
		for(int i=0; i<answer.length; i++) {
			for(int j=1; j<=4; j++) {
				if(answer[i]==j) {
					counter[j-1]++;
				}
			}
		}
		
		
		// 구현하시오 - 출력결과와 같이 나오도록 작성한다.
		for(int i=1; i<=4; i++) {
			System.out.println(i+"의 갯수는 "+counter[i-1]+"개 입니다.");
		}
		
		

	}
}
