package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(repo.getClass().getName());
		repo.save(new Employee("Balaraju", 85.96));
		repo.save(new Employee("Abhi", 56.9));
		repo.save(new Employee("yaswanth", 34.00));
		repo.save(new Employee("Prakash", 69.88));

	}

}
