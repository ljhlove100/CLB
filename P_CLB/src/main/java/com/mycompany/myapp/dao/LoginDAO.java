package com.mycompany.myapp.dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


	/*
 * DAO : Data Access Object (DB처리)
 */
	
public class LoginDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;

	// 등록
	public void usersInsert(SignUpVO vo) {
		try {
			conn = ConnectionManager.connect();
			conn.setAutoCommit(false);
			String sql = "insert into users(u_id, pw, name, email, insertdate, updatday, yn) values(?,?,?,?,syadate,syadate,'Y')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getU_id());
			pstmt.setString(2, vo.getU_id());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.executeUpdate();
			conn.commit(); // 정상실행이면 커밋

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback(); // 에러나면 롤백
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			ConnectionManager.close(conn);
		}
	}

	// 수정
	public void usersUpdate(SignUpVO vo) {
		try {
			conn = ConnectionManager.connect();
			String sql = " update users set	name=?, pw=?, tel=?, phone=?, addr=?"
					+ " WHERE u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getTel());
			pstmt.setString(4, vo.getPhone());
			pstmt.setString(5, vo.getAddr());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn);
		}
	}

	// 삭제
	public void usersDelete(String u_id) {
		try {
			conn = ConnectionManager.connect();
			String sql = " Delete FROM users  	" + " WHERE u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u_id);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn);
		}
	}

	// 전체조회
	public List<SignUpVO> getUsersList(SignUpSearchVO searchVo) {
		List<SignUpVO> list = new ArrayList<>();
		SignUpVO vo = null;
		String whereCondition = "where 1=1";
		
		try {
			conn = ConnectionManager.connect();
			String sql = "select b.* from(select a.*, rownum rn from("
					+ " SELECT * from users "
					+ whereCondition + " ORDER BY u_id" + ")a	)b where rn between ? and ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, searchVo.getStart());
			pstmt.setInt(2, searchVo.getEnd());

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new SignUpVO();
				vo.setName(rs.getString("name"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn);
		}
		return list;

	}
	public Boolean loginCheck(String id, String pw) {
		Boolean rss = false;
		try {
			conn = ConnectionManager.connect();
			String sql = "select * from users where u_id=? and pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				
				rss=true;				
			} else {
				rss= false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn);
		}  
		return rss;
	} 
	
	public SignUpVO getUsersInfo(String id) {
		SignUpVO vo =null;
		
		try {
			conn = ConnectionManager.connect();
			String sql = "select * from users where u_id=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				vo=new SignUpVO();
				vo.setU_id(rs.getString("u_id"));
				vo.setName(rs.getString("name"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn);
		}  
		return vo;
	}








	}