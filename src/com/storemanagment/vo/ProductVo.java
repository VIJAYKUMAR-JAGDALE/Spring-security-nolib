package com.storemanagment.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="STORE_PRODUCTS")
public class ProductVo {
	@Id
	@GeneratedValue
	@Column(name="PRODUCT_ID")
	private long productID;
	
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="PRODUCT_INFO")
	private String productInfo;
	@Column(name="type")
	private String productType;
	
	
	@Column(name="CREATED_BY")
	private long createdBy;
	@Column(name="CREATED_DATE")
	private Date createdDate;
	@Column(name="CHANGED_BY")
	private long changedBy;
	@Column(name="CHANGED_DATE")
	private Date changedDate;

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public long getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(long changedBy) {
		this.changedBy = changedBy;
	}

	public Date getChangedDate() {
		return changedDate;
	}

	public void setChangedDate(Date changedDate) {
		this.changedDate = changedDate;
	}

}
