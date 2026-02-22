package com.exponent.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exponent.Entity.Employee;

@Repository
public class HomeDAOIMPL implements HomeDAO {

	@Autowired
	private SessionFactory sf;

	@Override
	public void registerEmployeeinDAO(Employee emp) {
		
		System.out.println("DAO Layer : "+ emp);
		Session s = sf.openSession();
		
		s.save(emp);
		
		s.beginTransaction().commit();
		System.out.println("Data Inserted : ");
		
	}
}
