package models.service;

import java.time.Duration;

import models.entities.CarRental;
import models.entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService, CarRental carRental) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
		this.processInvoice(carRental);
	}

	public void processInvoice(CarRental carRental) {
		Long duration = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		
		Double hour = (double) duration / 60;
		Double day = hour / 24;
		double totValue;
		
		
		if(hour > 12) {
			totValue = this.pricePerDay * Math.ceil(day);
		}else {
			totValue = this.pricePerHour * Math.ceil(hour);
		}
		
		carRental.setInvoice(new Invoice(totValue, taxService.tax(totValue)));
	
	}
}
