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
		assertEquals(customer1.statment(),"대여고객 :최혜영은 신세계 3500원월드워Z 9000원대여료는  12500원이고,포인트는 3점 입니다.");
		assertEquals(customer2.statment(),"대여고객 :박순현은 뽀로로 3000원대여료는  3000원이고,포인트는 1점 입니다.");
		
	}

}
