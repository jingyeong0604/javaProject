package com.shinhan.day04;

public class EmployeeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1();
	}
//	public Employee(String name, String title, int baseSalary) {
//
//	부장 직급의 이부장씨의 본봉은 1500000 원이고 총급여는 1875000 원입니다.
//	과장 직급의 김과장씨의 본봉은 1300000 원이고 총급여는 1495000 원입니다.
//	대리 직급의 최대리씨의 본봉은 1200000 원이고 총급여는 1260000 원입니다.
//	사원 직급의 박사원씨의 본봉은 1000000 원이고 총급여는 1050000 원입니다.

	private static void f1() {
		Employee[] em=new Employee[4];
		em[0]=new Employee("이부장","부장",1500000);
		em[1]=new Employee("김과장","과장",1300000);
		em[2]=new Employee("최대리","대장",1200000);
		em[3]=new Employee("박사원","사장",1000000);
		

		
		for(int i=0; i<4; i++) {
			em[i].print();
		}
		
	}

}
