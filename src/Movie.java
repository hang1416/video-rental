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
}
