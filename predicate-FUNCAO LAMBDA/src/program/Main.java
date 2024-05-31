package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Products;
import services.PredicateProducts;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("Tv", 900.00));
		list.add(new Products("Mouse", 50.00));
		list.add(new Products("Tablet", 350.00));
		list.add(new Products("HD Case", 80.90));
		
		list.removeIf(new PredicateProducts());  //Predicate instanciado como uma classe feita por mim
		list.removeIf(x -> x.getValue() >= 100); // Predicate como Lambda
		list.removeIf(Products::staticProductPredicate); // Referencia para metodo dentro da propria classe de produtos de forma static
		list.removeIf(Products::nonStaticProductPredicate); // Referencia para o metodo não estatico da minha classe.
		
		
		list.forEach(System.out::println);
	}
}
