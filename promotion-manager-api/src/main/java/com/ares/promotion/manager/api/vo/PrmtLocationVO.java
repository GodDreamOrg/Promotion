package com.ares.promotion.manager.api.vo;

import java.io.Serializable;
import java.util.Date;

public class PrmtLocationVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String prmtCode;//活动编码
	private Integer minLevel;//1: 国; 2:省; 3:市; 4:区; 5:门店
	private String countryCode;//国家编码
	private String countryName;//国家名称
	private String provinceCode;//省份编码
	private String provinceName;//省份名称
	private String cityCode;//城市编码
	private String cityName;//城市名称
	private String areaCode;//区域编码
	private String areaName;//区域名称
	private String entityStoreCode;//门店编码
	private String entityStoreName;//门店名称
	private Date createTime;//创建时间
	private String createUserId;//创建人
	private Date updateTime;//修改时间
	private String updateUserId;//修改人
	private Boolean activeFlag;//有效标识. 0=无效;1=有效
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
	public Integer getMinLevel() {
		return minLevel;
	}
	public void setMinLevel(Integer minLevel) {
		this.minLevel = minLevel;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getEntityStoreCode() {
		return entityStoreCode;
	}
	public void setEntityStoreCode(String entityStoreCode) {
		this.entityStoreCode = entityStoreCode;
	}
	public String getEntityStoreName() {
		return entityStoreName;
	}
	public void setEntityStoreName(String entityStoreName) {
		this.entityStoreName = entityStoreName;
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
