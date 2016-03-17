/**
 * Created by user on 17.03.16.
 */
public class Matrix {
    public static void print (int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == size - 1 - i)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
