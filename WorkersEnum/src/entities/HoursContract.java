package entities;

import java.time.LocalDate;

public class HoursContract {
	private LocalDate date;
	public Double valuePerHour;
	public Integer hours;
	
	public HoursContract(LocalDate date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public Double totalValue() {
		return valuePerHour * hours;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
}
