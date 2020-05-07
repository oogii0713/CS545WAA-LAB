package edu.miu.lab10.service;

import edu.miu.lab10.domain.Employee;
import edu.miu.lab10.repository.EmployeeRepository;
import edu.miu.lab10.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeByNumber(int id) {		
		return employeeRepository.locateOneEmployeeByHisNumber(id);
	}

	@Override
	public void addNewEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

}
