package net.kh.product.model;

public class Product {
	private String pName;
	public int price;
	String brand;
	private double taxRate;
	
	public Product() {}
	
	public void information() {}
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	public String getPName() {
		return pName;
	}
	public void setPrice(int setPrice) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public double getTaxRate() {
		return taxRate;
	}
}
