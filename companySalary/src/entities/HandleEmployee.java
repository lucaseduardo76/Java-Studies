package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandleEmployee {
	public static List<Employee> startList(Scanner sc) {
		
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int employeeQuantity = sc.nextInt();		
		
		for(int u = 1; u <= employeeQuantity; u++) {
			Employee fastEmployee = newEmployee(sc);
			employeeList.add(fastEmployee);			
		}
		
		return employeeList;
	}
	
	public static Employee newEmployee(Scanner sc){
		
		
		System.out.printf("Digite o nome do funcionário: ");
		String name = sc.next();
		
		System.out.printf("DIgite o salario atual do funcionário: ");
		double salary = sc.nextDouble();
		
		System.out.printf("Digite o ID do funcionário: ");
		int id = sc.nextInt();
		
		
		return new Employee(name, salary, id);		
	}
	
	public static void showEmployees(List<Employee> list) {
		int count = 1;
		for(Employee emp : list) {
			System.out.println("");
			System.out.println("Funcionário #" + count);
			System.out.println(emp.toString());
			System.out.println("|----------------------------------------|");	
			System.out.println(" ");		

			count += 1;
		}
	}
	
	public static void increaseSal(List<Employee> list,Scanner sc) {
		
		System.out.println("Digite o id do funcionario: ");
		int id = sc.nextInt();
		
		Employee employeeToIncrease = (Employee) list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		
		if(employeeToIncrease != null) {			
			System.out.println("Digite quantos por cento será aumento no salario de " + employeeToIncrease.getName());
			employeeToIncrease.increaseSalary(sc.nextDouble());			
		}else {			
			System.out.println("ID não encontrado!");			
		}
		
	}
}
