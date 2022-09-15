package com.velociter.hibernate.productdetails;

public class ProductDetail {
	private long prodID;
	private String prodName;
	private String prodType;
	private String prodCategory;
	private String prodSplFeature;
	private String prodMaterial;
	private String prodCapacity;

	public ProductDetail() {
		// TODO Auto-generated constructor stub
	}

	public ProductDetail(long prodID, String prodName, String prodType, String prodCategory, String prodSplFeature,
			String prodMaterial, String prodCapacity) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodType = prodType;
		this.prodCategory = prodCategory;
		this.prodSplFeature = prodSplFeature;
		this.prodMaterial = prodMaterial;
		this.prodCapacity = prodCapacity;
	}

	public long getProdID() {
		return prodID;
	}

	public void setProdID(long prodID) {
		this.prodID = prodID;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public String getProdSplFeature() {
		return prodSplFeature;
	}

	public void setProdSplFeature(String prodSplFeature) {
		this.prodSplFeature = prodSplFeature;
	}

	public String getProdMaterial() {
		return prodMaterial;
	}

	public void setProdMaterial(String prodMaterial) {
		this.prodMaterial = prodMaterial;
	}

	public String getProdCapacity() {
		return prodCapacity;
	}

	public void setProdCapacity(String prodCapacity) {
		this.prodCapacity = prodCapacity;
	}

	
}
