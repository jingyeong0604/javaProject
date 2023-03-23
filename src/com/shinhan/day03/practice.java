package com.shinhan.day03;

public class practice {
	public static void main(String[] args) {
		//f1();
		f2();
	}

	private static void f2() {
		// TODO Auto-generated method stub
		int[][] a={{30 ,30, 30 ,30 },{40, 40, 40, 40},{50,50,50 ,50}};
		int[][] b={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] c=new int[a.length][a[0].length];
		int[][] arr=sub(a,b,c);
		print(arr);
		
	}

	private static void print(int[][] k) {
		for(int i=0; i<k.length; i++) {
			for(int j=0; j<k[i].length; j++) {
				System.out.print(k[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static int[][] sub(int[][] a, int[][] b, int[][] c){
		// TODO Auto-generated method stub
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		return c;
	}
	private static void f1() {
		int[] arr=new int[] {3, 24, 1, 55, 17, 43, 5};
		
		int[] newArr=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		
	}

}
