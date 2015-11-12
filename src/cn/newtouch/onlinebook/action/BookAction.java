package cn.newtouch.onlinebook.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.newtouch.onlinebook.po.Customer;
import cn.newtouch.onlinebook.service.BookService;

@SessionAttributes("cus")
@Controller
public class BookAction {

	@Resource
	private BookService bookService;
	
	@RequestMapping(value="/showPageInfo.jhtml")
	public String showPageInfo(ModelMap model,@ModelAttribute("cus")Customer cus){
		model.addAttribute("bookform",bookService.showPageInfo(cus));
		return "forward:WEB-INF/search.jsp";
	}
}
