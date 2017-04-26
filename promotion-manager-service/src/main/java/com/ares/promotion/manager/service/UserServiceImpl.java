package com.ares.promotion.manager.service;

import org.springframework.stereotype.Service;

import com.ares.promotion.manager.api.IUserService;
import com.ares.promotion.manager.api.vo.UserInfoVO;

@Service("UserService")
public class UserServiceImpl implements IUserService{

	@Override
	public UserInfoVO getUserById(Long id) {
		UserInfoVO userInfoVO = new UserInfoVO();
		userInfoVO.setAge(18);
		userInfoVO.setName("hehe");
		return userInfoVO;
	}

}
