package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student 정보 [name=").append(name).append(", score=").append(score).append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Student o) {
		
		int res=this.score-o.score;
		if(res==0) {
			return o.name.compareTo(this.name);
		}return res;
		
		
	}
	
	
}
