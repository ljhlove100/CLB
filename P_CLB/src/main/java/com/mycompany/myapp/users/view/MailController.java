package com.mycompany.myapp.users.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.users.MailService;
import com.mycompany.myapp.users.MailVO;

@Controller
public class MailController {

	
	@RequestMapping("mailSend")
	public String mailSend(MailVO vo, HttpServletResponse response) throws IOException { 
		
		
		vo.setFrom("5555");
		vo.setTo("555");
		vo.setUsername("");
		vo.setPassword("");
		vo.setSubject("");
		vo.setText("");
		
		MailService.mailsend(vo);
		
		PrintWriter out = response.getWriter();
		out.print("<script>alert('send success');</script>");
		
		return null;
		
	}
}
