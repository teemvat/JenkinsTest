public class TemperatureConverter {
    public double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * ((double) 5 / 9);
    }

    public double celciusToFahrenheit(double celcius) {
        return celcius * (9.0/5) + 32;
    }

    public boolean isExtremeTemperature(double celcius) {
        return celcius < -40 || celcius > 50;
    }
}
