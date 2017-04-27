package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.util.Date;

public class PrmtCustomerGroupRelBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String rewardCollectionCode;//奖励集编码
	private Date createTime;//创建时间
	private String createUserId;//创建人
	private Date updateTime;//修改时间
	private String updateUserId;//修改人
	private Integer customerGroupCode;//客户群_ID
	private String prmtCode;//活动编码
	private Boolean activeFlag;//有效标识. 0=无效;1=有效
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRewardCollectionCode() {
		return rewardCollectionCode;
	}
	public void setRewardCollectionCode(String rewardCollectionCode) {
		this.rewardCollectionCode = rewardCollectionCode;
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
	public Integer getCustomerGroupCode() {
		return customerGroupCode;
	}
	public void setCustomerGroupCode(Integer customerGroupCode) {
		this.customerGroupCode = customerGroupCode;
	}
	public String getPrmtCode() {
		return prmtCode;
	}
	public void setPrmtCode(String prmtCode) {
		this.prmtCode = prmtCode;
	}
	public Boolean getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	
	
}
