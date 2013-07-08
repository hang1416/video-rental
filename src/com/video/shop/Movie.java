package com.video.shop;

import com.video.price.ChildrenPrice;
import com.video.price.NewReleasePrice;
import com.video.price.Price;
import com.video.price.RegularPrice;

public class Movie {
	
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_REALEASE =1;
	
	private String title;
	private Price price;
	
	public Movie(String title, int priceCode) {
		this.title = title; 
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPrice();
	}

	
	public void setPriceCode(int arg) {
		switch(arg){
			case REGULAR:
				price = new RegularPrice();
				break;
			case CHILDREN:
				price = new ChildrenPrice();
				break;
			case NEW_REALEASE:
				price = new NewReleasePrice();
				break;
		}
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public int getPoint(int dayRendted) {
		price.getPoint();
	}

	public int getCharge(int dayRented) {
		return price.getCharge(dayRented);
	}
}
