package com.mycompany.myapp.users;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;



@Service
public interface UsersService {



		// 목록조회
		public List<Map<String, Object>> getUserList();

		public List<UsersVO> getUserList(UsersVO vo);

		// 단건조회
		public UsersVO getUsers(String u_id);

		// 입력
		public void insertUsers(UsersVO vo);

		// 수정
		public void updateUsers(UsersVO vo);

		// 삭제
		public void deleteUsers(String u_id);
		
		//로그인
		public void Login(String Login);
		
	/**
	 * @param users_id
	 * @param users_pw
	 * @return LoginCheck(usersinfo)
	 */
	// 로그인체크
	public int getLoginck(String u_id, String pw);
	
	/**
     * @return	UsersList
     */
	
	public String getUsersName(String u_id);
	
	public String getAdmin(String yn);
	
	public void account(String u_id, String pw, String name, String yn);
	
	/////////////////////////////////////////////////
	
}

