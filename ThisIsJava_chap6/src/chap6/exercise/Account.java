package chap6.exercise;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	private int balance;

	public void setBalance(int balance) {
		
		if((balance>MAX_BALANCE) || (balance<MIN_BALANCE)) {
			return;
		}
		
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

}
