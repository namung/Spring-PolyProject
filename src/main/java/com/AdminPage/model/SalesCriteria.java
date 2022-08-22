package com.AdminPage.model;

public class SalesCriteria {
	
	/* 관리자가 선택한 월 */
	private String month;
	
	private String productId;
	private String productName;
	private int productPrice;
	private int salesAmount;
    private String salesDate;
	
	private int month_total;
	
	
	/* 기본 생성자 -> 기본 세팅: month = 1 */
	public SalesCriteria() {
		this("1");
	}

	/* 생성자 -> 원하는 month */ 
	public SalesCriteria(String month) {
		this.month = month;
	}
	
	
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setMonthTotal(int productPrice, int salesAmount) {
		this.month_total = productPrice * salesAmount;
	}
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
	}
	
	public String getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}

	
	@Override
	public String toString() {
		return "SalesCriteria [month=" + month + ", productId=" + productId + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", salesAmount=" + salesAmount + ", salesDate=" + salesDate
				+ ", month_total=" + month_total + "]";
	}
	

}
