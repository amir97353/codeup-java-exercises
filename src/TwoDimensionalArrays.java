import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] integers = new int [3][4];
        //The first number 3 means there will be 3 rows
        //the second number 4 means that there are four elements in each row
        // Means that thee will be 3 rows and four columns

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix[0][2]);
        //this would return 5
        System.out.println(Arrays.toString(matrix[0]));
        //This would return the whole first row

        System.out.println(matrix[2][2]);
    }
}
