package chap6.exercise;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("�����ܰ� : " + account.getBalance());

		account.setBalance(-100);
		System.out.println("�����ܰ� : " + account.getBalance());

		account.setBalance(20000000);
		System.out.println("�����ܰ� : " + account.getBalance());

		account.setBalance(300000);
		System.out.println("�����ܰ� : " + account.getBalance());
	}
}
