package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.inter.DepartamentDao;
import model.entities.Departament;

public class DepartamentDaoJDBC implements DepartamentDao{

	private Connection conn;
	
	public DepartamentDaoJDBC(Connection DB) {
		conn = DB;
	}
	
	@Override
	public void insert(Departament obj) {
		
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"INSERT INTO department "
					+"(Name) "
					+"VALUES "
					+"(?)");
			
			st.setString(1, obj.getName());
			st.executeUpdate();
			
			
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
		
	}

	@Override
	public void update(Departament obj) {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement("UPDATE department SET Name = ? WHERE Id = ?");
			st.setString(1, obj.getName());
			st.setInt(2, obj.getId());
			st.executeUpdate();
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void delete(Integer id) {
		
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM department WHERE Id = ?");
			
			st.setInt(1, id);
			st.executeUpdate();
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}		
	}

	@Override
	public Departament findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			
			st =  conn.prepareStatement("select * from department WHERE Id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			
			
			if(rs.next()) {
				Departament dep = new Departament(rs.getInt("Id"), rs.getString("Name"));
				return dep;
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
		
		return null;
	}

	@Override
	public List<Departament> findAll() {
		Statement st = null;
		ResultSet rs = null;
		List<Departament> listDep = new ArrayList<>();
		
		try {
			
			st = this.conn.createStatement();
			rs = st.executeQuery("select * from department");
			
			while(rs.next()) {
				Departament dep = this.createDepartament(rs);
				listDep.add(dep);
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
		
		return listDep;
	}
	
	
	
	private Departament createDepartament(ResultSet rs) throws SQLException {
		Departament dep = new Departament(rs.getInt("Id"), rs.getString("Name"));
		return dep;
	}

}
