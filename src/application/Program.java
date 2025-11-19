package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		sc.nextLine();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
				
		Account acc = new Account (number, holder, balance, limit);
		
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		if (withdraw > acc.getWithdrawLimit()) {
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		} else if (withdraw> acc.getBalance()) {
			System.out.println("Not enough balance");
		} else {
			acc.withdraw(withdraw);
			System.out.println("New Balance: " + String.format("%.2f", acc.getBalance()));
		}
		sc.close();;


	}

}
