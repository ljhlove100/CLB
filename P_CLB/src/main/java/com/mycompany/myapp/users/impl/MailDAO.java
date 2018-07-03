package com.mycompany.myapp.users.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MailDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
}
