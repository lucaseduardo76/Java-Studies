package entities;

public class Employee {
	private String name;
	private Double salary;
	private Integer id;
	
	public Employee(String name, Double salary, Integer id) {	
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public boolean increaseSalary(double percenteToEncrease) {
		
		if(percenteToEncrease <= 0) {
			System.out.println("PERCENTUAL DE AUMENTO INVÁLIDO!");
			return false;
		}
		
		double newSalary = this.salary + this.salary * (percenteToEncrease / 100);
		
		this.setSalary(newSalary);
		
		return true;
	}

	@Override
	public String toString() {
		return "ID: "+ this.id + 
				"\nNome: " + this.name +
				"\nSalary: "+ this.salary;
	}
	
	
	
	
	
}
