package com.mycompany.myapp.users;
import java.util.List;
import java.util.Map;


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
	}

