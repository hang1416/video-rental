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

	public String statment() {
		int totalAmount = 0;
		int points = 0;
		
		String result = "대여고객 :"+getName()+"\n";
		for(Rental rental :getRentals()){
			int thisAmount=0;
			
			switch(rental.getMovie().getPriceCode()){
				case Movie.REGULAR:
					thisAmount+=2000;
					if(rental.getDaysRented()>2)
						thisAmount+= (rental.getDaysRented()-2)*1500;
					break;
				case Movie.NEW_REALEASE:
					thisAmount+=rental.getDaysRented()*3000;
					break;
				case Movie.ChilDREN:
					thisAmount+=1500;
					if(rental.getDaysRented()>3)
						thisAmount+= (rental.getDaysRented()-3)*1500;
					break;
					
			}
			points++;
			if(rental.getMovie().getPriceCode()==Movie.NEW_REALEASE && rental.getDaysRented()>1)
				points++;
			result += "\t"+rental.getMovie().getTitle()+"\t"+String.valueOf(thisAmount)+"원\n";
			totalAmount +=thisAmount;
				
		}
		result += "대여료는  " + String.valueOf(totalAmount) + "원이고,";
		result += "포인트는 " + String.valueOf(points) + "점 입니다.";
		result += "\n=================================================";
		return result;
	}


	public void addRental(Rental rental) {
		this.rentals.add(rental);
		
	}

}
