package entities;

import java.util.Date;

public class HoursContract {
	Date date;
	Double valuePerHour;
	Integer hours;
	
	
	
	public HoursContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}



	public Double totalValue() {
		return valuePerHour * hours;
	}
	
}
