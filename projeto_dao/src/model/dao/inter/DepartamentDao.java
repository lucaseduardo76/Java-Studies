package model.dao.inter;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao {
	
	void insert(Departament obj);
	void update(Departament obj);
	void delete(Integer id);
	Departament findById(Integer id);
	List<Departament> findAll();
	
}
