package com.expensewebsite.repository;

import java.util.List;

import com.expensewebsite.model.Employees;
import com.expensewebsite.model.Expenses;

public class ExpenseManagerWebsiteRepositoryImpl implements ExpenseManagerWebsiteRepository {

	@Override
	public int managerLogin(String email, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void viewMangerHomePage(long managerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managerLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void approveDenyRequest(long managerId, String image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Expenses> viewPendingRequest(long managerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expenses> viewImagesOfAllReceipts(long managerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expenses> viewAllResolvedRequest(long managerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> viewEmployeesAndManagers(long managerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expenses> viewRequestFromManagedEmployee(long managerId, long EmployeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employees registerEmployee(long userId, Employees employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
