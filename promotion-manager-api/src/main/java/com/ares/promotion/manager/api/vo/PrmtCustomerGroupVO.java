package com.ares.promotion.manager.api.vo;

import java.io.Serializable;
import java.util.Date;

public class PrmtCustomerGroupVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String customerGroupCode;//客户群编号
	private String customerGroupName;//客户群名称
	private Integer sourceType;//来源类型. 1=人工创建; 2=活动产生
	private String customerGroupDesc;//客户群描述
	private Date createTime;//创建时间
	private String createUserId;//创建人
	private Date updateTime;//修改时间
	private String updateUserId;//修改人
	private Boolean activeFlag;//有效标识. 0=无效;1=有效
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
	public String getCustomerGroupName() {
		return customerGroupName;
	}
	public void setCustomerGroupName(String customerGroupName) {
		this.customerGroupName = customerGroupName;
	}
	public Integer getSourceType() {
		return sourceType;
	}
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}
	public String getCustomerGroupDesc() {
		return customerGroupDesc;
	}
	public void setCustomerGroupDesc(String customerGroupDesc) {
		this.customerGroupDesc = customerGroupDesc;
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
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	public Boolean getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
