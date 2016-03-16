/**
 * Created by Анастасия on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        task5(9);
    }

    public static void task5 (int size){
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
