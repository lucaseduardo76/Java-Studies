package application;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import model.entities.sum;
import model.exception.DomainException;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Digite o numero: ");
		int a = sc.nextInt();
		boolean test = sum.positiveNumber(a);
		
		if(test) {
			System.out.println("O numero é positivo");
		}
		}catch(DomainException e) {
			System.out.println("Erro: "+ e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Digite oque ta sendo pedido poxa!!");
		}
		sc.close();
		
		
	

	}

}
