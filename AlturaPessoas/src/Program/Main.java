package Program;
import java.util.Scanner;

import Entitites.Grupo;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão medidadas? ");
		int qntPeople = sc.nextInt();
		
		double[] altPeople = new double[qntPeople];
		
		for(int i = 0; i < qntPeople; i++) {
			System.out.print("Digite a altura da " + (i + 1) + "° pessoa: ");
			altPeople[i] = sc.nextDouble();			
		}
		
		Grupo gp = new Grupo(qntPeople, altPeople);
		
		System.out.print("Alturas: ");
		for(int i = 0; i < qntPeople; i++) {
			System.out.print(gp.getAlturas()[i]);
			if(i < qntPeople - 1) {
				System.out.print(", ");
			}else {
				System.out.println("");
			}
		}
		System.out.println("Media de alturas: "+gp.getMediaAltura());
		sc.close();
		
	}
}
