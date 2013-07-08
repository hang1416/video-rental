package com.video.shop;
public class Rental {
	
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie=movie;
		this.daysRented= daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getCharge() {
		return getMovie().getCharge(getDaysRented());
	}

	public int getPoint() {
		return getMovie().getPoint(getDaysRented());
	}

}
