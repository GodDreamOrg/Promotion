package com.ares.promotion.manager.api.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PrmtRewardVO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long prmtRuleId;//促销活动条件ID
	private Integer rewardType;//奖励类型. 0=无;1=送赠品;2=降价;3=加价购;4=送券;5=送积分;6=免邮;7=减价
	private Integer rewardAmountType;//奖励数值类型. 1=金额/元;2=折扣;3=件数;4=人数;5=定价;6=外围系统指定
	private BigDecimal rewardAmount;//奖励数值
	private Integer rewardAmount2;//奖励数值类型为1=金额/元，5=定价时，对应积分金额
	private Integer pointDiscountFlag;//积分折扣标识
	private String rewardDesc;//奖励信息描述
	private BigDecimal singleMaxAmount;//单次奖励最多优惠
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
	public Long getPrmtRuleId() {
		return prmtRuleId;
	}
	public void setPrmtRuleId(Long prmtRuleId) {
		this.prmtRuleId = prmtRuleId;
	}
	public Integer getRewardType() {
		return rewardType;
	}
	public void setRewardType(Integer rewardType) {
		this.rewardType = rewardType;
	}
	public Integer getRewardAmountType() {
		return rewardAmountType;
	}
	public void setRewardAmountType(Integer rewardAmountType) {
		this.rewardAmountType = rewardAmountType;
	}
	public BigDecimal getRewardAmount() {
		return rewardAmount;
	}
	public void setRewardAmount(BigDecimal rewardAmount) {
		this.rewardAmount = rewardAmount;
	}
	public Integer getRewardAmount2() {
		return rewardAmount2;
	}
	public void setRewardAmount2(Integer rewardAmount2) {
		this.rewardAmount2 = rewardAmount2;
	}
	public Integer getPointDiscountFlag() {
		return pointDiscountFlag;
	}
	public void setPointDiscountFlag(Integer pointDiscountFlag) {
		this.pointDiscountFlag = pointDiscountFlag;
	}
	public String getRewardDesc() {
		return rewardDesc;
	}
	public void setRewardDesc(String rewardDesc) {
		this.rewardDesc = rewardDesc;
	}
	public BigDecimal getSingleMaxAmount() {
		return singleMaxAmount;
	}
	public void setSingleMaxAmount(BigDecimal singleMaxAmount) {
		this.singleMaxAmount = singleMaxAmount;
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
