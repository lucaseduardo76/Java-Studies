package entities;

import java.util.ArrayList;
import java.util.List;
import entities.enums.WorkerLevel;

public class Worker {

	Integer id;
	String name;
	Double baseSalary;
	WorkerLevel level;
	Departament departament;
	List<HoursContract> contracts = new ArrayList<>();

	public Worker(Integer id, String name, Double baseSalary, WorkerLevel level, Departament departament) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
		this.level = level;
		this.departament = departament;
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
		
		Double ret = 0.0;
		
		for(HoursContract c : contracts) {
			if(c.getDate().getYear() == year && c.getDate().getMonthValue() == month) {
				ret +=  c.totalValue();
			}
		}
		
		
		return ret;

	}
}
