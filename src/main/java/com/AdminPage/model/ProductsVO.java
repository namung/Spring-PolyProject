package com.AdminPage.model;

import java.util.Date;

public class ProductsVO {
	
	/*등록 순서*/
	private int regNum;
	
	/*음식 아이디*/
	private String productId;
	
	/*음식 명*/
	private String productName;
	
	/*음식 분류*/
	private String category;
	
	/*음식 개당 판매 가격*/
	private int productPrice;
	
	/*음식 이미지*/
	private String productImg;
	
	/*비고*/
	private String etc;
	
	/*등록 날짜*/
	private Date regDate;
	
	/*수정 날짜*/
	private Date updateDate;
	
	/*판매가능 수량*/
	private int productAmount;
	
	public int getRegNum() {
		return regNum;
	}

	public void setRegNum(int regNum) {
		this.regNum = regNum;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	@Override
	public String toString() {
		return "ProductsVO [regNum=" + regNum + ", productId=" + productId + ", productName=" + productName
				+ ", category=" + category + ", productPrice=" + productPrice + ", productImg=" + productImg + ", etc="
				+ etc + ", regDate=" + regDate + ", updateDate=" + updateDate + ", productAmount=" + productAmount
				+ "]";
	}
	
}
