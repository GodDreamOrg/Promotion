package com.ares.promotion.manager.api.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PrmtRewardLimitVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer associatedType;//关联类型.1=到活动；2=到奖励；3=到活动商品
	private String associatedCode;//关联编码 (如果到活动，就是活动编码;如果到奖励，就是奖励编号；如果到活动商品，就是 活动编码+商品范围关联类型+对应编码<目录编码|SKU编码|SPU编码|品牌编码> )
	private Long associatedId;
	private Integer usedCount;//已使用次数
	private Integer dailyPersionCount;//每人每天可参加次数
	private Integer persionCount;//每人可参加次数
	private Integer dailyCount;//每天总优惠次数
	private Integer totalCount;//总次数
	private BigDecimal totalAmount;//总额度
	private BigDecimal dailyAmount;//每天总优惠金额
	private BigDecimal usedAmount;//已使用额度
	private BigDecimal persionAmount;//每人可优惠金额
	private BigDecimal dailyPersionAmount;//每人每天可优惠金额
	private Integer orderSkuMaxNum;//订单商品数量累计上限
	private Integer orderSkuMinNum;//订单商品数量累计下限
	private String accountLimit;//账户限制
	private Integer memberType;//会员类型
	private String memberLevel;//会员等级限制
	private Integer deliveryType;//配送方式限制
	private Date registerStartTime;//注册开始时间
	private Date registerEndTime;//注册结束时间
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
	public Integer getAssociatedType() {
		return associatedType;
	}
	public void setAssociatedType(Integer associatedType) {
		this.associatedType = associatedType;
	}
	public String getAssociatedCode() {
		return associatedCode;
	}
	public void setAssociatedCode(String associatedCode) {
		this.associatedCode = associatedCode;
	}
	public Long getAssociatedId() {
		return associatedId;
	}
	public void setAssociatedId(Long associatedId) {
		this.associatedId = associatedId;
	}
	public Integer getUsedCount() {
		return usedCount;
	}
	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}
	public Integer getDailyPersionCount() {
		return dailyPersionCount;
	}
	public void setDailyPersionCount(Integer dailyPersionCount) {
		this.dailyPersionCount = dailyPersionCount;
	}
	public Integer getPersionCount() {
		return persionCount;
	}
	public void setPersionCount(Integer persionCount) {
		this.persionCount = persionCount;
	}
	public Integer getDailyCount() {
		return dailyCount;
	}
	public void setDailyCount(Integer dailyCount) {
		this.dailyCount = dailyCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BigDecimal getDailyAmount() {
		return dailyAmount;
	}
	public void setDailyAmount(BigDecimal dailyAmount) {
		this.dailyAmount = dailyAmount;
	}
	public BigDecimal getUsedAmount() {
		return usedAmount;
	}
	public void setUsedAmount(BigDecimal usedAmount) {
		this.usedAmount = usedAmount;
	}
	public BigDecimal getPersionAmount() {
		return persionAmount;
	}
	public void setPersionAmount(BigDecimal persionAmount) {
		this.persionAmount = persionAmount;
	}
	public BigDecimal getDailyPersionAmount() {
		return dailyPersionAmount;
	}
	public void setDailyPersionAmount(BigDecimal dailyPersionAmount) {
		this.dailyPersionAmount = dailyPersionAmount;
	}
	public Integer getOrderSkuMaxNum() {
		return orderSkuMaxNum;
	}
	public void setOrderSkuMaxNum(Integer orderSkuMaxNum) {
		this.orderSkuMaxNum = orderSkuMaxNum;
	}
	public Integer getOrderSkuMinNum() {
		return orderSkuMinNum;
	}
	public void setOrderSkuMinNum(Integer orderSkuMinNum) {
		this.orderSkuMinNum = orderSkuMinNum;
	}
	public String getAccountLimit() {
		return accountLimit;
	}
	public void setAccountLimit(String accountLimit) {
		this.accountLimit = accountLimit;
	}
	public Integer getMemberType() {
		return memberType;
	}
	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public Integer getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(Integer deliveryType) {
		this.deliveryType = deliveryType;
	}
	public Date getRegisterStartTime() {
		return registerStartTime;
	}
	public void setRegisterStartTime(Date registerStartTime) {
		this.registerStartTime = registerStartTime;
	}
	public Date getRegisterEndTime() {
		return registerEndTime;
	}
	public void setRegisterEndTime(Date registerEndTime) {
		this.registerEndTime = registerEndTime;
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
