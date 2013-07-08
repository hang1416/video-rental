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

	public int getPoint() {
		if(getMovie().getPriceCode()==Movie.NEW_REALEASE && getDaysRented()>1)
			return 2;
		else
			return 1;
	}

	public int getCharge() {
		return getMovie().getCharge(getDaysRented());
	}

}
