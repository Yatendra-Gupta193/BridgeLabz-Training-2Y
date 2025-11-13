class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String msg){
        super(msg);
    }
}
public class TempConverter {
    public static void main(String[] args) {
        double temp = -300;   
        char unit = 'C';      

        try {
            convert(temp, unit);
        } catch(InvalidTemperatureException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    static void convert(double t, char u) throws InvalidTemperatureException {

        if(u=='C' && t < -273.15)
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");

        if(u=='F' && t < -459.67)
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");

        if(u=='C'){
            System.out.println("Fahrenheit: " + (t*9/5 + 32));
        } else {
            System.out.println("Celsius: " + ((t-32)*5/9));
        }
    }
}
