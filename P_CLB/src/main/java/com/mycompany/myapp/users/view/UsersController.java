package com.mycompany.myapp.users.view;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mycompany.myapp.users.UsersSearchVO;
import com.mycompany.myapp.users.UsersService;
import com.mycompany.myapp.users.UsersVO;

 
@Controller
@SessionAttributes("users")
public class UsersController {

	
	
	@Autowired
	UsersService UsersService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
    	    		
    	return "clb/index";
    }
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
    	    		
    	return "users/login";
    }
	
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
    public String account(){
    	    		
    	return "users/account";
    }	
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
    public String Login(){
    	    		
    	return "users/login";
    }	
	
	@RequestMapping("/getUsersList")
	public String getUsersList(UsersSearchVO vo, HttpServletRequest request) {
		//request.setAttribute("usersList", UsersService.getUserList());
		return "users/getUsersList";
	}

	// 등록폼
	@RequestMapping(value = "/usersInsert", method = RequestMethod.GET)
	public String usersInsertForm() {
		return "users/getUsersInsert";
	}

	// 수정폼
	@RequestMapping(value = "/UsersUpdate", method = RequestMethod.GET)
	public String usersUpdateForm(Model model, UsersVO vo) {
		model.addAttribute("users",UsersService.getUsers(vo.getuId()));
		return "users/getUsersupdate";
	}

	// 수정처리
	@RequestMapping(value = "/UsersUpdate", method = RequestMethod.POST)
	public String updateUsers(@ModelAttribute("users") UsersVO vo) {
		System.out.println(vo);
		UsersService.updateUsers(vo);
		return "redirect:/getUsersList";
	}

	// 등록처리
	@RequestMapping(value = "/usersInsert", method = RequestMethod.POST)
	public String insertBoard(@ModelAttribute("users") UsersVO vo) {
		System.out.println(vo);
		// 서비스이용하여 등록처리하고 목록페이지로 이동
		UsersService.insertUsers(vo);
		return "users/UsersInsert";
	}

	@RequestMapping("/getUsers/{u_id}")
	public String getUsers(@PathVariable String u_id, Model model) {
		model.addAttribute("users", UsersService.getUsers(u_id));
		return "users/getUsers";
	}
	
	//로그인

}
