package com.video.price;

import com.video.shop.Movie;

public class RegularPrice extends Price {

	@Override
	public int getPrice() {
		return Movie.REGULAR;
	}
	
	public int getCharge(int daysRented){
		int result = 2000;
		if(daysRented>2)
			result+= (daysRented-2)*1500;
		
		return result;
	}

	@Override
	public int getPoint(int daysRented) {
		return 1;
	}

}
