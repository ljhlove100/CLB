package com.mycompany.myapp.users;
import java.util.List;
import java.util.Map;


public interface UsersService {



		// 목록조회
		public List<Map<String, Object>> getBoardList();

		public List<UsersVO> getBoardList2(UsersVO vo);

		// 단건저회
		public UsersVO getBoard(String u_id);

		// 입력
		public void insertBoard(UsersVO vo);

		// 수정
		public void updateBoard(UsersVO vo);

		// 삭제
		public void deleteBoard(String u_id);
	}

