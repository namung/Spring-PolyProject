package com.AdminPage.model;

public class OutputCriteria {
	
	/* 관리자가 선택한 월 */
	private String month;
	
	/* product 테이블 column */
	private String productName;
	private int productPrice;
	
	/* outputlist 테이블 column */
	private String productId;
	private int outputAmount;
    private String salesDate;
    
    /* 내가 만든 price * amount column */
    private int totalPrice;
    
    /* 기본 생성자 -> 기본 세팅: month = 1 */
	public OutputCriteria() {
		this("1");
	}

	/* 생성자 -> 원하는 month */ 
	public OutputCriteria(String month) {
		this.month = month;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
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

	public String getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "OutputCriteria [month=" + month + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productId=" + productId + ", outputAmount=" + outputAmount + ", salesDate=" + salesDate + "]"
				+ ", totalPrice" + totalPrice + "]";
	}

}
