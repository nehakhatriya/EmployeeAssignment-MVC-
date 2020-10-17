package com.Employee.DAO;

import java.util.List;

import com.Employee.Entity.Employee;

public interface EmployeeDAO {

	void saveEmployee(Employee employee);

	List<Employee> listEmployee();

	void deleteEmployee(int empid);

}