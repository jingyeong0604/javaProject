package chp12_prac;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	//Student의 학번이 같으면 동등 객체가 될 수 있도록 student 클래스 작성
	@Override
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student num) {
			if(studentNum.equals(num.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
	
}
