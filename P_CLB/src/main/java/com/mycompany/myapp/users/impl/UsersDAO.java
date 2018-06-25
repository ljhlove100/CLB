package com.mycompany.myapp.users.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.users.UsersVO;


@Repository
public class UsersDAO {

	@Autowired
	SqlSessionTemplate mybatis;

	// 목록조회
	public List<Map<String, Object>> getUsersList() {
		return mybatis.selectList("com.mycompany.myapp.UsersDAO.getUsersList");
	};

	public List<UsersVO> getUsersList(UsersVO vo) {
		System.out.println(vo);
		return mybatis.selectList("com.mycompany.myapp.UsersDAO.getUsersList", vo);
	};

	// 단건저회
	public UsersVO getUsers(String u_id) {
		return mybatis.selectOne("com.mycompany.myapp.UsersDAO.getUsers", u_id);
	}

	// 입력
	public void insertUsers(UsersVO vo) {
		mybatis.insert("com.mycompany.myapp.UsersDAO.insertusers", vo);
	}

	// 수정
	public void updateUsers(UsersVO vo) {
		mybatis.update("com.mycompany.myapp.UsersDAO.updateusers", vo);
	}

	// 삭제
	public void deleteUsers(String u_id) {
		mybatis.delete("com.mycompany.myapp.UsersDAO.deleteusers", u_id);
	}

	
}