public class Movie {
	
	public static final int ChilDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_REALEASE=1;
	
	private String title;
	private int priceCode;
	
	public Movie(String title, int priceCode) {
		this.title=title;
		this.priceCode=priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}

	
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCharge(int dayRented) {
		int result = 0;
		switch(getPriceCode()){
			case Movie.REGULAR:
				result+=2000;
				if(dayRented>2)
					result+= (dayRented-2)*1500;
				break;
			case Movie.NEW_REALEASE:
				result+=dayRented*3000;
				break;
			case Movie.ChilDREN:
				result+=1500;
				if(dayRented>3)
					result+= (dayRented-3)*1500;
				break;
	
		}
		return result;
	}
}
