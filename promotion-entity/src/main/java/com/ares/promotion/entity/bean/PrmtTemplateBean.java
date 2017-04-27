package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.sql.Date;

public class PrmtTemplateBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String templateCode;//活动模板CODE
	private String templateName; //活动模板名称
	private Integer templateType; //模板类型. 0=活动模板;1=券模板
	private Integer initiatorType;//活动发起方类型
	private String initiatorCode;//活动发起方
	private Integer cycleFlag; //周期时间标识
	private String prmtStore; //活动商户
	private String terminal; //终端类型
	private String memberType;//客户类型
	private Integer payLimitFlag; //支付限制标识
	private Integer payType; //支付类型
	private Integer prmtType; //促销类型
	private String mdseResourceType;//商品来源类型. 1=平台商品中心;2=整车商品中心
	private String mdseRangeType; //商品范围类型
	private Integer triggerEvent; //触发事件
	private String baseAddupType; //累计方式
	private String amountType;//量词类型
	private String rewardType;//奖励类型
	private String rewardAmountType;//奖励数值类型
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
	public String getTemplateCode() {
		return templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public Integer getTemplateType() {
		return templateType;
	}
	public void setTemplateType(Integer templateType) {
		this.templateType = templateType;
	}
	public Integer getInitiatorType() {
		return initiatorType;
	}
	public void setInitiatorType(Integer initiatorType) {
		this.initiatorType = initiatorType;
	}
	public String getInitiatorCode() {
		return initiatorCode;
	}
	public void setInitiatorCode(String initiatorCode) {
		this.initiatorCode = initiatorCode;
	}
	public Integer getCycleFlag() {
		return cycleFlag;
	}
	public void setCycleFlag(Integer cycleFlag) {
		this.cycleFlag = cycleFlag;
	}
	public String getPrmtStore() {
		return prmtStore;
	}
	public void setPrmtStore(String prmtStore) {
		this.prmtStore = prmtStore;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public Integer getPayLimitFlag() {
		return payLimitFlag;
	}
	public void setPayLimitFlag(Integer payLimitFlag) {
		this.payLimitFlag = payLimitFlag;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public Integer getPrmtType() {
		return prmtType;
	}
	public void setPrmtType(Integer prmtType) {
		this.prmtType = prmtType;
	}
	public String getMdseResourceType() {
		return mdseResourceType;
	}
	public void setMdseResourceType(String mdseResourceType) {
		this.mdseResourceType = mdseResourceType;
	}
	public String getMdseRangeType() {
		return mdseRangeType;
	}
	public void setMdseRangeType(String mdseRangeType) {
		this.mdseRangeType = mdseRangeType;
	}
	public Integer getTriggerEvent() {
		return triggerEvent;
	}
	public void setTriggerEvent(Integer triggerEvent) {
		this.triggerEvent = triggerEvent;
	}
	public String getBaseAddupType() {
		return baseAddupType;
	}
	public void setBaseAddupType(String baseAddupType) {
		this.baseAddupType = baseAddupType;
	}
	public String getAmountType() {
		return amountType;
	}
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}
	public String getRewardType() {
		return rewardType;
	}
	public void setRewardType(String rewardType) {
		this.rewardType = rewardType;
	}
	public String getRewardAmountType() {
		return rewardAmountType;
	}
	public void setRewardAmountType(String rewardAmountType) {
		this.rewardAmountType = rewardAmountType;
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
