package algo;
//4 3
//1 2 3 4
//2 3 4 5
//3 4 5 6
//4 5 6 7
//2 2 3 4
//3 4 3 4
//1 1 4 4

import java.util.StringTokenizer;
import java.util.*;
import java.io.*;

public class b_11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> q=new PriorityQueue<>();
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			q.add(Long.parseLong(st.nextToken()));
		}
		
		for(int i=0; i<m; i++) {
			Long a=q.poll();
			Long b=q.poll();
			q.add(a+b);
		}
		Long ans=0L;
		for(int i=0; i<q.size(); i++) {
			ans+=q.poll();
		}
		System.out.println(ans);
		
		
	}

}
