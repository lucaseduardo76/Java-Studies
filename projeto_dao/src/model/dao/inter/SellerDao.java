package model.dao.inter;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void delete(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	
}
