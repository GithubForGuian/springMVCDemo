package cn.newtouch.onlinebook.action;

import java.util.List;

import cn.newtouch.onlinebook.po.Book;
import cn.newtouch.onlinebook.po.Customer;

public class BookActionForm {

	private Customer cus;
	private int order;
	private int lOrder;
	private List<Book> books;
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public int getlOrder() {
		return lOrder;
	}
	public void setlOrder(int lOrder) {
		this.lOrder = lOrder;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
	
}
