package services;

import java.util.function.Predicate;

import entities.Products;

public class PredicateProducts implements Predicate<Products>{

	@Override
	public boolean test(Products p) {
		return p.getValue() >= 100;
	}

}
