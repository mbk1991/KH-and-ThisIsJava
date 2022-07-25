package chap6.exercise;

public class MemberService {

	// 메소드
	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}

	public void logout(String id) {
		System.out.println(id + "로그아웃 되었습니다.");
	}

}
