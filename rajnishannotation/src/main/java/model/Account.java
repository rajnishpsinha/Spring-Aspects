package model;

public class Account {
	private int account_number;
	private int account_balance;
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public int getAccount_balance() {
		return account_balance;
	}
	public Account(int account_number, int account_balance) {
		super();
		this.account_number = account_number;
		this.account_balance = account_balance;
	}
	public void setAccount_balance(int account_balance) {
		this.account_balance = account_balance;
	}

}
