package application;

import java.util.List;

import model.dao.impl.DaoFactory;
import model.dao.inter.DepartamentDao;
import model.entities.Departament;

public class Program 	{
	public static void main(String[] args) {
		DepartamentDao departamentDao = DaoFactory.createDepartamentDao();
		
		departamentDao.delete(12);
		
		List<Departament> listDep = departamentDao.findAll();
		
		for(Departament item:listDep) {
			System.out.println(item);
		}
		
	}
}
