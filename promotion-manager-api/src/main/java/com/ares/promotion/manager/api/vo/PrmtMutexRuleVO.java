package com.ares.promotion.manager.api.vo;

import java.io.Serializable;
import java.util.Date;

public class PrmtMutexRuleVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String prmtCharacter;// 属性集. 属性集以间隔,顺序:活动发起方模板类型奖励触发形式奖励类型商品类型支付方式限制
	private String excludeCharacter;// 互斥属性集. 属性集以间隔,顺序:活动发起方模板类型奖励触发形式奖励类型商品类型支付方式限制
	private String ruleDesc;// 规则说明
	private Boolean useScene;// 使用场景. 0=新建;1=执行
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
	public String getPrmtCharacter() {
		return prmtCharacter;
	}
	public void setPrmtCharacter(String prmtCharacter) {
		this.prmtCharacter = prmtCharacter;
	}
	public String getExcludeCharacter() {
		return excludeCharacter;
	}
	public void setExcludeCharacter(String excludeCharacter) {
		this.excludeCharacter = excludeCharacter;
	}
	public String getRuleDesc() {
		return ruleDesc;
	}
	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}
	public Boolean getUseScene() {
		return useScene;
	}
	public void setUseScene(Boolean useScene) {
		this.useScene = useScene;
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
