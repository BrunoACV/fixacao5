package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an inicial deposit(y/n)? ");
		char decision = sc.next().charAt(0);
		if (decision == 'y') {
			System.out.print("Enter an initial deposit: ");
			double inicialDeposit = sc.nextDouble();
			account = new Account(number, holder, inicialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();

		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withDraw value: ");
		double withDraw = sc.nextDouble();

		account.withDraw(withDraw);
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();
	}

}
