package com.kyp.memories.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kyp.memories.VO.UserVO;

@Repository
public class UserDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<UserVO> getUsers(){
		
		System.out.println("DAO ¾È±îÁö ¿È ");
		
		return sqlSession.selectList("getTestValue");
	}

}
