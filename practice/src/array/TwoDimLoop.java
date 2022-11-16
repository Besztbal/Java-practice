package array;

public class TwoDimLoop {
    public static void main(String[] args) {
        int[][] A;
        A = new int[5][7];
        int sumOfRow = 0;
        int row, col;  // loop-control-variables for accessing rows and columns in A
        int count = 1;
        for (row = 0; row < 5; row++) {
            for (col = 0; col < 7; col++) {
                System.out.printf("%7d", A[row][col] = count);
                count++;
            }
            System.out.println();
        }
        for (row = 0; row < 5; row++) {
            for (col = 0; col < 7; col++) {
                System.out.printf("%7d", sumOfRow += A[row][col]);

            }
            System.out.println();
        }
    }
}
