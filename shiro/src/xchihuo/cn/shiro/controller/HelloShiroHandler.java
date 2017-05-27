package xchihuo.cn.shiro.controller;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xchihuo.cn.shiro.service.SessionService;

import javax.servlet.http.HttpSession;

/**
 * Created by chenrongfa on 2017/5/26.
 * QQ:952786280
 * email:18720979339@163.com
 * company:逸臣有限公司
 * function:
 */
@Controller
@RequestMapping("/shiro")
public class HelloShiroHandler {
	@Autowired
	private SessionService sessionService;
	@RequestMapping("/hello")
	public String test() {

		return "test";
	}

	@RequestMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

		System.out.println("username = [" + username + "], password = [" + password + "]");
		Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token=new UsernamePasswordToken(username,password);
			token.setRememberMe(true);
		try {
			subject.login(token);
		}catch(Exception e){
			System.out.println("e.toString() = " + e.toString());
		}

		return "redirect:/success.jsp";
	}
	@RequestMapping("/admin")
	public String admin(){
		System.out.println("admin");
		return "admin";
	}
	@RequestMapping("/user")
	public String user(){
		System.out.println("test");
		return "admin";
	}
	@RequestMapping("/test")
	public String test1(HttpSession session){
		session.setAttribute("key","你好歹额陈荣发");
		System.out.println("test");
		sessionService.test();
		return "test";
	}

}
