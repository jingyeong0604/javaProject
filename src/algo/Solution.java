package algo;

import java.util.*;
import java.io.*;

public class Solution {
	private static int tc;
	private static int n;
	private static int[] dx= {-1,1,0,0};
	private static int[] dy= {0,0,-1,1};
	private static String[][] arr;
	private static boolean[][] visit;
	private static int cnt;
//	private static Queue<int[]> qA;
//	private static Queue<int[]> qB;
//	private static Queue<int[]> qC;
//	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//전체 테스트 케이스 입력받기
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		tc=Integer.parseInt(br.readLine());
		//행의 크기 입력받기
		for(int i=0; i<tc; i++) {
			n=Integer.parseInt(br.readLine());
			arr=new String[n][n];
			visit=new boolean[n][n];
			cnt=0;
			
		// A: 기지국, H: 집
			for(int j=0; j<n; j++) {
				String[] str=br.readLine().split(" ");
				//StringTokenizer st=new StringTokenizer(br.readLine());
				for(int k=0; k<n; k++) {
					arr[j][k]=str[k];
					System.out.print(arr[j][k]);
					if(arr[j][k].equals("A")) {
						//System.out.println("232323232");
						dfs(j,k,"A");
					}
					
					if(arr[j][k].equals("B")) {
						dfs(j,k,"B");
					}
					
					if(arr[j][k].equals("C")) {
						dfs(j,k,"C");
					}
		//기지국A이 있다면 동서남북 탐색 시작->큐에 넣고 탐색
		//만약 기지국이 동서남북 근처에 있다면 또 큐에 넣기
		
		//H는 마지막에 지도 전체를 탐색하며 갯수 세어주기
				}
			}
			checkH();
			System.out.println(cnt);
		}

	}

	private static void checkH() {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visit[i][j] && arr[i][j].equals("H")) {
					//System.out.println("i: "+i + "j: "+j);
					
					cnt++;
				}
			}
		}
		
	}

	private static void dfs(int j, int k, String c) {
		if(c.equals("A")) {
			//System.out.println("j "+j +"k "+k);
			for(int i=0; i<4; i++) {
				
					int nx=j+dx[i];
					int ny=k+dy[i];
					//System.out.println("kk");
					if(isRange(nx,ny,n)) {
						System.out.println("now arr[nx][ny]"+ arr[nx][ny]);
						if(arr[nx][ny].equals("H") && !visit[nx][ny]) {
							//System.out.println("!1111111111111111");

							visit[nx][ny]=true;
						}
					}
				
			}
		}
		if(c.equals("B")) {
			for(int i=0; i<4; i++) {
				for(int l=0; l<2; l++) {
					int nx=j+dx[i];
					int ny=k+dy[i];
				
					if(isRange(nx,ny,n)) {
						if(arr[nx][ny].equals("H") && !visit[nx][ny]) {
							visit[nx][ny]=true;
						}
					}
				}
			}
		}
		
		if(c.equals("C")) {
			for(int i=0; i<4; i++) {
				for(int l=0; l<3; l++) {
					int nx=j+dx[i];
					int ny=k+dy[i];
				
					if(isRange(nx,ny,n)) {
						if(arr[nx][ny].equals("H")&& !visit[nx][ny]) {
							visit[nx][ny]=true;
						}
					}
				}
			}
		}
		
	}

	private static boolean isRange(int nx, int ny,int s) {
		if(nx>=s || ny>=s || nx<0 || ny<0) return false;
		return true;
	}
	
	

}


////4
//9
//X X X X X X X X X 
//X X X H X X X X X
//X X H A H X X H X
//X X H H X X X X X
//X X X X X X X X X
//X X A H H X X X X
//X X H X X H A H X
//X X A H X X H X X
//X X H X H X X X X