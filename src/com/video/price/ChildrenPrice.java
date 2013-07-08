package com.video.price;

import com.video.shop.Movie;

public class ChildrenPrice extends Price {

	@Override
	public int getPrice() {
		return Movie.CHILDREN;
	}
	
	public int getCharge(int daysRented){
		int result = 1500;
		if(daysRented>3)
			result += (daysRented-3)*1500;
		return result;
	}

	@Override
	public int getPoint(int daysRented) {
		return 1;
	}

}
