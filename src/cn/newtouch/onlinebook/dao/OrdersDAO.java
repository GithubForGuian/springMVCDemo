package cn.newtouch.onlinebook.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.newtouch.onlinebook.po.Customer;

@Repository("ordersDAO")
@Scope("prototype")
@Transactional
public class OrdersDAO {

	@Resource
	private SessionFactory sessionFactory;

	public int getExistedOrders(Customer cus) {
		String sql = "select count(1) from orders o where o.cusid=:cusid and o.ordstatus=0";
		List list = sessionFactory.getCurrentSession().createSQLQuery(sql)
				.setParameter("cusid", cus.getCusId()).list();
		return Integer.parseInt(list.get(0).toString());
	}

	public int getAllOrders(Customer cus) {
		String sql = "select count(1) from orders o where o.cusid=:cusid ";
		List list = sessionFactory.getCurrentSession().createSQLQuery(sql)
				.setParameter("cusid", cus.getCusId()).list();
		return Integer.parseInt(list.get(0).toString());
	}

}
