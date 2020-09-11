package B2_ArrayAndMethodInJava.Practices.ConvertTheTemperature;

public class ConvertTheTemperature {
    //Xay dung phuong thuc chuyen C - F
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    //Xay dung phuong thuc chuyen F - C
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
