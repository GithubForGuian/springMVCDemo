package cn.newtouch.onlinebook.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.newtouch.onlinebook.action.BookActionForm;
import cn.newtouch.onlinebook.dao.BookDAO;
import cn.newtouch.onlinebook.dao.OrdersDAO;
import cn.newtouch.onlinebook.po.Customer;

@Service("bookService")
@Scope("prototype")
@Transactional
public class BookService {
	@Resource
	private BookDAO bookDao;
	@Resource
	private OrdersDAO ordersDao;
	
	public BookActionForm showPageInfo(Customer cus){
		BookActionForm vo = new BookActionForm();
		vo.setOrder(ordersDao.getAllOrders(cus));
		vo.setlOrder(ordersDao.getExistedOrders(cus));
		vo.setBooks(bookDao.findAll());
		return vo;
	}
	
}
