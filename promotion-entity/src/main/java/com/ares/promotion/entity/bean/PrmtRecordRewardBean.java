package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class PrmtRecordRewardBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long prmtRecordId;//促销奖励记录ID
	private Long ruleId;//促销规则ID
	private Long rewardId;//促销奖励ID
	private Integer rewardType;//奖励类型.1=送赠品;2=降价;3=加价购;4=送券
	private Long rewardGiftRefId;//赠品或赠券ID
	private Integer actualRewardGiftCount;
	private BigDecimal rewardPrice;//促销直降/折扣金额
	private Boolean activeFlag;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPrmtRecordId() {
		return prmtRecordId;
	}
	public void setPrmtRecordId(Long prmtRecordId) {
		this.prmtRecordId = prmtRecordId;
	}
	public Long getRuleId() {
		return ruleId;
	}
	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}
	public Long getRewardId() {
		return rewardId;
	}
	public void setRewardId(Long rewardId) {
		this.rewardId = rewardId;
	}
	public Integer getRewardType() {
		return rewardType;
	}
	public void setRewardType(Integer rewardType) {
		this.rewardType = rewardType;
	}
	public Long getRewardGiftRefId() {
		return rewardGiftRefId;
	}
	public void setRewardGiftRefId(Long rewardGiftRefId) {
		this.rewardGiftRefId = rewardGiftRefId;
	}
	public Integer getActualRewardGiftCount() {
		return actualRewardGiftCount;
	}
	public void setActualRewardGiftCount(Integer actualRewardGiftCount) {
		this.actualRewardGiftCount = actualRewardGiftCount;
	}
	public BigDecimal getRewardPrice() {
		return rewardPrice;
	}
	public void setRewardPrice(BigDecimal rewardPrice) {
		this.rewardPrice = rewardPrice;
	}
	public Boolean getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
