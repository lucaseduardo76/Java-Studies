package Application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import models.entities.CarRental;
import models.entities.Vehicle;
import models.service.BrazilTaxService;
import models.service.RentalService;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
		
			System.out.println("Entre com os dados do aluguel");
			System.out.print("Modelo do carro: ");
			String model = sc.nextLine();
			
			System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
			LocalDateTime start = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
			
			System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
			LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
			
			System.out.print("Entre com o preço por hora: ");
			Double valueHour = sc.nextDouble();
			
			System.out.print("Entre com o valor por dia: ");
			Double valueDay = sc.nextDouble();
			
			CarRental carRental = new CarRental(start, finish, new Vehicle(model));
			
			new RentalService(valueHour, valueDay, new BrazilTaxService(), carRental);
			
			System.out.println("FATURA: ");
			System.out.println("Pagamento basico: "+ carRental.getInvoice().getBasicPayment());
			System.out.println("Imposto: "+ carRental.getInvoice().getTax());
			System.out.println("Pagamento Total: " + carRental.getInvoice().totalPayment());
		}catch(DateTimeParseException e) {
			System.out.println("A formatação da data e hora deve seguir o exemplo...");
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	
		

	}

}
