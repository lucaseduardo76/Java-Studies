package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HandleOperations {

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
	
}
