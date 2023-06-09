package weatherdatatransformation;

public class TemperatureConverter {

    public static String celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit + " " + "F";
    }

    public static String fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius + " " + "C";
    }

}

