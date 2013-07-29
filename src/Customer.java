import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String name) {
		this.name = name;

	}
	
	public String getName() {
		return name;
	}

	public String statement() {
		
		String result = "대여고객 :"+getName()+"은 ";
		for(Rental rental :getRentals()){
			
			result += rental.getMovie().getTitle()+" "+String.valueOf(rental.getCharge())+"원 ";
				
		}
		result += "대여료는  " + String.valueOf(getTotalCharge()) + "원이고,";
		result += "포인트는 " + String.valueOf(getTotalPoint()) + "점 입니다.";
		return result;
	}

	private int getTotalPoint() {
		int result = 0;
		for(Rental rental :getRentals()){
			result += rental.getPoint();
		}
		return result;
	}

	private int getTotalCharge() {
		int result = 0;
		for(Rental rental :getRentals()){
			result += rental.getCharge();
		}
		return result;
	}

	public void addRental(Rental rental) {
		this.rentals.add(rental);
		
	}

}
