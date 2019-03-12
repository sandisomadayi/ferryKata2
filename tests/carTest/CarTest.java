package carTest;

import ferry.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void carTestMethod() {
        Car car = new Car("red", 14);
        assertEquals("red", car.getColor2());
        assertEquals(14, car.getPassengers());
    }
}
