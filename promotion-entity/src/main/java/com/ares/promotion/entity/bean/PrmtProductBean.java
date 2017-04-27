package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.util.Date;

public class PrmtProductBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String prmtCode;// 活动编码
	private String rewardCollectionCode;// 奖励集编号. 当奖励集和商品范围关系为“单独指定”时，该字段为该商品对应的奖励集
	private Integer relationType;// 商品范围关联类型. 0=SPU;1=SKU;2=品类(是否需要指定级别?);3=品牌;4=品牌+品类;5=店铺
	private Boolean assocaitedType;// 操作类型. 0=包含;1=排除,
	private String categoryCode;// 销售目录
	private String categoryName;
	private String categoryLevel;
	private String storeCode;// 店铺编码
	private String brandCode;// 品牌编码
	private String mdseCode;// 商品编码
	private String mdseName;
	private String skuCode;// SKU编码
	private String skuName;
	private Date startTime;// 开始时间,同活动基本信息表
	private Date endTime;// 结束时间,同活动基本信息表
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
	public Integer getRelationType() {
		return relationType;
	}
	public void setRelationType(Integer relationType) {
		this.relationType = relationType;
	}
	public Boolean getAssocaitedType() {
		return assocaitedType;
	}
	public void setAssocaitedType(Boolean assocaitedType) {
		this.assocaitedType = assocaitedType;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryLevel() {
		return categoryLevel;
	}
	public void setCategoryLevel(String categoryLevel) {
		this.categoryLevel = categoryLevel;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getBrandCode() {
		return brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}
	public String getMdseCode() {
		return mdseCode;
	}
	public void setMdseCode(String mdseCode) {
		this.mdseCode = mdseCode;
	}
	public String getMdseName() {
		return mdseName;
	}
	public void setMdseName(String mdseName) {
		this.mdseName = mdseName;
	}
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
