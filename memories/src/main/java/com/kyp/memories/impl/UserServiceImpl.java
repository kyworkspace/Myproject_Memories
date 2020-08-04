package com.kyp.memories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kyp.memories.service.UserService;
import com.kyp.memories.DAO.UserDAO;
import com.kyp.memories.VO.UserVO;

@Repository
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public List<UserVO> getUsers() {
			System.out.println("서비스임플까지 들어옴");
		return userDAO.getUsers();
	}
	
	

}
