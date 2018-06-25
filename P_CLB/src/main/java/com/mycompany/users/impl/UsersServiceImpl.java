

package com.mycompany.users.impl;
 

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import com.mycompany.users.UsersService;
import com.mycompany.users.UsersVO;
 /*
//@Service("usersService")
public class UsersServiceImpl implements UsersService {
     
    @Resource(name="userDao")
    private UsersDao userDao;
 
     (non-Javadoc)
     * @see com.spring.myapp.service.UsersService#UsersCheck(java.lang.String, java.lang.String)
     
    @Override
    public int UsersCheck(String users_id, String users_pw){
    	    	
    	HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("users_id", users_id);
    	hashMap.put("users_pw", users_pw);
    	
    	return userDao.UsersCheck(hashMap);
    }
    
    @Override
    public List<UsersVO> LoginInfo(String users_id, String users_pw){
    	    	
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
	public List<UsersVO> getAllUsers(int curPage, String search,
			String word) {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("curPage", curPage);
		hashMap.put("search", search);
		hashMap.put("word", word);
		return userDao.getAllUsers(hashMap);
	}
    
    
     (non-Javadoc)
     * @see com.spring.myapp.service.UsersService#getUsersList()
     
    @Override
    public List<UsersVO> getUsersList() {
        return userDao.getUsersList();
    }  
    
    @Override
    public List<UsersVO> getUsersInfo(String users_id){
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
*/