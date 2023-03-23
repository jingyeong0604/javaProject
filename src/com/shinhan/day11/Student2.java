package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor

public class Student2 implements Comparable<Student2> {
	private String name;
	private int score;
	private String gender;
	
	
	@Override
	public int compareTo(Student2 o) {
		
		int res=this.score-o.score;
		if(res==0) {
			return o.name.compareTo(this.name);
		}return res;
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student2 [name=").append(name).append(", score=").append(score).append(", gender=")
				.append(gender).append("]");
		return builder.toString();
	}
	
	
}
