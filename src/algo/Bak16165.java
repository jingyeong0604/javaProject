package algo;

import java.util.*;
import java.io.*;

public class Bak16165 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//걸그룹의 수 n과 맞혀야할 문제의 수 m 입력
		//팀의 이름, 인원수, 멤버의 이름을 한줄에 입력받음
		//m개의 퀴즈를 입력받음
		//두줄-> 팀의 이름/멤버의 이름이 첫줄에+ 퀴즈 종류 0/1
		//0일 경우 팀의 이름이 주어짐. 멤버의 이름 사전순 출력, 1일 경우 멤버의 이름 주어짐
		//멤버가 속한 팀의 이름 출력
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		HashMap<String, String> map=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		ArrayList<String> list=new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String team=br.readLine();//팀의 이름
			sb=new StringBuilder();
			int num=Integer.parseInt(br.readLine());//팀의 인원수
			for(int j=0; j<num; j++) {
				String members=br.readLine();//멤버 이름
				map.put(team, members);//멤버 맵에 넣기
			}	
		}
		
		
		for(int i=0; i<m; i++) {
			String t=br.readLine();
			int kind=Integer.parseInt(br.readLine());
			if(kind==0) {
				//0입력이 들어오면 이름을 사전순으로 출력
				StringTokenizer st2=new StringTokenizer(map.get(t));
				while(st2.hasMoreTokens()) {
					list.add(st2.nextToken());
				}
				Collections.sort(list);
				for(int j=0; j<list.size(); j++) {
					System.out.println(list.get(j));
				}
				
			}
			
			else {
				Iterator<String> it=map.keySet().iterator();
				while(it.hasNext()) {
					String key=it.next();
					
					StringTokenizer st3=new StringTokenizer(map.get(key));
					while(st3.hasMoreTokens()) {
						String arr=st3.nextToken();
						if(arr.equals(t)) {
							System.out.println(key);
						}
					}
				}
		}
		
		
			}
		}

}
