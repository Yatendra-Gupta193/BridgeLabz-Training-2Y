public class MatrixAdvancedOperations {
    
    public static void main(String[] args) {
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        int[][] matrix3x3 = createRandomMatrix(3, 3);
        
        System.out.println("2x2 Matrix:");
        printMatrix(matrix2x2);
        System.out.println("Transpose:");
        printMatrix(transpose(matrix2x2));
        System.out.println("Determinant: " + determinant2x2(matrix2x2));
        System.out.println("Inverse:");
        printMatrix(inverse2x2(matrix2x2));
        
        System.out.println("\n3x3 Matrix:");
        printMatrix(matrix3x3);
        System.out.println("Transpose:");
        printMatrix(transpose(matrix3x3));
        System.out.println("Determinant: " + determinant3x3(matrix3x3));
    }
    
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }
    
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double)det;
        inverse[0][1] = -matrix[0][1] / (double)det;
        inverse[1][0] = -matrix[1][0] / (double)det;
        inverse[1][1] = matrix[0][0] / (double)det;
        return inverse;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }
}
