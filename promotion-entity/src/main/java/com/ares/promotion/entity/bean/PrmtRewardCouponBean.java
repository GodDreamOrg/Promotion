package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PrmtRewardCouponBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long rewardDetailId;//奖励明细ID
	private Integer giftType;//赠品类型 0=免费赠品;1=普通商品\r\n
	private String pondCode;//券码
	private String pondName;//券名称
	private Integer singleCount;//单次赠送数量
	private Integer totalCount;//赠送总数
	private Integer usedCount;//已赠送总数
	private BigDecimal buyAmount;//换购金额
	private BigDecimal settleAmount;//结算价
	private Date createTime;// 创建时间
	private String createUserId;// 创建人
	private Date updateTime;// 最后修改时间
	private String updateUserId;// 最后修改人
	private Boolean activeFlag;// 有效标识. 0=无效;1=有效,
	private BigDecimal faceValue;//劵面值
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRewardDetailId() {
		return rewardDetailId;
	}
	public void setRewardDetailId(Long rewardDetailId) {
		this.rewardDetailId = rewardDetailId;
	}
	public Integer getGiftType() {
		return giftType;
	}
	public void setGiftType(Integer giftType) {
		this.giftType = giftType;
	}
	public String getPondCode() {
		return pondCode;
	}
	public void setPondCode(String pondCode) {
		this.pondCode = pondCode;
	}
	public String getPondName() {
		return pondName;
	}
	public void setPondName(String pondName) {
		this.pondName = pondName;
	}
	public Integer getSingleCount() {
		return singleCount;
	}
	public void setSingleCount(Integer singleCount) {
		this.singleCount = singleCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getUsedCount() {
		return usedCount;
	}
	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}
	public BigDecimal getBuyAmount() {
		return buyAmount;
	}
	public void setBuyAmount(BigDecimal buyAmount) {
		this.buyAmount = buyAmount;
	}
	public BigDecimal getSettleAmount() {
		return settleAmount;
	}
	public void setSettleAmount(BigDecimal settleAmount) {
		this.settleAmount = settleAmount;
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
	public BigDecimal getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(BigDecimal faceValue) {
		this.faceValue = faceValue;
	}
	
}
