package entities;

import java.util.ArrayList;
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
}
