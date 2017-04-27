package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.sql.Date;

public class PrmtInfoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String prmtCode;//活动编码
	private String templateCode;//活动模板CODE
	private String prmtName;//活动名称
	private String prmtShortName;
	private String prmtTag;
	private String prmtDesc;//活动描述
	private Integer prmtStatus;//活动状态 (1:草稿; 2:待审核; 3:拒绝; 4:启用: 5:暂停; 6:终止; 7:过期; 8:处理中; 9:驳回
	private Integer prmtType;//促销类型. 原商品活动范围类型字段(以商品作为促销活动规划的主维度).0=无;1=单品;2=订单;3=商品组合(X元N件)(预留);4=固定搭配(删除);5=可选搭配(删除);6=加价购(并入奖励类型)
	private Boolean prmtFlag;//大促标识. 0=否; 1=是(商品列表显示大促图标 ?)
	private String storeCode;
	private Integer associatedType;//关联类型.1=到活动；2=到奖励；3=到活动商品
	private Integer initiatorType;//活动发起方类型. 0=平台;1=事业部;2=销售区域;3=门店
	private String initiatorCode;//活动发起方编码 (预留)
	private Integer preheatingTime;//活动预热分钟数
	private Date beginTime;//开始时间
	private Date endTime;//结束时间
	private Date onShelfTime;//启用/发布时间
	private Integer memberType;//会员类型. 1=全会员; 2=后台维护(参加活动对象关联表,预留,建议使用CRM客户细分);3=指定会员级别(参见会员限制说明, 字段‘会员限制规则’)
	private String memberLimitRule;//会员限制规则. 活动限制了会员类型且会员类型是个人的时候, 根据对应限制的会员等级拼接成, 用于商品详情页展示用
	private String terminal;//终端类型
	private Integer rewardType;//1=送赠品(含券);2=直降;3=折扣;
	private Boolean rewardCollectionRelation;//奖励集和商品范围关系. 1=共享,0=指定
	private String showareaFlag;//活动展示区域标记(预留)
	private Boolean cycleFlag;//周期性时间标记. 1=有;0=无
	private Boolean payLimitFlag;//支付方式限制标识. 活动支付方式限制表没有记录，则值为0，有记录则值为1
	private Integer resourceLockFlag;//资源释放锁定标识. 1=未锁定;2=已锁定;3=已释放
	private Boolean firstOrder;//首单限制. 0=不限制;1=限制
	private String headPicUrl;//头图链接. 活动页使用
	private Date createTime;//创建时间
	private String createUserId;//创建人
	private String createUserName;
	private Date updateTime;//最后修改时间
	private String updateUserId;//修改人
	private Boolean activeFlag;//有效标识. 0=无效;1=有效
	private Date approveTime;//审批时间
	private String approveDesc;//审批备注
	private Date closeTime;//关闭时间
	private String closeDesc;//关闭备注
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
	public String getTemplateCode() {
		return templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getPrmtName() {
		return prmtName;
	}
	public void setPrmtName(String prmtName) {
		this.prmtName = prmtName;
	}
	public String getPrmtShortName() {
		return prmtShortName;
	}
	public void setPrmtShortName(String prmtShortName) {
		this.prmtShortName = prmtShortName;
	}
	public String getPrmtTag() {
		return prmtTag;
	}
	public void setPrmtTag(String prmtTag) {
		this.prmtTag = prmtTag;
	}
	public String getPrmtDesc() {
		return prmtDesc;
	}
	public void setPrmtDesc(String prmtDesc) {
		this.prmtDesc = prmtDesc;
	}
	public Integer getPrmtStatus() {
		return prmtStatus;
	}
	public void setPrmtStatus(Integer prmtStatus) {
		this.prmtStatus = prmtStatus;
	}
	public Integer getPrmtType() {
		return prmtType;
	}
	public void setPrmtType(Integer prmtType) {
		this.prmtType = prmtType;
	}
	public Boolean getPrmtFlag() {
		return prmtFlag;
	}
	public void setPrmtFlag(Boolean prmtFlag) {
		this.prmtFlag = prmtFlag;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public Integer getAssociatedType() {
		return associatedType;
	}
	public void setAssociatedType(Integer associatedType) {
		this.associatedType = associatedType;
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
	public Integer getPreheatingTime() {
		return preheatingTime;
	}
	public void setPreheatingTime(Integer preheatingTime) {
		this.preheatingTime = preheatingTime;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getOnShelfTime() {
		return onShelfTime;
	}
	public void setOnShelfTime(Date onShelfTime) {
		this.onShelfTime = onShelfTime;
	}
	public Integer getMemberType() {
		return memberType;
	}
	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}
	public String getMemberLimitRule() {
		return memberLimitRule;
	}
	public void setMemberLimitRule(String memberLimitRule) {
		this.memberLimitRule = memberLimitRule;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public Integer getRewardType() {
		return rewardType;
	}
	public void setRewardType(Integer rewardType) {
		this.rewardType = rewardType;
	}
	public Boolean getRewardCollectionRelation() {
		return rewardCollectionRelation;
	}
	public void setRewardCollectionRelation(Boolean rewardCollectionRelation) {
		this.rewardCollectionRelation = rewardCollectionRelation;
	}
	public String getShowareaFlag() {
		return showareaFlag;
	}
	public void setShowareaFlag(String showareaFlag) {
		this.showareaFlag = showareaFlag;
	}
	public Boolean getCycleFlag() {
		return cycleFlag;
	}
	public void setCycleFlag(Boolean cycleFlag) {
		this.cycleFlag = cycleFlag;
	}
	public Boolean getPayLimitFlag() {
		return payLimitFlag;
	}
	public void setPayLimitFlag(Boolean payLimitFlag) {
		this.payLimitFlag = payLimitFlag;
	}
	public Integer getResourceLockFlag() {
		return resourceLockFlag;
	}
	public void setResourceLockFlag(Integer resourceLockFlag) {
		this.resourceLockFlag = resourceLockFlag;
	}
	public Boolean getFirstOrder() {
		return firstOrder;
	}
	public void setFirstOrder(Boolean firstOrder) {
		this.firstOrder = firstOrder;
	}
	public String getHeadPicUrl() {
		return headPicUrl;
	}
	public void setHeadPicUrl(String headPicUrl) {
		this.headPicUrl = headPicUrl;
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
	public String getCreateUserName() {
		return createUserName;
	}
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
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
	public Date getApproveTime() {
		return approveTime;
	}
	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}
	public String getApproveDesc() {
		return approveDesc;
	}
	public void setApproveDesc(String approveDesc) {
		this.approveDesc = approveDesc;
	}
	public Date getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}
	public String getCloseDesc() {
		return closeDesc;
	}
	public void setCloseDesc(String closeDesc) {
		this.closeDesc = closeDesc;
	}
	
	
}
