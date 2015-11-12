package cn.newtouch.onlinebook.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.newtouch.onlinebook.action.LoginActionForm;
import cn.newtouch.onlinebook.po.Customer;

@Repository("customerDao")
@Scope("prototype")
@Transactional
public class CustomerDAO {

	@Resource
	private SessionFactory sessionFactory;
	
	public boolean isExisted(LoginActionForm vo){
		String sql = "select 1 from customer c where c.cusid = :cusid and c.cuspassword=:cuspassword";
		List list = sessionFactory.getCurrentSession().createSQLQuery(sql)
	                .setParameter("cusid", vo.getCusId())
	                .setParameter("cuspassword", vo.getCusPassword())
	                .list();
		return list.size()>0?true:false;
	}
	
	public Customer findById(LoginActionForm vo){
		Customer cus = (Customer)sessionFactory.getCurrentSession().get(Customer.class, vo.getCusId());
		return cus;
	}
}
