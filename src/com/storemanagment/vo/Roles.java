package com.storemanagment.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Roles {
	@Id
private long roleID;
private String roleName;
private int enabled;
private long createdBy;
private Date createdDate;
private long changedBy;
private Date changedDate;
public long getRoleID() {
	return roleID;
}
public void setRoleID(long roleID) {
	this.roleID = roleID;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
public int getEnabled() {
	return enabled;
}
public void setEnabled(int enabled) {
	this.enabled = enabled;
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
