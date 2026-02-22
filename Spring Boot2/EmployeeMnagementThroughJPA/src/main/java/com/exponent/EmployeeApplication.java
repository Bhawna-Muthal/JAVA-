package com.exponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.exponent.entity.Employee;
import com.exponent.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeApplication {

	private static String string;
	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(EmployeeApplication.class, args);

		EmployeeRepository erepo = context.getBean(EmployeeRepository.class);
		
		Employee emp1 = new Employee();
		emp1.setEid(101);
		emp1.setEname("Ritika");
		emp1.setErole("SE");
		emp1.setEaddress("PUNE");
		emp1.setEsalary(50000.0);

		Employee emp2 = new Employee();
		emp2.setEid(102);
		emp2.setEname("Kavya");
		emp2.setErole("TS");
		emp2.setEaddress("MUMBAI");
		emp2.setEsalary(75000.0);

		Employee emp3 = new Employee();
		emp3.setEid(103);
		emp3.setEname("RAVI");
		emp3.setErole("CE");
		emp3.setEaddress("BANGLORE");
		emp3.setEsalary(30000.0);

	
		// errepo.saveAll(Arrays.asList(emp1, emp2, emp3));

		
		/*
		 * Optional<Employee> employee = erepo.findById(1);
		 * 
		 *
		 * if (employee.isPresent()) { System.out.println(employee);
		 * 
		 * } else {
		 * 
		 * System.out.println("Employee Not present");
		 * 
		 * }
		 */
		   
		/*
		 * Iterable<Employee> findAll = erepo.findAll(); for(Employee employee1 :
		 * findAll) { System.out.println(employee1); }
		 */
		
		/* System.out.println(erepo.count()); */
		
		 erepo.deleteById(2);
	}
	
	

}
