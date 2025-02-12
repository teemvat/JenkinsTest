import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testFahrenheitToCelcius() {
        assertEquals(0, converter.fahrenheitToCelcius(32), 0.001);
        assertEquals(100, converter.fahrenheitToCelcius(212), 0.001);
    }

    @Test
    void testCelciusToFahrenheit() {
        assertEquals(32, converter.celciusToFahrenheit(0), 0.001);
        assertEquals(212, converter.celciusToFahrenheit(100), 0.001);
    }

    @Test
    void testIsExtremeTemperature() {
        assertFalse(converter.isExtremeTemperature(-40));
        assertFalse(converter.isExtremeTemperature(50));
        assertTrue(converter.isExtremeTemperature(-100));
        assertTrue(converter.isExtremeTemperature(100));
    }
}