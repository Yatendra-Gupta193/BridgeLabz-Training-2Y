public class SensorLogger {
    public static void logTemperature(double temp) {
        System.out.println("Primitive double: " + temp);
    }
    public static void logTemperature(Double tempObj) {
        System.out.println("Wrapper Double: " + tempObj);
    }
    public static void main(String[] args) {

        double primitiveTemp = 28.6;
        Double wrapperTemp = 30.2;

        logTemperature(primitiveTemp);  
        logTemperature(wrapperTemp);    

        Double autoBox = primitiveTemp;
        System.out.println("Auto-boxed: " + autoBox);

        double autoUnbox = wrapperTemp;
        System.out.println("Auto-unboxed: " + autoUnbox);
    }
}
