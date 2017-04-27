package com.ares.promotion.entity.bean;

import java.io.Serializable;
import java.util.Date;

public class PrmtPaymentLimitBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String prmtCode;//活动编码
	private Integer paymentType;//支付方式
	private String paymentChannel;//支付渠道
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
	public Integer getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentChannel() {
		return paymentChannel;
	}
	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
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
