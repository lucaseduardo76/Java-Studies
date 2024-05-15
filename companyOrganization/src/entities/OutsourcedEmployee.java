package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharger;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharger) {
		super(name, hour, valuePerHour);
		this.additionalCharger = additionalCharger;
	}
	
	@Override
	public double payment() {
		return super.payment() + this.additionalCharger * 1.10;
	}

}
