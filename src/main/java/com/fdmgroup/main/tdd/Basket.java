package com.fdmgroup.main.tdd;

import java.util.ArrayList;
import java.util.Iterator;

public class Basket implements Iterable {

	ArrayList<Book> bookBasket;

	/**
	 * 
	 */
	public Basket() {
		bookBasket = new ArrayList<Book>();
	}

	public ArrayList<Book> getBooksInBasket() {
		return bookBasket;
	}

	public void addBook(Book book) {
		bookBasket.add(book);
	}

	public Iterator<Book> iterator() {
		return null;
	}

}
