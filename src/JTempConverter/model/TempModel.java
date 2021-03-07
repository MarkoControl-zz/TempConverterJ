package JTempConverter.model;

public class TempModel {

        private double temperature;

        public void celsiusToFahrenheit(double celsius) {
            temperature = (celsius * 9.0 / 5.0) +32.0;
        }

        public void fahrenheitToCelsius(double fahrenheit) {
            temperature = (fahrenheit - 32.0) * 5.0 /9.0;
        }

        public double getTemperature(){return this.temperature;}
}
