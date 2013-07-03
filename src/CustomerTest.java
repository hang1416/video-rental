import static org.junit.Assert.*;

import org.junit.Test;


public class CustomerTest {

	@Test
	public void testStatement() {
		Customer customer1 = new Customer("최혜영");
		Customer customer2 = new Customer("박순현");
		Movie movie1 = new Movie("신세계",0);
		Movie movie2 = new Movie("월드워Z",1);
		Movie movie3 = new Movie("뽀로로",2);
		
		Rental rental1 = new Rental(movie1, 3);
		Rental rental2 = new Rental(movie2, 3);
		Rental rental3 = new Rental(movie3, 4);
		
		customer1.addRental(rental1);
		customer1.addRental(rental2);
		customer2.addRental(rental3);
		
		System.out.println(customer1.statment());
		System.out.println(customer2.statment());
		
	}

}
