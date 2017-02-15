package com.storemanagment.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BANk_ORDER_PRODUCT_DETAILS")
public class OrderProductDetails {
	@Id
	@GeneratedValue
	@Column(name="ORDER_PRODUCT_ID")
	private int orderproductID;
	private int productId;
	private int quantity;
	private String active;
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public int getOrderproductID() {
		return orderproductID;
	}
	public void setOrderproductID(int orderproductID) {
		this.orderproductID = orderproductID;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
