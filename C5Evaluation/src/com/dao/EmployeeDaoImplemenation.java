package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Employee;
import com.exceptions.EmployeeException;
import com.utility.DBUtility;

public class EmployeeDaoImplemenation implements EmployeeDao {

	@Override
	public String saveEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		String msg = "Insertion Failed";

		try (Connection con = DBUtility.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, employee.getEmpID());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			int query = ps.executeUpdate();
			if (query > 0) {
				msg = "Record Inserted Succefully";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			msg = e.getMessage();
		}

		return msg;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee employee = null;

		try (Connection con = DBUtility.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("select * from employee where emp_id = ?");
			ps.setInt(1, empId);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				employee = new Employee(resultSet.getInt("emp_id"), resultSet.getString("emp_name"),
						resultSet.getString("address"), resultSet.getInt("salary"));
			} else {
				EmployeeException exception = new EmployeeException(
						"Employee Does not exist with employee ID = " + empId);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage());
		}

		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();

		try (Connection con = DBUtility.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt("emp_id"), resultSet.getString("emp_name"),
						resultSet.getString("address"), resultSet.getInt("salary"));
				employees.add(employee);
			}

		} catch (Exception e) {
			// TODO: handle exception

		}
		return employees;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
		String message = "Record Not Deleted";

		try (Connection con = DBUtility.provideConnection()) {
			PreparedStatement ps = con.prepareStatement("delete from employee where emp_id = ?");
			ps.setInt(1, empId);
			int query = ps.executeUpdate();
			if(query>0)
			{
				message = "Record Deleted";
			}else {
				throw new EmployeeException("Record Not Found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage());
		}

		return message;
		
	}
}
