package aplication;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a medida da matriz: ");
		int matrizSize = sc.nextInt();
		int negativeNumbers = 0;
		int[] diagonal = new int[matrizSize];
		
		
		int[][] a = new int[matrizSize][matrizSize];
		
		for(int i = 0; i < matrizSize; i++) {
			for(int u = 0; u < matrizSize; u++) {
				System.out.println("Digite os numero da " + (i+1) + "° linha e "+ (u+1)+"° coluna: ");
				a[i][u] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < matrizSize; i++) {
			for(int u = 0; u < matrizSize; u++) {
				negativeNumbers = a[i][u] < 0 ? negativeNumbers + 1: negativeNumbers;					
			}
			
			diagonal[i] = a[i][i];
			
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i < diagonal.length; i++) {
			System.out.print(diagonal[i] + " ");
		}
		System.out.println();
		System.out.println("Negative numbers = " + negativeNumbers);
		
		
		sc.close();
		 

	}

}
