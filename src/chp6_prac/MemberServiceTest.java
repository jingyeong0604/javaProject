package chp6_prac;

public class MemberServiceTest {
	
	public static void main(String[] args) {
		f1();
		
	}

	private static void f1() {
		// TODO Auto-generated method stub 
		MemberService memberService=new MemberService();
		boolean result=memberService.login("hong","1234");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
