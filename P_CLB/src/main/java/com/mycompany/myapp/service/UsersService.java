/*******************************************************************************
 * 파일명 : UsersService.java
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

package com.mycompany.myapp.service;
 
import java.util.List;

import com.mycompany.myapp.model.Users;
 
public interface UsersService {
     
	/**
     * @param users_id
     * @param users_pw
     * @return UsersCheck(0 or 1)
     */
    public int UsersCheck(String users_id, String users_pw);
    
    /**
     * @param users_id
     * @param users_pw
     * @return LoginCheck(usersinfo)
     */
    List<Users>	LoginInfo(String users_id, String users_pw);
		
    /**
     * @return	UsersList
     */
    List<Users> getUsersList();
   
    int getTotalUsersCnt(String search, String word);
    
    List<Users> getAllUsers(int curPage, String search, String word);
    
    List<Users> getUsersInfo(String users_id);
    
    public String getUsersName(String users_id);

	public String getUsersDepartment(String users_id);

	public String getUsersCompany(String users_id);

	public String getUsersTeam(String users_id);

	public String getUsersPosition(String users_id);

	
   
}