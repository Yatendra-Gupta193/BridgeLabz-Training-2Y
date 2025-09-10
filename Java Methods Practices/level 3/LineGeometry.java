public class LineGeometry {
    
    public static void main(String[] args) {
        int x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        
        double distance = calculateDistance(x1, y1, x2, y2);
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        
        System.out.println("Distance: " + distance);
        System.out.println("Equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
    
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}
