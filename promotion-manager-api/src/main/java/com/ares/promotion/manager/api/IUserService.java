package com.ares.promotion.manager.api;

import com.ares.promotion.manager.api.vo.UserInfoVO;
import com.meidusa.venus.annotations.Endpoint;
import com.meidusa.venus.annotations.Param;
import com.meidusa.venus.annotations.Service;

@Service(name = "UserService", version = 1, description = "促销管理角色相关接口")
public interface IUserService {
	@Endpoint(name = "getUserById", async = false)
	public UserInfoVO getUserById(@Param(name = "id") Long id);
}
