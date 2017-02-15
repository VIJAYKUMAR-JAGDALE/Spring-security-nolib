package com.bank.store.bean;

import java.util.Date;
import java.util.Map;

public class OrderBean {
	private String[] selectedProd;
	private String discription;
	private String branchId;
	private String isReviewed;
	private String active;
	private String status;
	private long orderId;
	private int createdBy;
	private Date createDate;
	private int changedBy;
	private Date changedDate;
    private Map selectedProducts;
	public String[] getSelectedProd() {
		return selectedProd;
	}

	public void setSelectedProd(String[] selectedProd) {
		this.selectedProd = selectedProd;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getIsReviewed() {
		return isReviewed;
	}

	public void setIsReviewed(String isReviewed) {
		this.isReviewed = isReviewed;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(int changedBy) {
		this.changedBy = changedBy;
	}
	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Map getSelectedProducts() {
		return selectedProducts;
	}

	public void setSelectedProducts(Map selectedProducts) {
		this.selectedProducts = selectedProducts;
	}

	public Date getChangedDate() {
		return changedDate;
	}

	public void setChangedDate(Date changedDate) {
		this.changedDate = changedDate;
	}
}
