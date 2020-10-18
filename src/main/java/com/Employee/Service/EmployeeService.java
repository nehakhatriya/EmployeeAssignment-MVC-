package com.Employee.Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.Employee.Entity.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);

	List<Employee> listEmployees();

	void deleteEmployee(int empid);

	void updateEmployee(Employee employee);

	List<Employee> listEmployees(String val);


}