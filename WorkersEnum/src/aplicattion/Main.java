package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.HandleOperations;
import entities.Worker;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		List<Worker> workerList = new ArrayList<>();
		
		boolean cont = true;
		int choose;
		while(cont) {
			System.out.println("Escolha uma das opções abaixo \n"
				+ "1 - Adicionar novo trabalhador \n"
				+ "2 - Conferir salario total de um colaborador: \n"
				+ "3 - Encerrar programa");	
			choose = sc.nextInt();
			
			switch(choose) {
				case 1:
					Worker w = HandleOperations.createWorker(sc);
					
					workerList.add(w);
					break;
					
				case 2:
					HandleOperations.showSalary(workerList, sc);
					break;
				case 3:
					choose = 3;
					cont = false; 
					break;
				default:
					System.out.println("Escolha inválida");
					
					break;
			}
			
				
				
			
		}
		
		
		
		
		
		sc.close();
	}
}
