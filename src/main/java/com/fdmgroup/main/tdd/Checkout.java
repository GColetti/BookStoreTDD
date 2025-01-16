package com.fdmgroup.main.tdd;

public class Checkout {


	private double totalPrice;

	/**
	 * @param totalPrice
	 */
	public Checkout() {
	}

	public double calculatePrice(Basket basket) {
		for (Book book: basket.getBooksInBasket()) {
			totalPrice += book.getPrice();
		}
		
		if (basket.getBooksInBasket().size() == 3) {
			totalPrice *= 0.99;
		} else if (basket.getBooksInBasket().size() == 7) {
			totalPrice *= 0.98;
		} else if (basket.getBooksInBasket().size() == 10) {
			totalPrice *= 0.87;
		}
		
		return (double) Math.round(totalPrice * 100) / 100; 
	}

}