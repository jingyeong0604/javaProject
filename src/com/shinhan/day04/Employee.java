package com.shinhan.day04;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	public Employee(String name, String title, int baseSalary) {
		this.name=name; //문자가 더해져서 주소값이 바뀜 따라서 equals로 비교해줘야함.
		this.title=title+"님";
		this.baseSalary=baseSalary;
		getTotalSalary();
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}


	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}


	public void getTotalSalary() {
		if(title.equals("부장님")) {
			totalSalary=(int) (baseSalary+(baseSalary*0.25));
		}else if(title.equals("과장님")) {
			totalSalary=(int) (baseSalary+(baseSalary*0.15));
		}else {
			totalSalary =(int) (baseSalary+(baseSalary*0.05));
		}
	}
	void print() {

			System.out.println(title+" 직급의 "
							+ name+"씨의 본봉은 "
							+baseSalary+"이고 총 급여는 "
							+totalSalary+" 원입니다.");
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", title=" + title + ", baseSalary=" + baseSalary + ", totalSalary="
				+ totalSalary + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(baseSalary, name, title, totalSalary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return baseSalary == other.baseSalary && Objects.equals(name, other.name) && Objects.equals(title, other.title)
				&& totalSalary == other.totalSalary;
	}


	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		int res = name.compareTo(emp.name);
		int res2 = baseSalary-emp.baseSalary;
		if(res==0) return res2;
		if(res2==0) return title.compareTo(emp.title);
		
		return res;
		
	}
	
	
	

}
