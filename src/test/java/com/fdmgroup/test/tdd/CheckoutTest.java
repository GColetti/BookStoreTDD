package com.fdmgroup.test.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fdmgroup.main.tdd.Basket;
import com.fdmgroup.main.tdd.Book;
import com.fdmgroup.main.tdd.Checkout;

class CheckoutTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		Checkout checkout = new Checkout();
		Basket basket = new Basket();
		
		double actualResult = checkout.calculatePrice(basket);
		
		assertEquals(0.0, actualResult);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		Checkout checkout = new Checkout();
		Basket basket = new Basket();
		
		Book book = new Book("Harry Potter", 12.99);
		basket.addBook(book);
		
		double actualResult = checkout.calculatePrice(basket);
		
		assertEquals(12.99, actualResult);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBooks() {
		Checkout checkout = new Checkout();
		Basket basket = new Basket();
		
		Book book1 = new Book("Harry Potter", 12.99);
		Book book2 = new Book("Percy Jackson", 9.99);
		basket.addBook(book1);
		basket.addBook(book2);
		
		double actualResult = checkout.calculatePrice(basket);
		
		assertEquals(22.98, actualResult);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBooks() {
		Checkout checkout = new Checkout();
		Basket basket = new Basket();
		
		Book book1 = new Book("Harry Potter", 25.99);
		Book book2 = new Book("Percy Jackson", 25.99);
		Book book3 = new Book("Percy Jackson", 25.99);
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3);
		
		double actualResult = checkout.calculatePrice(basket);
		
		assertEquals(77.19, actualResult);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBooks() {
		Checkout checkout = new Checkout();
		Basket basket = new Basket();
		
		Book book1 = new Book("Harry Potter", 25.99);
		Book book2 = new Book("Percy Jackson", 25.99);
		Book book3 = new Book("Percy Jackson", 25.99);
		Book book4 = new Book("Harry Potter", 25.99);
		Book book5 = new Book("Percy Jackson", 25.99);
		Book book6 = new Book("Percy Jackson", 25.99);
		Book book7 = new Book("Harry Potter", 25.99);
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3);
		basket.addBook(book4);
		basket.addBook(book5);
		basket.addBook(book6);
		basket.addBook(book7);
		
		double actualResult = checkout.calculatePrice(basket);
		
		assertEquals(178.29, actualResult);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBooks() {
		Checkout checkout = new Checkout();
		Basket basket = new Basket();
		
		Book book1 = new Book("Harry Potter", 25.99);
		Book book2 = new Book("Percy Jackson", 25.99);
		Book book3 = new Book("Percy Jackson", 25.99);
		Book book4 = new Book("Harry Potter", 25.99);
		Book book5 = new Book("Percy Jackson", 25.99);
		Book book6 = new Book("Percy Jackson", 25.99);
		Book book7 = new Book("Harry Potter", 25.99);
		Book book8 = new Book("Percy Jackson", 25.99);
		Book book9 = new Book("Percy Jackson", 25.99);
		Book book10 = new Book("Harry Potter", 25.99);
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3);
		basket.addBook(book4);
		basket.addBook(book5);
		basket.addBook(book6);
		basket.addBook(book7);
		basket.addBook(book8);
		basket.addBook(book9);
		basket.addBook(book10);
		
		
		double actualResult = checkout.calculatePrice(basket);
		
		assertEquals(226.11, actualResult);
	}



}
