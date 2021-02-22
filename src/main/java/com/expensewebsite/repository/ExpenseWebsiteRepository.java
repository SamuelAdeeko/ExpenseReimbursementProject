package com.expensewebsite.repository;

import com.expensewebsite.model.Employees;
import com.expensewebsite.model.Expenses;

public interface ExpenseWebsiteRepository {

	
	public Employees employeeLogin(String email, String password);
	public int createEmployee(Employees employee);
	public void viewEmployeeHomePage(long userId);
	public void employeeLogout();
	public void submitReimbursementRequest(Expenses request);
	public void viewPendingReimbursement(long userid);
	public void viewResolvedReimbursement(long userId);
	public void viewPersonalInformation(long userId);
	public int updatePersonalInformation(long userId, String lastname);
	public String sendNotificationEmail(String email);
	

}
