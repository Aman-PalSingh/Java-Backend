package com.usecases;

import java.util.Scanner;

import com.beans.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImplemenation;

public class GetEmployeeByIDUseCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Employee ID");
		int empId = scan.nextInt();
		EmployeeDao dao = new EmployeeDaoImplemenation();
		
		try {
		Employee employee = dao.getEmployeeById(empId);
		System.out.println(employee);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
