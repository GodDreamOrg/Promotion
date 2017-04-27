package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.sql.Date;

public class PrmtRecordBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String orderCode;//订单编号
	private String prmtCode;//促销编号
	private Integer rewardTimes;//奖励次数
	private String memberId;//会员ID
	private Date createTime;
	private Date updateTime;
	private Boolean activeFlag;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getPrmtCode() {
		return prmtCode;
	}
	public void setPrmtCode(String prmtCode) {
		this.prmtCode = prmtCode;
	}
	public Integer getRewardTimes() {
		return rewardTimes;
	}
	public void setRewardTimes(Integer rewardTimes) {
		this.rewardTimes = rewardTimes;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
