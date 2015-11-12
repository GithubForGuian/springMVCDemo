package cn.newtouch.onlinebook.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.newtouch.onlinebook.po.Book;

@Repository("bookDao")
@Scope("prototype")
@Transactional
public class BookDAO {

	@Resource
	private SessionFactory sessionFactory;

	public List<Book> findAll() {
		List<Book> books = new ArrayList<Book>();
		String hql = "from Book";
		books = (List<Book>) sessionFactory.getCurrentSession()
				.createQuery(hql).list();
		return books;
	}
}
