package com.AdminPage.model;

public class SalesVO {
    // 상품 id
    private String productId;

    // 상품명
    private String productName;

    // 상품 판매 가격
    private int productPrice;

    // 상품 판매량
    private int salesAmount;

    // 상품 판매일
    private String salesDate;

    // Getter and Setter

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

    // toString()

    @Override
    public String toString() {
        return "SalesVO [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + ", salesAmount=" + salesAmount
                + ", salesDate=" + salesDate + "]";
    }


}
