package com.mycompany.myapp.users.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.users.UsersVO;


@Repository
public class UsersDAO {

   @Autowired
   SqlSessionTemplate mybatis;

   // 목록조회
   public List<Map<String, Object>> getUsersList() {
      return mybatis.selectList("com.mycompany.myapp.users.UsersDAO.getUsersList");
   };

   public List<UsersVO> getUsersList(UsersVO vo) {
      System.out.println(vo);
      return mybatis.selectList("com.mycompany.myapp.users.UsersDAO.getUsersList", vo);
   };

   // 단건조회
   public UsersVO getUsers(String u_id) {
      return mybatis.selectOne("com.mycompany.myapp.users.UsersDAO.getUsers", u_id);
   }

   // 입력
   public void insertUsers(UsersVO vo) {
      mybatis.insert("com.mycompany.myapp.users.UsersDAO.insertusers", vo);
   }

   // 수정
   public void updateUsers(UsersVO vo) {
      mybatis.update("com.mycompany.myapp.users.UsersDAO.updateusers", vo);
   }

   // 삭제
   public void deleteUsers(String u_id) {
      mybatis.delete("com.mycompany.myapp.users.UsersDAO.deleteusers", u_id);
   }

   //로그인
   public void Login(String Login) {
   }
   
   //로그인 체크
   public int getLoginck(HashMap<String, String> hashMap) {
      return mybatis.selectOne("com.mycompany.myapp.users.UsersDAO.getLoginck", hashMap);
   }
   
   //users List
    public String getUsersName(HashMap<String, String> hashMap) {
      return mybatis.selectOne("com.mycompany.myapp.users.UsersDAO.getUsersName", hashMap);
   }
    
    public void account(HashMap<String, String> hashMap) {
         mybatis.selectOne("com.mycompany.myapp.users.UsersDAO.insertUsers", hashMap);
      }
    
    //checkId
    
}