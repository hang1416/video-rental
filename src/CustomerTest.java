import static org.junit.Assert.*;

import org.junit.Test;


public class CustomerTest {

	@Test
	public void testStatement() {
		Customer customer = new Customer("최혜영");
		Movie movie = new Movie("신세계",0);
		Movie movie1 = new Movie("아이언맨",1);
		Rental rental = new Rental(movie, 3);
		Rental rental1 = new Rental(movie1, 3);
		
		customer.addRental(rental);
		customer.addRental(rental1);
		String result = customer.statment();
		System.out.println(result);
	}

}
