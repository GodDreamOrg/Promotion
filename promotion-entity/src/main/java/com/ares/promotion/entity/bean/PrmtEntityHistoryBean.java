package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.sql.Date;

public class PrmtEntityHistoryBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String entityType;
	private String entityKey;
	private String comments;
	private String entitySnapshotinjson;
	private Date createTime;
	private String createUserId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getEntityKey() {
		return entityKey;
	}
	public void setEntityKey(String entityKey) {
		this.entityKey = entityKey;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getEntitySnapshotinjson() {
		return entitySnapshotinjson;
	}
	public void setEntitySnapshotinjson(String entitySnapshotinjson) {
		this.entitySnapshotinjson = entitySnapshotinjson;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	
}
