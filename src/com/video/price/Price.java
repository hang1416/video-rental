package com.video.price;


public abstract class Price {
	public abstract int getPrice();
	
	public abstract int getCharge(int daysRented);

	public abstract int getPoint(int daysRented);
}
