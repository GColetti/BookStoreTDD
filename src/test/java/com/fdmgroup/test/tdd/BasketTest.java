package com.fdmgroup.test.tdd;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.fdmgroup.main.tdd.Basket;
import com.fdmgroup.main.tdd.Book;

class BasketTest {

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		//Test code
		Basket basket = new Basket();
		
		ArrayList<Book> result = basket.getBooksInBasket();
		assertEquals(0, result.size());
	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		//Test code
		Basket basket = new Basket();
		Book book = new Book("Harry Potter", 12.99);
		
		basket.addBook(book);
		ArrayList<Book> result = basket.getBooksInBasket();
		
		assertEquals(1, result.size());
		
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBooks() {
		//Test code
		Basket basket = new Basket();
		Book book1 = new Book("Harry Potter", 12.99);
		Book book2 = new Book("Percy Jackson", 9.99);
		
		basket.addBook(book1);
		basket.addBook(book2);
		ArrayList<Book> result = basket.getBooksInBasket();
		
		assertEquals(2, result.size());
		
	}


}
