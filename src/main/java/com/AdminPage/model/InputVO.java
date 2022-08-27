package com.AdminPage.model;

import java.util.Date;

public class InputVO {
	
	/*입고 순서*/
	private int inputNum;
	
	/*음식 아이디*/
	private String productId;
	
	/*입고 수량*/
	private int inputAmount;
	
	/*입고 날짜*/
	private Date inputDate;

	public int getInputNum() {
		return inputNum;
	}

	public void setInputNum(int inputNum) {
		this.inputNum = inputNum;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getInputAmount() {
		return inputAmount;
	}

	public void setInputAmount(int inputAmount) {
		this.inputAmount = inputAmount;
	}

	public Date getInputDate() {
		return inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	@Override
	public String toString() {
		return "InputVO [inputNum=" + inputNum + ", productId=" + productId + ", inputAmount=" + inputAmount
				+ ", inputDate=" + inputDate + "]";
	}
		
}
