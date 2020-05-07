package edu.miu.lab10.service;

import edu.miu.lab10.domain.Employee;

import java.util.List;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	Employee getEmployeeByNumber(int id);

	void addNewEmployee(Employee employee);
	
}
