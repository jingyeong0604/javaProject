package chp15_prc;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
//		Set<Student> set = new HashSet<Student>();
//		
//		set.add(new Student(1, "홍길동"));
//		set.add(new Student(2, "신용권"));
//		set.add(new Student(1, "조민우"));
//		
//		System.out.println("저장된 객체 수:"+ set.size());
//		for(Student s: set) {
//			System.out.println(s.studentNum+":"+s.name);
//		}
		
		Set<String> set= new HashSet<>();
		
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("spring");
		
		//set을 가져올때는 iterator 사용
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("JSP")) iterator.remove();
			
		}
		System.out.println();
		
		set.remove("JDBC");
		
		for(String element : set) {
			System.out.println(element);
		}
	}
	

}
