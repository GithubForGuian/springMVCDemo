package cn.newtouch.onlinebook.po;

import java.util.Date;

public class Book {

	private String bookSN;
	private String bookName;
	private String bookAuthor;
	private String pubName;
	private double bookPrice;
	private Date createDate;

	public String getBookSN() {
		return bookSN;
	}

	public void setBookSN(String bookSN) {
		this.bookSN = bookSN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
