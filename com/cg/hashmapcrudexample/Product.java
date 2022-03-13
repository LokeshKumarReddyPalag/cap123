package com.cg.hashmapcrudexample;

import java.util.Objects;

public class Product {
	
	private int productId;
	private String productName;
	private float productPrice;
	private String ProductCategory;
	
	public Product(int productId, String productName, float productPrice, String productCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		ProductCategory = productCategory;
	}

	public Product() {
		//TODO Auto-generated constructor stub
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return ProductCategory;
	}

	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", ProductCategory=" + ProductCategory + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ProductCategory, productId, productName, productPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(ProductCategory, other.ProductCategory) && productId == other.productId
				&& Objects.equals(productName, other.productName)
				&& Float.floatToIntBits(productPrice) == Float.floatToIntBits(other.productPrice);
	}

	
	}
	
	
	
	


