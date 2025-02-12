import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void add() {
        Cal cal = new Cal();
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void subtract() {
        Cal cal = new Cal();
        assertEquals(2, cal.subtract(5, 3));
    }

    @Test
    void multiply() {
        Cal cal = new Cal();
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    void divide() {
        Cal cal = new Cal();
        assertEquals(2, cal.divide(6, 3));
    }
}