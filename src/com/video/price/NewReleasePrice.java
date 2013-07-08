package com.video.price;

import com.video.shop.Movie;

public class NewReleasePrice extends Price {

	@Override
	public int getPrice() {
		return Movie.NEW_REALEASE;
	}
	public int getCharge(int daysRented){
	
		int result = daysRented*3000;
		return result;
	}
	@Override
	public int getPoint(int daysRented) {
		if(daysRented>1)
			return 2;
		else
			return 1;
	}

}
