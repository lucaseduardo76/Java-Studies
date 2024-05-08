package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import entities.enums.WorkerLevel;

public class HandleOperations {
	
	public static Worker createWorker(Scanner sc) {
		System.out.println("Digite o nome  do departamento: ");
		Departament depart = new Departament(sc.nextLine());
		
		System.out.println("Digite os dados do trabalhadores: ");
		System.out.print("Digite o id: ");
		int id = sc.nextInt();
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Digite o nivel do funcionario: ");
		String level =  sc.nextLine();
		
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
	
	public static void showSalary(List<Worker> workers) {
		
		System.out.println("Digite o id do colaborador que deseja ver o salario: ");
		
		for(Worker w : workers) {
			System.out.println();
		}
		
	}
	
}
