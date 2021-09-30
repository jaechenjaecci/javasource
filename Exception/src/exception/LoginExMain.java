package exception;

public class LoginExMain {
	public static void main(String[] args) {
		
		try {
			login("white","12345");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static void login(String id,String password) throws NotExistIDException1, WrongPasswordException1 {
		//id�� "blue" �� �ƴ϶�� NotExistIDException �߻���Ŵ
		if(!id.equals("blue")) {
			throw new NotExistIDException1("���̵� �������� �ʽ��ϴ�.");
		}
		//password�� "12345"�� �ƴ϶�� WrongPasswordException �߻�
		if(!password.equals("12345")) {
			throw new WrongPasswordException1("�н����尡 Ʋ���ϴ�.");
		}
	}

}

