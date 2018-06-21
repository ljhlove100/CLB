/*******************************************************************************
 * 파일명 : UsersServiceImpl.java
 * 작성자 : 이성형
 * 작성일자 : 2015. 05. 15
 *
 * 클래스 개요: 로그인, users info
 * =============================================================================
 * 수정내역
 * NO		수정일자		수정자		수정내역  
 * 001.	2015. 05. 15 	이성형		최초작성
 * =============================================================================
 */

package com.mycompany.myapp.service.impl;
 

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mycompany.myapp.model.Users;
import com.mycompany.myapp.service.UsersService;
 
//@Service("usersService")
public class UsersServiceImpl implements UsersService {
     
    @Resource(name="userDao")
    private UsersDao userDao;
 
    /* (non-Javadoc)
     * @see com.spring.myapp.service.UsersService#UsersCheck(java.lang.String, java.lang.String)
     */
    @Override
    public int UsersCheck(String users_id, String users_pw){
    	    	
    	HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("users_id", users_id);
    	hashMap.put("users_pw", users_pw);
    	
    	return userDao.UsersCheck(hashMap);
    }
    
    @Override
    public List<Users> LoginInfo(String users_id, String users_pw){
    	    	
    	HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("users_id", users_id);
    	hashMap.put("users_pw", users_pw);
    	
    	return userDao.LoginInfo(hashMap);
    }
    
    @Override
	public int getTotalUsersCnt(String search, String word) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("search", search);
		hashMap.put("word", word);
				
		return userDao.getTotalUsersCnt(hashMap);
	}
    
    @Override
	public List<Users> getAllUsers(int curPage, String search,
			String word) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("curPage", curPage);
		hashMap.put("search", search);
		hashMap.put("word", word);
		return userDao.getAllUsers(hashMap);
	}
    
    
    /* (non-Javadoc)
     * @see com.spring.myapp.service.UsersService#getUsersList()
     */
    @Override
    public List<Users> getUsersList() {
        return userDao.getUsersList();
    }  
    
    @Override
    public List<Users> getUsersInfo(String users_id){
    	HashMap<String, Object> hashMap = new HashMap<String, Object>();
    	hashMap.put("users_id", users_id);
    	return userDao.getUsersInfo(hashMap);
    }
    
    
    @Override
    public String getUsersName(String users_id){
    	    	
    	HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("users_id", users_id);    	
    	
    	return userDao.getUsersName(hashMap);
    }    
    @Override
	public String getUsersDepartment(String users_id){
		HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("users_id", users_id); 
    	
    	return userDao.getUsersDepartment(hashMap);
	}
    @Override
	public String getUsersCompany(String users_id){
		HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("users_id", users_id);  
    	
    	return userDao.getUsersCompany(hashMap);
	}
    @Override
	public String getUsersTeam(String users_id){
		HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("users_id", users_id);    	
    	
    	return userDao.getUsersTeam(hashMap);
	}
    @Override
	public String getUsersPosition(String users_id){
		HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("users_id", users_id);    
    	
    	return userDao.getUsersPosition(hashMap);
	}
}
