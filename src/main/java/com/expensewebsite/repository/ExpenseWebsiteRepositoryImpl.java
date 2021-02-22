package com.expensewebsite.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.expensewebsite.dbutil.PostgresqlConnection;
import com.expensewebsite.model.Employees;
import com.expensewebsite.model.Expenses;

public class ExpenseWebsiteRepositoryImpl implements ExpenseWebsiteRepository {

	PreparedStatement preparedStatement = null;

	@Override
	public Employees employeeLogin(String email, String password) {
		Employees employee = null;
		
		try (Connection connection = PostgresqlConnection.getConnection()){
			final String sql = "SELECT employee_id, email, password, position, first_name, last_name, dob FROM expenses.employees WHERE email = ? AND password = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "email");
			preparedStatement.setString(2, "password");
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				employee = new Employees();
				employee.setEmployeeId(resultSet.getLong("employeeId"));
				employee.setEmail(resultSet.getString("email"));
				employee.setPassword(resultSet.getString("password"));
				employee.setPosition(resultSet.getString("position"));
				employee.setFirstName(resultSet.getString("first_name"));
				employee.setLastName(resultSet.getString("last_name"));
				employee.setDob(resultSet.getDate("dob").toLocalDate());
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public void viewEmployeeHomePage(long userId) {
		
		
	}

	@Override
	public void employeeLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void submitReimbursementRequest(Expenses request) {
		
		
		try(Connection connection = PostgresqlConnection.getConnection()) {
			final String sql = "INSERT INTO expenses.expenses (expense_id, employee_id, amount, authorized_by, comments, details, expense_date, expense_image, status) VALUES (default,?,?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
		//	preparedStatement.setLong(1, request.getExpenseId());
			preparedStatement.setLong(1, request.getEmployeeId());
			preparedStatement.setLong(2,request.getAmount());
			preparedStatement.setString(3, request.getAuthorizedBy());
			preparedStatement.setString(4, request.getAuthorizedBy());
			preparedStatement.setString(5, request.getDetails());
			preparedStatement.setDate(6, Date.valueOf(request.getExpenseDate()));
			preparedStatement.setString(7, request.getExpenseImage());
			preparedStatement.setString(8, request.getStatus());
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void viewPendingReimbursement(long userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewResolvedReimbursement(long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewPersonalInformation(long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updatePersonalInformation(long userId, String lastname) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String sendNotificationEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createEmployee(Employees employee) {
		int c = 0;
		
		try(Connection connection = PostgresqlConnection.getConnection()) {
			final String sql = "INSERT INTO expenses.employees (employee_id, email, password, position, first_name, last_name, dob ) VALUES (default,?,?,?,?,?,?) ";
			preparedStatement = connection.prepareStatement(sql);
		//	preparedStatement.setLong(1, employee.getEmployeeId());
			preparedStatement.setString(1, employee.getEmail());
			preparedStatement.setString(2, employee.getPassword());
			preparedStatement.setString(3, employee.getPosition());
			preparedStatement.setString(4, employee.getFirstName());
			preparedStatement.setString(5, employee.getLastName());
			preparedStatement.setDate(6, Date.valueOf(employee.getDob()));
			if(preparedStatement.executeUpdate() != 0) {
				c = preparedStatement.executeUpdate();
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

}
