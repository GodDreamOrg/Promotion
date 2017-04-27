package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class PrmtRuleBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String prmtCode;//活动编码
	private String rewardCollectionCode;//奖励集编码
	private String rewardCollectionName;//奖励集名称
	private Integer levelId;//奖励层级编号
	private Integer triggerEvent;//1=注册;2=登录/到店;3=购物;4=支付;5=免费领取;6=评论;7=晒单;8=抽奖;9=游戏;10=会员营销;11=券使用;12=首单购物;13=分享抢红包;14=定向发券;15=补偿返券
	private Integer baseAddupType;//基数累计方式 0=无;1=固定值;2=每;3=满
	private BigDecimal baseAmount;//基数数值
	private Integer baseAmountType;//基数量词类型. 1=金额/元；2=件数；3=人数；4=概率
	private Date createTime;// 创建时间
	private String createUserId;// 创建人
	private Date updateTime;// 最后修改时间
	private String updateUserId;// 最后修改人
	private Boolean activeFlag;// 有效标识. 0=无效;1=有效,
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrmtCode() {
		return prmtCode;
	}
	public void setPrmtCode(String prmtCode) {
		this.prmtCode = prmtCode;
	}
	public String getRewardCollectionCode() {
		return rewardCollectionCode;
	}
	public void setRewardCollectionCode(String rewardCollectionCode) {
		this.rewardCollectionCode = rewardCollectionCode;
	}
	public String getRewardCollectionName() {
		return rewardCollectionName;
	}
	public void setRewardCollectionName(String rewardCollectionName) {
		this.rewardCollectionName = rewardCollectionName;
	}
	public Integer getLevelId() {
		return levelId;
	}
	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}
	public Integer getTriggerEvent() {
		return triggerEvent;
	}
	public void setTriggerEvent(Integer triggerEvent) {
		this.triggerEvent = triggerEvent;
	}
	public Integer getBaseAddupType() {
		return baseAddupType;
	}
	public void setBaseAddupType(Integer baseAddupType) {
		this.baseAddupType = baseAddupType;
	}
	public BigDecimal getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(BigDecimal baseAmount) {
		this.baseAmount = baseAmount;
	}
	public Integer getBaseAmountType() {
		return baseAmountType;
	}
	public void setBaseAmountType(Integer baseAmountType) {
		this.baseAmountType = baseAmountType;
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
