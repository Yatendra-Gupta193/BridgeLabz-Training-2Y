public class UnitConverter {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    public static void main(String[] args) {
        System.out.println("10 Km = " + convertKmToMiles(10) + " Miles");
        System.out.println("5 Miles = " + convertMilesToKm(5) + " Km");
        System.out.println("12 Meters = " + convertMetersToFeet(12) + " Feet");
        System.out.println("20 Feet = " + convertFeetToMeters(20) + " Meters");
    }
}
