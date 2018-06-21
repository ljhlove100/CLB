/*package com.mycompany.myapp.dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import common.ConnectionManager;

	
 * DAO : Data Access Object (DB처리)
 
	
public class SignUpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;

	// 등록
	public void usersInsert(SignUpVO vo) {
		try {
			conn = ConnectionManager.connect();
			conn.setAutoCommit(false);
			String sql = "insert into users(u_id, pw, name, email, insertdate, updateday, yn) values(?,?,?,?,sysdate,sysdate,'Y')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getU_id());
			pstmt.setString(2, vo.getPw());
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
			pstmt.setString(6, vo.getU_id());
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

	// 단건조회
	public SignUpVO getUsers(String u_id) {
		SignUpVO vo = null;
		try {
			conn = ConnectionManager.connect();
			String sql = " SELECT * " + " FROM users "
					+ " WHERE u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, u_id);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new SignUpVO();
				vo.setU_id(rs.getInt("u_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn);
		}
		return vo;
	}

	// 전체조회
	public List<SignUpVO> getUsersList(SignUpSearchVO searchVo) {
		List<SignUpVO> list = new ArrayList<>();
		SignUpVO vo = null;
		String whereCondition = "where 1=1";
		
		try {
			conn = ConnectionManager.connect();
			String sql = "select b.* from(select a.*, rownum rn from("
					+ " SELECT * FROM users"
					+ whereCondition + " ORDER BY u_id" + ")a	)b where rn between ? and ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, searchVo.getStart());
			pstmt.setInt(2, searchVo.getEnd());

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new SignUpVO(); //보여주는값
				vo.setName(rs.getString("name"));
				vo.setU_id(rs.getString("u_id"));
				vo.setTel(rs.getString("tel"));
				vo.setPhone(rs.getString("phone"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn);
		}
		return list;

	}
	
	}*/