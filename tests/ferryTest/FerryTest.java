package ferryTest;

import ferry.Ferry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FerryTest {
    @Test
    public void FerryTestMethod() {
        Ferry ferry = new Ferry(5, 7);
        assertEquals(7, ferry.getPeople());
        assertEquals(5, ferry.getCars());
    }
    @Test
    public void boardMethod() {
        Ferry ferry = new Ferry(5, 10);
        Ferry ferry1 = new Ferry(1, 2);
        Ferry ferry2 = new Ferry(1, 2);
        Ferry ferry3 = new Ferry(1, 2);
        Ferry ferry4 = new Ferry(1, 2);
        Ferry ferry5 = new Ferry(1, 2);
        //Ferry ferry6 = new Ferry(1, 2);
        assertEquals("accept", ferry.board());

        
    }
}
