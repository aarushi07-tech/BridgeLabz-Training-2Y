import java.util.Random;

public class MatrixManipulator {
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // values from 0 to 9
            }
        }
        return matrix;
    }
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    public static void displayMatrix(String label, double[][] matrix) {
        System.out.println(label);
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
  
        double[][] matrix2x2 = generateMatrix(2, 2);
        displayMatrix("2x2 Matrix:", matrix2x2);
        displayMatrix("Transpose:", transposeMatrix(matrix2x2));
        System.out.printf("Determinant: %.2f%n", determinant2x2(matrix2x2));
        double[][] inverse2 = inverse2x2(matrix2x2);
        if (inverse2 != null) {
            displayMatrix("Inverse:", inverse2);
        } else {
            System.out.println("Inverse: Not possible (Determinant is zero)\n");
        }

        double[][] matrix3x3 = generateMatrix(3, 3);
        displayMatrix("3x3 Matrix:", matrix3x3);
        displayMatrix("Transpose:", transposeMatrix(matrix3x3));
        System.out.printf("Determinant: %.2f%n", determinant3x3(matrix3x3));
        double[][] inverse3 = inverse3x3(matrix3x3);
        if (inverse3 != null) {
            displayMatrix("Inverse:", inverse3);
        } else {
            System.out.println("Inverse: Not possible (Determinant is zero)");
        }
    }
}