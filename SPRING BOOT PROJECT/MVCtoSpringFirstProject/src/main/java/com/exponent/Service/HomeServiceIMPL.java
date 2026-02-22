package com.exponent.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exponent.DAO.HomeDAO;
import com.exponent.Entity.Employee;

@Service
public class HomeServiceIMPL implements HomeService {

	@Autowired
	private HomeDAO hd;

	@Override
	public void registerEmployeeinService(Employee emp) {
    System.out.println("Service : " + emp);	
    
    hd.registerEmployeeinDAO(emp);
	}
}
