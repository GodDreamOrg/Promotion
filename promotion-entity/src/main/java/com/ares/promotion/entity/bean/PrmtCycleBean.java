package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.sql.Date;

public class PrmtCycleBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String prmtCode;//活动编码
	private String cycleType;//周期类型.W：每周；M：每月；D：每天
	private Integer cycleEffectiveTime;//生效时间秒数. 多个值，以_间隔,每周:(周日)1~7(周六),每月:1~31
	private Date cycleStartTime;//每天开始时间
	private Date cycleEndTime;//每天截止时间
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
	public String getCycleType() {
		return cycleType;
	}
	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
	}
	public Integer getCycleEffectiveTime() {
		return cycleEffectiveTime;
	}
	public void setCycleEffectiveTime(Integer cycleEffectiveTime) {
		this.cycleEffectiveTime = cycleEffectiveTime;
	}
	public Date getCycleStartTime() {
		return cycleStartTime;
	}
	public void setCycleStartTime(Date cycleStartTime) {
		this.cycleStartTime = cycleStartTime;
	}
	public Date getCycleEndTime() {
		return cycleEndTime;
	}
	public void setCycleEndTime(Date cycleEndTime) {
		this.cycleEndTime = cycleEndTime;
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
