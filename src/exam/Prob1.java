package exam;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1 {
	public static void main(String[] args) {
		String[] array={"황남기85점","조성호89점","한인성88점","독고정진77점"};
		printMaxScore(array);
	}	
	private static void printMaxScore(String[] array){
		// 구현하세요.
//		문자배열에서 점수가 가장 큰 학생의 이름과 점수를 출력하는 메소드를 구현하시오. (배열에 저장된 정보는 수정될 수 있음을 고려하시오.)  
		String resname="";
		String name="";
		String s="";
		int max=0;
		//사람과 점수 split
		LinkedList<String> list=new LinkedList<>();
		String[] n=new String[array.length];
		String[] score=new String[array.length];
		
		int nIdx=0; int sIdx=0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length()-1; j++) {
				if(!(array[i].charAt(j)>'1' && array[i].charAt(j)<='9')) {
					//name+=array[i].charAt(j);
					name+=String.valueOf(array[i].charAt(j));
				}else {
					s+=array[i].charAt(j);
				}
				
			}
			int a=Integer.parseInt(s);
			if(max<a) {
				max=a;
				resname=name;
			}
			name="";
			s="";
		}
		
		System.out.println("최고점수는 "+resname+"님 "+max+"점 입니다.");

		 //sol 2
		for(String str: array) {
			char[] charArr = str.toCharArray();
			//solution 1)
//			for(char ch: charArr) {
//				
//				if(Character.isDigit(ch)) {
//				}
//			}
			
			//solution 2)
			String name="";
			String score="";
			int max=0;
			String maxName="";
			for(int i=0; i<charArr.length-1; i++) {
				if(Character.isDigit(charArr[i])) score+=charArr[i];
				else name+=charArr[i];
			}
			if(Integer.parseInt(score)>max) {
				max=Integer.parseInt(score);
				maxName=name;
				
			}
		}
		
		
		//sol3
		int maxScore=-1;
		String maxName="";
		for(String str: array) {
			String regExp = "([가-힣]+)([0-9]+)점";
			Pattern pat = Pattern.compile(regExp);
			pat.matcher(regExp);
			Matcher mat = pat.matcher(str);
			
			
			if(mat.find()) {
				//들어온 문자 이름과 점수로 분리
				String name = mat.group(1);
				String score = mat.group(2);
				int iScore = Integer.parseInt(score);
				if(maxScore<iScore) {
					maxScore=iScore;
					maxName=name;
				}
			}
				
			}
		}
	}	
}
