import java.util.Enumeration;
import java.util.Vector;


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
public class Customer {

	private String name;
	private Vector rentals = new Vector();

	/**
	 * 
	 */
	public Customer(String name) {
		this.name = name;

	}

	public void addRental(Rental rental) {
		rentals.addElement(rental);

	}

	public String getName() {
		return name;
	}

	public String statment() {
		int frequentRenterPoints = 0;

		String results = "REntal Record for " + getName() + "\n";
		Enumeration rt = rentals.elements();
		while (rt.hasMoreElements()) {
			Rental each = (Rental) rt.nextElement();
			results += "\t" + each.getMovie().getTitle()+"\t" + String.valueOf(each.getCharge()) + "\n";

		}
		
		results += "Amount owed is  " + String.valueOf(getTotalCharge()) + "\n";
		results += "You earned " + String.valueOf(getFrequentRenterPoints()) + "frequent renter points";
		return results;

	}

	private double getFrequentRenterPoints() {
		double result = 0;
		Enumeration rt = rentals.elements();
		while (rt.hasMoreElements()) {
			Rental each = (Rental) rt.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration rt = rentals.elements();
		while (rt.hasMoreElements()) {
			Rental each = (Rental) rt.nextElement();
			result += each.getCharge();
		}
		return result;
	}

}
