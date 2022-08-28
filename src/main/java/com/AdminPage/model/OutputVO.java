package com.AdminPage.model;

import java.util.Date;

public class OutputVO {
	/*출고 순서*/
	private int outputNum;
	
	/*음식 아이디*/
	private String productId;
	
	/*출고 수량*/
	private int outputAmount;
	
	/*출고 날짜*/
	private Date salesDate;
	
	/*음식 명*/
	private String productName;

	public int getOutputNume() {
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

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "OutputVO [outputNum=" + outputNum + ", productId=" + productId + ", outputAmount=" + outputAmount
				+ ", salesDate=" + salesDate + ", productName=" + productName + "]";
	}
		
}
