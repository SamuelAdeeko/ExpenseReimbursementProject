package com.expensewebsite.model;

import java.time.LocalDate;

public class Expenses extends Employees {

	private long expenseId;
	private long employeeId;
	private String expenseImage;
	private String status;
	private LocalDate expenseDate;
	private String details;
	private String comments;
	private long amount;
	private String authorizedBy;
	
	public Expenses() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Expenses(long expenseId, long employeeId, String expenseImage, String status, LocalDate expenseDate,
			String details, long amount) {
		super();
		this.expenseId = expenseId;
		this.employeeId = employeeId;
		this.expenseImage = expenseImage;
		this.status = status;
		this.expenseDate = expenseDate;
		this.details = details;
		this.amount = amount;
	}




	public Expenses(long expenseId, long employeeId, String expenseImage, String status, LocalDate expenseDate,
			String details, String comments, long amount, String authorizedBy) {
		super();
		this.expenseId = expenseId;
		this.employeeId = employeeId;
		this.expenseImage = expenseImage;
		this.status = status;
		this.expenseDate = expenseDate;
		this.details = details;
		this.comments = comments;
		this.amount = amount;
		this.authorizedBy = authorizedBy;
	}

	public long getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(long expenseId) {
		this.expenseId = expenseId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getExpenseImage() {
		return expenseImage;
	}

	public void setExpenseImage(String expenseImage) {
		this.expenseImage = expenseImage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(LocalDate expenseDate) {
		this.expenseDate = expenseDate;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getAuthorizedBy() {
		return authorizedBy;
	}

	public void setAuthorizedBy(String authorizedBy) {
		this.authorizedBy = authorizedBy;
	}

	@Override
	public String toString() {
		return "Expenses [expenseId=" + expenseId + ", employeeId=" + employeeId + ", expenseImage=" + expenseImage
				+ ", status=" + status + ", expenseDate=" + expenseDate + ", details=" + details + ", comments="
				+ comments + ", amount=" + amount + ", authorizedBy=" + authorizedBy + "]";
	}
	
	
	
}
