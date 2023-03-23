package chp9_prac;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white","12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void login(String id, String password) throws NotExistIdException {
		if(!id.equals("blue")) {
			
			throw new NotExistIdException();
		}
		
	}

}
