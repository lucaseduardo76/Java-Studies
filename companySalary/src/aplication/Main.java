package aplication;

import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.HandleEmployee;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeeList;
		employeeList = HandleEmployee.startList(sc);
		boolean verify = true;
		
		
		do {
			
			System.out.print("Escolha uma opção: "
					+ "\n1 - Listar Funcionários "
					+ "\n2 - Adcionar Funcionário "
					+ "\n3 - Aumentar salários de funcionário "
					+ "\n4 - Encerrar programa"
					+ "\nEscolha: ");
			
			int choose = sc.nextInt(); 
			switch(choose) {
				case 1:
					HandleEmployee.showEmployees(employeeList);
					break;
				case 2:
					employeeList.add(HandleEmployee.newEmployee(sc));
					break;
				case 3:
					HandleEmployee.increaseSal(employeeList, sc);
					break;
				case 4:
					verify = false;
				default:
					System.out.println("Opção inválida!");
			}
		}while(verify);
		
		
		
		sc.close();		
	}
	



}


