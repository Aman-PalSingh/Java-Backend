package com.usecases;

import java.util.Scanner;

import com.beans.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImplemenation;

public class SaveEmployeeDetailsUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter The Employee ID");
       int empId = scan.nextInt();
       System.out.println("Enter Employee Name");
       String name = scan.next();
       System.out.println("Enter Employee's Address");
       String address = scan.next();
       System.out.println("Enter the Salary");
       int salary = scan.nextInt();
       
       EmployeeDao dao = new EmployeeDaoImplemenation();
       String result = dao.saveEmployeeDetails(new Employee(empId,name,address,salary));
       System.out.println(result);
	}

}
