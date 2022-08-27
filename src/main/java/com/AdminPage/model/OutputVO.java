package com.AdminPage.model;

import java.util.Date;

public class OutputVO {
	/*입고 순서*/
	private int outputNum;
	
	/*음식 아이디*/
	private String productId;
	
	/*입고 수량*/
	private int outputAmount;
	
	/*입고 날짜*/
	private Date salesDate;

	public int getOutputNum() {
		return outputNum;
	}

	public void setOutputNum(int outputNum) {
		this.outputNum = outputNum;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getOutputAmount() {
		return outputAmount;
	}

	public void setOutputAmount(int outputAmount) {
		this.outputAmount = outputAmount;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date outputDate) {
		this.salesDate = outputDate;
	}

	@Override
	public String toString() {
		return "outputVO [outputNum=" + outputNum + ", productId=" + productId + ", outputAmount=" + outputAmount
				+ ", salesDate=" + salesDate + "]";
	}
	

}
