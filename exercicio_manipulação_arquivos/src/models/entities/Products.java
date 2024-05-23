package models.entities;

public class Products {
	String name;
	Integer qnt;
	Double value;
	
	public Products(String name, Double value, Integer qnt) {
		this.name = name;
		this.qnt = qnt;
		this.value = value;
	}
	
	public Double getTotValue() {
		return this.value * this.qnt;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQnt() {
		return qnt;
	}
	public void setQnt(Integer qnt) {
		this.qnt = qnt;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
	public String toString() {
		return this.name +", "+this.getTotValue();
	}
	
}
