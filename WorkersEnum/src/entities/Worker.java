package entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import entities.enums.WorkerLevel;

public class Worker {

	String name;
	Double baseSalary;
	WorkerLevel level;
	Departament departament;
	List<HoursContract> contracts = new ArrayList<>();

	public Worker(String name, Double baseSalary, WorkerLevel level) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public void addContract(HoursContract c) {
		this.contracts.add(c);
	}

	public void removeContract(HoursContract c) {
		this.contracts.remove(c);
	}

	public double income(Integer year, Integer month) {

		//for(HoursContract c : contracts) {
			//if(c.getDate().getYear() == year && c.getDate().getMonth())
		//}
		
		HoursContract c = (HoursContract) contracts.stream().filter(x -> x.getDate().getYear() == year && x.getDate().getMonthValue() == month).findFirst().orElse(null);
		
		return 4.5;

	}
}
