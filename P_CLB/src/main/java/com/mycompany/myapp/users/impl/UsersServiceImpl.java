package com.mycompany.myapp.users.impl;
 

import java.util.HashMap;
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
	public int getLoginck(String u_id, String pw) {
		// TODO Auto-generated method stub
		HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("u_id", u_id);
    	hashMap.put("pw", pw);
    	
    	return dao.getLoginck(hashMap);
    }

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

	//회원추가
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

	@Override
	public String getUsersName(String u_id) {
		// TODO Auto-generated method stub

		HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("u_id", u_id);    	
    	
    	return dao.getUsersName(hashMap);
    }
	
	@Override
	public void account(String u_id, String email, String pw, String name, String yn, String addr, String zipcode) {
		// TODO Auto-generated method stub

		HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("u_id", u_id); 
    	hashMap.put("email", email);
    	hashMap.put("pw", pw);
    	hashMap.put("name", name);
    	hashMap.put("yn", yn);
    	hashMap.put("addr", addr);
    	hashMap.put("zipcode", zipcode);
    	
    	dao.account(hashMap);
    }

	//관리자권한
	@Override
	public String getAdmin(String yn) {
		HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("yn", yn);
    	
    	return dao.getAdmin(hashMap);
	}

	//비밀번호인증
	@Override
	public int findpw(String u_id, String name) {
		HashMap<String,String> hashMap = new HashMap<String,String>();
		hashMap.put("u_id", u_id);
		hashMap.put("name", name);
		
		return dao.findpw(hashMap);
	}

	//회원정보수정
	@Override
	public int profile(String u_id, String name) {
		
		return 0;
	}
}
