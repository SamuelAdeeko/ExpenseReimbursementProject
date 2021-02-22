package com.expensewebsite.repository;

import java.util.List;

import com.expensewebsite.model.Employees;
import com.expensewebsite.model.Expenses;

public interface ExpenseManagerWebsiteRepository {
	
	
	public int managerLogin(String email, String password);
	public void viewMangerHomePage(long managerId);
	public void managerLogout();
	public void approveDenyRequest(long managerId, String image);
	public List<Expenses> viewPendingRequest(long managerId);
	public List<Expenses> viewImagesOfAllReceipts(long managerId);
	public List<Expenses> viewAllResolvedRequest(long managerId);
	public List<Employees> viewEmployeesAndManagers(long managerId);
	public List<Expenses> viewRequestFromManagedEmployee(long managerId, long EmployeeId);
	public Employees registerEmployee(long userId, Employees employee);
}
