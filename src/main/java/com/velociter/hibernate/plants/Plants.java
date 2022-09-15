package com.velociter.hibernate.plants;

public class Plants {

	private long plantId;
	private String name;
	private String type;
	private String cateogry;
	private float price;
	private int qty;
	private float totalPrice;
	public Plants() {
	}
	public Plants(long plantId, String name, String type, String cateogry, float price, int qty, float totalPrice) {
		super();
		this.plantId = plantId;
		this.name = name;
		this.type = type;
		this.cateogry = cateogry;
		this.price = price;
		this.qty = qty;
		this.totalPrice = totalPrice;
	}
	public long getPlantId() {
		return plantId;
	}
	public void setPlantId(long plantId) {
		this.plantId = plantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCateogry() {
		return cateogry;
	}
	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
}