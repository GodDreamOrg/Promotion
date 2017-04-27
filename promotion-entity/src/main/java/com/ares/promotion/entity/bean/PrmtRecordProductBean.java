package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class PrmtRecordProductBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long prmtRecordId;//外键.奖励记录ID
	private String categoryCode;//销售目录
	private String brandCode;//品牌CODE
	private String mdseCode;
	private String skuCode;
	private String storeCode;
	private Integer quantity;//数量
	private BigDecimal price;//实际售价
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
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Boolean getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	
}
