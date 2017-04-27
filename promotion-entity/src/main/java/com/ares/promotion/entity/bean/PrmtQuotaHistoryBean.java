package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.util.Date;

public class PrmtQuotaHistoryBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String associatedCode;//活动编码
	private Integer associatedType;//1：活动  2：奖励
	private Date createTime;
	private Long createUserId;
	private Date updateTime;
	private Long updateUserId;
	private Boolean activeFlag;
	private Integer quantityType;//1：扣减，2：取消
	private Integer totalCount;//总次数
	private Integer dailyCount;//每天次数
	private Integer persionCount;//每人次数
	private Integer dailyPersionCount;//每人每天次数
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAssociatedCode() {
		return associatedCode;
	}
	public void setAssociatedCode(String associatedCode) {
		this.associatedCode = associatedCode;
	}
	public Integer getAssociatedType() {
		return associatedType;
	}
	public void setAssociatedType(Integer associatedType) {
		this.associatedType = associatedType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Long getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}
	public Boolean getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	public Integer getQuantityType() {
		return quantityType;
	}
	public void setQuantityType(Integer quantityType) {
		this.quantityType = quantityType;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getDailyCount() {
		return dailyCount;
	}
	public void setDailyCount(Integer dailyCount) {
		this.dailyCount = dailyCount;
	}
	public Integer getPersionCount() {
		return persionCount;
	}
	public void setPersionCount(Integer persionCount) {
		this.persionCount = persionCount;
	}
	public Integer getDailyPersionCount() {
		return dailyPersionCount;
	}
	public void setDailyPersionCount(Integer dailyPersionCount) {
		this.dailyPersionCount = dailyPersionCount;
	}
	
}
