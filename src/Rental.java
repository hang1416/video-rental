/*
 * Created on 2003. 8. 19.
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author Administrator
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
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
	
	public double getCharge() {
		double result = 0;
		switch(getMovie().getPriceCode()){
			case Movie.REGULAR:
				result +=2;
				if(getDaysRented()>2) 
					result += (getDaysRented()-2)*1.5;
			break;
			case Movie.NEW_REALEASE:
				result += getDaysRented()*3;
			break;
			case Movie.ChilDREN:
				result += 1.5;
				if(getDaysRented()>3) 
					result += (getDaysRented()-3)*1.5;
			break;
		}
		return result;
	}
	
	public int getFrequentRenterPoints() {
		if((getMovie().getPriceCode() == Movie.NEW_REALEASE) && getDaysRented()>1) 
			return 2;
		else
			return 1;
	}

}
