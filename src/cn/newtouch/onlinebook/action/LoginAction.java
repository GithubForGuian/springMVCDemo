package cn.newtouch.onlinebook.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import cn.newtouch.onlinebook.dao.CustomerDAO;

@SessionAttributes("cus")
@Controller("loginAction")
@Scope("prototype")
public class LoginAction {

	@Resource
	private CustomerDAO customerDAO;
	
	@RequestMapping(value="/toLogin.jhtml")
	public String toLogin(){
		return "forward:WEB-INF/login.jsp";
	}
	
	@RequestMapping(value="/login.jhtml")
	public String login(LoginActionForm vo,ModelMap model){
		
		if(customerDAO.isExisted(vo)){
			model.addAttribute("cus",customerDAO.findById(vo));
			return "forward:/showPageInfo.jhtml";
		}else{
			model.addAttribute("msg", "The Customer Info Not Found！");
			return "forward:WEB-INF/login.jsp";
		}
	}
}
