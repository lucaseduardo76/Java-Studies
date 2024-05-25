package models.entities;

import java.time.LocalDateTime;

public class CarRental {
	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle model;
	private Invoice invoice;
	
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle model) {
		this.start = start;
		this.finish = finish;
		this.model = model;
	}

	public Vehicle getModel() {
		return model;
	}

	public void setModel(Vehicle model) {
		this.model = model;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}
	
	
	
} 
