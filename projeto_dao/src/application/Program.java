package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.impl.DaoFactory;
import model.dao.inter.DepartamentDao;
import model.dao.inter.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program 	{
	public static void main(String[] args) {
		DepartamentDao departamentDao = DaoFactory.createDepartamentDao();
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		LocalDate time = LocalDate.now();
		
		Seller sell = new Seller(0, "Larah Raquel", "lesds@gmail.com", time, 1948.48, departamentDao.findById(6));
		
		sellerDao.insert(sell);
		
		List<Departament> listDep = departamentDao.findAll();
		
		for(Departament item:listDep) {
			System.out.println(item);
		}
		
	}
}
