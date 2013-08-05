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
		int result = 0;
		switch(getMovie().getPriceCode()){
			case Movie.REGULAR:
				result += 2000;
				if(getDaysRented()>2)
					result += (getDaysRented()-2)*1500;
				break;
			case Movie.NEW_REALEASE:
				result += getDaysRented()*3000;
				break;
			case Movie.CHILDREN:
				result += 1500;
				if(getDaysRented()>3)
					result += (getDaysRented()-3)*1500;
				break;
	
		}
		return result;
	}

	public int getPoint() {
		if(getMovie().getPriceCode() == Movie.NEW_REALEASE && getDaysRented()>1)
			return 2;
		else
			return 1;
	}

}
