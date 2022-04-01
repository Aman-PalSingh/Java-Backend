package com.dao;

import java.util.List;

import com.beans.Employee;
import com.exceptions.EmployeeException;

public interface EmployeeDao {

	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId)throws EmployeeException;
}
