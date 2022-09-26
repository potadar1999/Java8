package com.Que4;

public class Books {
	
	private int isbn;
	private String bookName;
	private String author;
	
	
	
	public Books() {
		super();
	}
	
	public Books(int isbn, String bookName, String author) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
	}



	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + "]";
	}

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

	
	
}
