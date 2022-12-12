import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bridgelabz.Hotel;
import com.bridgelabz.HotelReservationService;

class HotelReservationTest {

	@Test
	void givenHotel_ShouldBe_AddedToHotelList() {
		boolean result = HotelReservationService.addHotel(new Hotel("Lakewood", 110));
		Assertions.assertTrue(result);
	}
}
