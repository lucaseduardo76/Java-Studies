package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exception.AccountLimitException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Digite o numero da conta: ");
		int accNumber = sc.nextInt();
		System.out.println("Digite o nome do proprietário da conta: ");
		String owner = sc.nextLine();
		owner = sc.nextLine();
		System.out.println("Saldo inicial: ");
		double initialBalance = sc.nextDouble();
		System.out.println("Digite o limite de saque");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(accNumber, owner, initialBalance, withdrawLimit);
		
		System.out.println("Digite o valor que deseja sacar: ");
		double amount = sc.nextDouble();
		acc.withdraw(amount);
		
		}catch(AccountLimitException e) {
			System.out.println("Error: " + e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Error: Valor digitado incoerente ao tipo");			
		}
		
		sc.close();

	}

}
