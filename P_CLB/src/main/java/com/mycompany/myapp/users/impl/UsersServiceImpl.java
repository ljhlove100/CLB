package com.mycompany.myapp.users.impl;
 

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.users.UsersService;
import com.mycompany.myapp.users.UsersVO;


@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersDAO dao;

	@Override
	public List<Map<String, Object>> getUserList() {
		// TODO Auto-generated method stub
		return dao.getUsersList();
	}

	@Override
	public List<UsersVO> getUserList(UsersVO vo) {
		// TODO Auto-generated method stub
		return dao.getUsersList(vo);
	}

	@Override
	public UsersVO getUsers(String u_id) {
		// TODO Auto-generated method stub
		return dao.getUsers(u_id);
	}

	@Override
	public void insertUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		dao.insertUsers(vo);
	}

	@Override
	public void updateUsers(UsersVO vo) {
		// TODO Auto-generated method stub
		dao.updateUsers(vo);
	}

	@Override
	public void deleteUsers(String u_id) {
		// TODO Auto-generated method stub
		dao.deleteUsers(u_id);
	}

	@Override
	public void Login(String Login) {
		// TODO Auto-generated method stub
		dao.Login(Login);
	}



}
