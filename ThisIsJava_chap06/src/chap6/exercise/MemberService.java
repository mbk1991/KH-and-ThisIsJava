package chap6.exercise;

public class MemberService {

	// �޼ҵ�
	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}

	public void logout(String id) {
		System.out.println(id + "�α׾ƿ� �Ǿ����ϴ�.");
	}

}
