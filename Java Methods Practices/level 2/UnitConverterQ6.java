public class UnitConverterQ6 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kg) {
        double kilograms2pounds = 2.20462;
        return kg * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        System.out.println("98 F = " + convertFahrenheitToCelsius(98) + " C");
        System.out.println("37 C = " + convertCelsiusToFahrenheit(37) + " F");
        System.out.println("150 Pounds = " + convertPoundsToKilograms(150) + " Kg");
        System.out.println("70 Kg = " + convertKilogramsToPounds(70) + " Pounds");
        System.out.println("5 Gallons = " + convertGallonsToLiters(5) + " Liters");
        System.out.println("20 Liters = " + convertLitersToGallons(20) + " Gallons");
    }
}
