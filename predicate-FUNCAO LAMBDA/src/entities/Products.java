package entities;

public class Products {
	
	private String name;
	private Double value;
	
	public Products(String name, Double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public static boolean staticProductPredicate(Products p) {
		return p.getValue() >= 100;
	}
	
	public  boolean nonStaticProductPredicate() {
		return this.value >= 100;
	}
	
	
	@Override
	public String toString() {
		return "name:" + name + ", value:" + value;
	}
	
	
	
}
