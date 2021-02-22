package com.expensewebsite.main;

import java.io.File;
import java.time.LocalDate;

import com.expensewebsite.model.Expenses;
import com.expensewebsite.repository.ExpenseWebsiteRepository;
import com.expensewebsite.repository.ExpenseWebsiteRepositoryImpl;

public class EmployeeDriver {

	
	public static void main(String[] args) {
		
		ExpenseWebsiteRepository expenseRepo = new ExpenseWebsiteRepositoryImpl();
	//	Employees employeeLogin = new Employees();
		if(expenseRepo.employeeLogin("user2@yahoo.com", "user2") == null ) {
			System.out.println("login successful");
		}
			
		
	//	System.out.println("Login successful");
	//	System.out.println(employeeLogin.getEmployeeId());
	//	} 
	//	else {
	//		System.out.println("Login error");
	//	}
		//Employees employee = new Employees(1, "user2@yahoo.com", "user2", "employee" ,"collins", "peter", LocalDate.parse("1977-06-06"));
		//expenseRepo.createEmployee(employee);
		
		
		String filePath = "c.goofy.path/";
		Expenses expense = new Expenses(0l, 5, filePath, "pending" , LocalDate.parse("2021-06-02"), "hello", 4000 );
		expenseRepo.submitReimbursementRequest(expense);
	}
}
