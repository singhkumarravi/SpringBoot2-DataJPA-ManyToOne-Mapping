package com.olive.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Deparment;
import com.olive.model.Employee;
import com.olive.repo.DeptRepositiory;
import com.olive.repo.EmployeeRepositiory;
@Component
public class EmployeeRunner implements CommandLineRunner{
	@Autowired
	private DeptRepositiory drepo;
	
	@Autowired
	private EmployeeRepositiory erepo;
	@Override
	public void run(String... args) throws Exception {
	Deparment d1 = new Deparment(10, "DEV", "Sanjay");
	drepo.save(d1);
	erepo.save(new Employee(101, "Ravi Kumar", 20.2, "Hyd",d1));
	erepo.save(new Employee(102, "Mohan Kumar", 20.2, "Hyd",d1));
	erepo.save(new Employee(103, "Rohan Kumar", 20.2, "Hyd",d1));
	erepo.save(new Employee(104, "Karan Kumar", 20.2, "Hyd",d1));
	erepo.save(new Employee(105, "Sunil Kumar", 20.2, "Hyd",d1));
	
	Optional<Employee> findById = erepo.findById(101);
	       System.out.println(findById);
		
	}

}
