package chp15_prc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();

		map.put("hong", 85);
		map.put("hong", 85);
		map.put("hong", 85);
		map.put("hong", 85);

		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + " : " + value);
		System.out.println();

		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println(k +" : "+v);
		}
		System.out.println();
		
		
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		Iterator<Entry<String, Integer>>entry=entrySet.iterator();
		while(entry.hasNext()) {
			Entry<String, Integer> entry = entrySet.iterator();
			
		}
	}
}
