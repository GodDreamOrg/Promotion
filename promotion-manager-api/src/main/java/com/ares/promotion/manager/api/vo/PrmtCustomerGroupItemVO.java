package com.ares.promotion.manager.api.vo;

import java.io.Serializable;
import java.util.Date;

public class PrmtCustomerGroupItemVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String customerGroupCode;//客户群编号
	private Integer userId;//用户标号
	private Date createTime;//创建时间
	private Date updateTime;//修改时间
	private Boolean activeFlag;//有效标识.0=无效;1=有效
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerGroupCode() {
		return customerGroupCode;
	}
	public void setCustomerGroupCode(String customerGroupCode) {
		this.customerGroupCode = customerGroupCode;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Boolean getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
