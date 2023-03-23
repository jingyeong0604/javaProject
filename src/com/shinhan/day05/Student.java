package com.shinhan.day05;

//접근권한: public, protected, 생략, private 중에서 하나 선택
//활용방법: static, final 여러개 선택 가능
public class Student {
	
	//1. field(date 저장하기 위한 변수들 정의) : instance 변수(각자 다른 변수), static 변수(다같이 사용되는 변수)
	private String stdId;//이 클래스 안에서만 학번을 사용하고 싶음.->studnet class내에서만 접근 가능
	public String name;//public: 모든 패키지에서 접근이 가능함.
	String major;//생략: 같은 패키지에서만 접근 가능
	protected int score; //protected: 같은 pacakge에서 접근가능, 다른 package이면 자식은 접근 가능.
	public final String schoolName = "신한금융대학"; //final : 초기화 1회(선언시, 생성시)
	public static final String NATION="대한민국"; //static final : 상수, class 변수 , 초기화 1회(선언시)
	public static int count; //class 변수, 접근 제한자 생략: 같은 패키지에서 접근 가능
	
	public Student(String stdId, String name) {
		//default 생성자 ->컴파일 시에 자동으로 .class에 추가됨.
		//재정의 하면 생성 안됨.
		this(stdId,name,null,0);//아는것은 필드값 넣어주고 아닌경우는 초기값 설정해주기
		
	}
	public Student(String stdId, String name, String major) {
		this(stdId, name, major, 0);
	}
	
	public Student(String stdId, String name, String major, int score) {
		super(); //부모를 가져옴.-> object를 만드는 역할을 함.
		this.stdId = stdId;
		this.name = name;
		this.major = major;
		this.score = score;
		count++;
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public static String getNation() {
		return NATION;
	}
	
	@Override
	public String toString() {
		return "Student정보 [stdId=" + stdId + ", name=" + name + ", major=" + major + ", score=" + score + ", schoolName="
				+ schoolName + "]";
	}
	
	
	
}
