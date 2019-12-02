package com.ustglobal.webapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.webapp.dto.RetailerBean;
import com.ustglobal.webapp.service.RetailerService;

@Controller
public class RetailerController {

	@Autowired
	private RetailerService service;

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {

		RetailerBean bean = service.login(id, password);

		if (bean == null ) {
			request.setAttribute("msg", "Invalid credentials");
			return "login";
		} else {

			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}

	@GetMapping("/register")
	public String registerPage() {
		return "register";

	}//end of registerPage

	@PostMapping("/register")
	public String register(RetailerBean bean, ModelMap map) {

		int check = service.CreateProfile(bean);

		if (check > 0) {
			map.addAttribute("msg", "You Are Registered and id is " +check);
		} else {
			map.addAttribute("msg", "Email is repeated");
		}
		return "login";
	}//end of register

	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name = "bean", required= false) RetailerBean bean) {

		if(bean==null) {
			map.addAttribute("msg", "Login First!!!!");
			return "login";
		} else {
			return "home";
		}
	}//end of home

	@PostMapping("/home")
	public String home() {

		return "home";

	}//end of home()
	
	

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";

	}//end of logout()


	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		if(session != null) {
			return "changepassword";
		} else {
			return "login";
		}

	}//end of changePassword()

	@PostMapping("/changepassword")
	public String changepassword(String password, String confirmpassword, 
			@SessionAttribute(name ="bean")RetailerBean bean, ModelMap map) {

		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getRid(), password);
			map.addAttribute("msg", "Password changed ");
		}else {
			map.addAttribute("msg", "Password Not Matching");
		}
		return "home";
	}//end of changepassword()
	
	@GetMapping("/update")
	public String updateProfile(HttpServletRequest request) {
		HttpSession session = request.getSession();

		if(session != null) {
			return "update";
		} else {
			return "home";
		}
	}//end of updateProfile()

	@PostMapping("/update")
	public String updateprofile(String name, String email, String gender, 
			@SessionAttribute(name ="bean")RetailerBean bean, ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();

		if(session!=null) {

			bean.setName(name);
			bean.setEmail(email);
			
			map.addAttribute("msg", "Profile Updated");
			return "home";
		}else {
			map.addAttribute("msg", "Something went wrong");
			return "home";
		}
		

	}//end of updateprofile()



}
