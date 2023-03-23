package chp15_prc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("blue" ,96);
		map.put("hong" ,86);
		map.put("white" ,92);
		
		String name=null;
		int maxScore=0;
		int totalScore = 0;
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		
		int max=0;
		
		while(it.hasNext()) {
			int n=it.next().getValue();
			max=Math.max(max, n);
			totalScore+=n;
			
		}
		for(String key:map.keySet()) {
			
		}	
		System.out.println();
		System.out.println("평균 점수: "+(totalScore/map.size()));
		System.out.println("최고 점수: "+ max);
		System.out.println("최고 점수를 받은 아이디: "+ );

	}

}
