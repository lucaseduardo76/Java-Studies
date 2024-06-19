package model.dao.impl;

import db.DB;
import model.dao.inter.DepartamentDao;
import model.dao.inter.SellerDao;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartamentDao createDepartamentDao() {
		return new DepartamentDaoJDBC(DB.getConnection());
	}
		
}
