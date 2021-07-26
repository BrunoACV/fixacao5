package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public Account(int number, String name, double inicialDeposit) {
		super();
		this.number = number;
		this.holder = name;
		deposit(inicialDeposit);
	}

	@Override
	public String toString() {
		return "Number: " + number + "\nHolder: " + holder + String.format("\ninicial deposit: %.2f", balance);
	}

	public Account(int number, String name) {
		this.number = number;
		this.holder = name;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String name) {
		this.holder = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withDraw(double amount) {
		balance -= amount + 5.0;
	}

}
