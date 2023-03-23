package chp6_prac;

public class MemberService {
	String password;
	String id;
	public MemberService() {
		
	}
	public MemberService(String password, String id) {
		this.password=password;
		this.id = id;
	}
	
	boolean login(String id, String password) {
		if(this.id.equals("hong") && this.password.equals("12345")) return true;
		return false;
	}

	public void logout(String string) {
		System.out.println(string+"님이 로그아웃 되었습니다.");
		
	}
}
