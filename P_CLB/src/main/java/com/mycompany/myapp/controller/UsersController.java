/*******************************************************************************
 * 파일명 : UsersController.java
 * 작성자 : 이준형
 * 작성일자 : 2018. 06. 20
 *
 * 클래스 개요: 로그인, users info
 * =============================================================================
 * 수정내역
 * NO		수정일자		수정자		수정내역  
 * 001.	2018. 06. 30 	이준형		최초작성
 * =============================================================================
 */

package com.mycompany.myapp.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.service.UsersService;

 
//@Controller
public class UsersController {
     
	@Autowired
    UsersService usersService;
	
	private static final Logger logger = LoggerFactory.getLogger(UsersController.class);
    
	
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
    public String Login(){
    	    		
    	return "/clb/login/Login";
    }	
	
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
    public String Logout( HttpSession session){    	

		session.invalidate();
		
    	return "redirect:/";
    }	
	
  /*  @RequestMapping(value = "/Logincheck", method = RequestMethod.POST)    
    public String Logincheck(Model model, HttpServletRequest request) {
    	
    	
    	String	u_id = request.getParameter("users_id");
    	String	pw = request.getParameter("users_pw");
    	String 	ReturnUrl = ""; 
    	
    	//	users 정보가 있으면 1 없으면 0
    	int LoginCheck = usersService.UsersCheck(u_id, pw);
    	
    	if(LoginCheck==1){
    		    		    		
    		Map<String, Object> map = new HashMap<String,Object>();
   			
    		String users_name = usersService.getUsersName(u_id);
    		String company = usersService.getUsersCompany(u_id);
    		String department = usersService.getUsersDepartment(u_id);
    		String team = usersService.getUsersTeam(u_id);
    		String position = usersService.getUsersPosition(u_id);
    		
    		request.getSession().setAttribute("u_id", u_id); 
    		request.getSession().setAttribute("name", name); 
    		request.getSession().setAttribute("company", company); 
    		request.getSession().setAttribute("department", department); 
    		request.getSession().setAttribute("team", team); 
    		request.getSession().setAttribute("position", position); 
   		    		
    		ReturnUrl = "redirect:/Main";
    	}	
		else{			
			model.addAttribute("message", "ID와 PW를 확인해주세요");	    	
			ReturnUrl = "/global/login/Login";
		}
    	
        return ReturnUrl;
    }	*/
    
   /* @RequestMapping(value = "/UsersList", method = RequestMethod.GET)    
    public String getUsersList(@RequestParam(required=false, defaultValue="1") int page, 
    		@RequestParam(required=false) String search, 
    		@RequestParam(required=false) String word, 
    		@RequestParam(required=false) String searchFlag,
    		Model model){
    	
    	int totalUsersCnt = 0;
		Page pageVo = null;	
						
		totalUsersCnt = usersService.getTotalUsersCnt(search, word);		
		pageVo = new Page(page,totalUsersCnt);
    	
		model.addAttribute("page",pageVo);
		model.addAttribute("users", usersService.getAllUsers(pageVo.getCurPage(), search, word));		
		model.addAttribute("searchFlag", searchFlag);
		model.addAttribute("search",search);
		model.addAttribute("word", word);

		return "/users/UsersList";
    }
    */
 /*   
    @RequestMapping(value = "/UsersView/{users_id}")
	public String showArticle(@PathVariable(value="users_id") String users_id, Model model){
    	   	
    	model.addAttribute("users", usersService.getUsersInfo(users_id));
		
		return "/users/UsersView";
	}   */
}
