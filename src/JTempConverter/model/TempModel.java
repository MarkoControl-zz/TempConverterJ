
package JTempConverter.model;

public class TempModel {

    private double temperature;

    public void celsiusToFahrenheit(double celsius) {
        temperature = (celsius * 9.0 / 5.0) +32.0;
    }

    public void fahrenheitToCelsius(double fahrenheit) {
        temperature = (fahrenheit - 32.0) * 5.0 /9.0;
    }

    public void celsiusToKelvin(double celsius) {
        temperature = celsius + 273.15;
    }

    public void kelvinToCelsius(double kelvin) {
        temperature = kelvin - 273.15;
    }

    public void fahrenheitToKelvin(double fahrenheit) {
        temperature = (fahrenheit - 32.0) * 5.0/9.0 + 273.15;
    }

    public void kelvinToFahrenheit(double kelvin) {
        temperature = (kelvin - 273.15) * 9.0 / 5.0 + 32;
    }

    public double getTemperature(){return this.temperature;}
}
