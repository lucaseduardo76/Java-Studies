package model.entities;

import model.exception.DomainException;

public class sum {
	public static boolean positiveNumber(int n) throws DomainException{
		if(!(n>0)) {
			throw new DomainException("Numero negativo");
		}else {
			return true;
		}
		
	}
}
