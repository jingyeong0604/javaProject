package LAB;

import java.util.Arrays;

public class Median {
	public static void main(String[] args) {
		Median median = new Median();
		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("===============================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}
//
//	- Math.abs(int) 메소드를 사용하여 평균값과의 차이의 절대값을 계산할 수 있습니다.
//	Median 클래스는 입력 받은 숫자 배열 중 평균값에 제일 가까운 중간 값을 계산하는 클래스 입니다.  
	public int findMedian(int[] values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		
		int middle =sum/values.length;
		System.out.println(middle+"middle");
		int min=Integer.MAX_VALUE;
		for(int i=0; i<values.length; i++) {
			if(Math.abs(values[i]-middle)<min) {
				min=Math.abs(values[i]-middle);
			}
		}
		return min;
		 
		
	}
}
