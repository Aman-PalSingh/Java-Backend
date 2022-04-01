package com.usecases;

import java.util.Scanner;

import com.beans.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImplemenation;

public class DeleteEmployeeUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Employee ID");
		int empId = scan.nextInt();
		EmployeeDao dao = new EmployeeDaoImplemenation();
		
		try {
		String employee = dao.deleteEmployee(empId);
		System.out.println(employee);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
