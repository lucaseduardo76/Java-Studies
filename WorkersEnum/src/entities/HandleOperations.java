package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import entities.enums.WorkerLevel;

public class HandleOperations {
	
	public static Worker createWorker(Scanner sc) {
		System.out.println("Digite o nome  do departamento: ");
		String dpName = sc.nextLine();
		dpName = sc.nextLine();
		Departament depart = new Departament(dpName);
		
		System.out.println("Digite os dados do trabalhadores: ");
		System.out.print("Digite o id: ");
		int id = sc.nextInt();
		
		System.out.print("Nome: ");		
		String name = sc.nextLine();
		name = sc.nextLine();
		boolean chooseLevel = true;
		String level = "";
		
		do{
			System.out.print("Digite o nivel do funcionario: \n"
					+ "1 - JUNIOR \n"
					+ "2 - MID LEVEL \n"
					+ "3 - SENIOR");
			int option = sc.nextInt();
			
			switch(option) {
				case 1:
					level = "JUNIOR";
					chooseLevel = false;
					break;
				case 2:
					level = "MID_LEVEL";
					chooseLevel = false;
					break;
				case 3:
					level = "SENIOR";
					chooseLevel = false;
					break;
				default:
					System.out.println("Opção invalida");
					break;
				
			};
		
		}while(chooseLevel);
		
		System.out.print("Digite o salario base: ");
		double baseSalary = sc.nextDouble();
		
		System.out.print("Quantos contratos esse funcionario tem? ");
		int amountContract = sc.nextInt();
		
		Worker worker = new Worker(id, name, baseSalary, WorkerLevel.valueOf(level), depart);
		
		for(int i = 1; i <= amountContract; i++) {
			System.out.println("Insira os dados do contrato N° " + i);
			HandleOperations.createContract(sc, worker);
		}
		
		return worker;
	}

	public static void createContract(Scanner sc, Worker w) {
		
		System.out.println("Data: (DD/MM/AAAA)");
		String date = sc.next();
		
		System.out.println("Qual o valor por hora do contrato? ");
		double valueHour = sc.nextDouble();
		
		System.out.println("Duração do contrato: (Horas)");
		int duration = sc.nextInt();
		
		LocalDate dateFormated = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		HoursContract newContract = new HoursContract(dateFormated, valueHour, duration);
		
		w.addContract(newContract);
	}
	
	public static void showSalary(List<Worker> workers,Scanner sc) {
		
		System.out.println("Digite o id do colaborador que deseja ver o salario: ");
		int idToCheck = sc.nextInt();
		Worker selectedWorker = workers.stream().filter(x -> x.getId() == idToCheck).findFirst().orElse(null);
		
		if(selectedWorker != null) {
			System.out.println("Funcionario encontrado, " + selectedWorker.getName());
			System.out.println("Digite o mes que deseja ver o valor recebido por esse funcionario: ");
			int mes = sc.nextInt();
			
			System.out.println("Agora digite o ano: ");
			int ano = sc.nextInt();
			
			
			System.out.println("O valor total recebindo por esse funcionario no mes "+mes+"/"+ano+" foi de : "+ selectedWorker.income(mes, ano));
		}else {
			System.out.println("Não consegui encontrar esse fi de jesus");
		}
		
		
	}
	
}
