package com.usecases;

import java.util.List;
import com.beans.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImplemenation;

public class GetAllEmployeesUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao = new EmployeeDaoImplemenation();
		List<Employee> employees = dao.getAllEmployees();
		
		for(Employee employee : employees)
		{
			System.out.println(employee);
			System.out.println("--------------------------------------------");
		}

	}

}
