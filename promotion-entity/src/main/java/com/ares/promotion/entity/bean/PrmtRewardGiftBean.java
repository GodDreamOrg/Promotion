package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class PrmtRewardGiftBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long reward_Detail_Id;//奖励明细ID
	private Integer gift_Type;//赠品类型 0=免费赠品;1=普通商品\r\n
	private String gift_Sku_Code;//赠品SKU编码
	private String gift_Sku_Name;//赠品SKU名称
	private Integer single_Count;//单次赠送数量
	private Integer total_Count;//赠送总数
	private Integer used_Count;//已赠送总数
	private BigDecimal buy_Amount;//换购金额
	private BigDecimal settle_Amount;//结算价
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
	public Long getReward_Detail_Id() {
		return reward_Detail_Id;
	}
	public void setReward_Detail_Id(Long reward_Detail_Id) {
		this.reward_Detail_Id = reward_Detail_Id;
	}
	public Integer getGift_Type() {
		return gift_Type;
	}
	public void setGift_Type(Integer gift_Type) {
		this.gift_Type = gift_Type;
	}
	public String getGift_Sku_Code() {
		return gift_Sku_Code;
	}
	public void setGift_Sku_Code(String gift_Sku_Code) {
		this.gift_Sku_Code = gift_Sku_Code;
	}
	public String getGift_Sku_Name() {
		return gift_Sku_Name;
	}
	public void setGift_Sku_Name(String gift_Sku_Name) {
		this.gift_Sku_Name = gift_Sku_Name;
	}
	public Integer getSingle_Count() {
		return single_Count;
	}
	public void setSingle_Count(Integer single_Count) {
		this.single_Count = single_Count;
	}
	public Integer getTotal_Count() {
		return total_Count;
	}
	public void setTotal_Count(Integer total_Count) {
		this.total_Count = total_Count;
	}
	public Integer getUsed_Count() {
		return used_Count;
	}
	public void setUsed_Count(Integer used_Count) {
		this.used_Count = used_Count;
	}
	public BigDecimal getBuy_Amount() {
		return buy_Amount;
	}
	public void setBuy_Amount(BigDecimal buy_Amount) {
		this.buy_Amount = buy_Amount;
	}
	public BigDecimal getSettle_Amount() {
		return settle_Amount;
	}
	public void setSettle_Amount(BigDecimal settle_Amount) {
		this.settle_Amount = settle_Amount;
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
