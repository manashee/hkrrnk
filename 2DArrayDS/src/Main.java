import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int [] [] arr = new int [] [] {
                {1, 1, 1, 0, 0, 0},
                { 0, 1, 0, 0, 0, 0 },
                {1, 1, 1, 0, 0, 0},
                {0 ,0 ,2 ,4 ,4 ,0},
                {0 ,0 ,0 ,2 ,0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int [] [] arr2 = new int [] [] {
                {-9, -9, -9,  1, 1, 1},
                { 0, -9,  0,  4, 3, 2 },
                {-9, -9, -9,  1, 2, 3},
                { 0,  0,  8,  6, 6 ,0},
                {0,  0,  0, -2, 0 ,0},
                {0,  0,  1,  2, 4 ,0}
        };
        System.out.println(hourglassSum(arr));

    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        List<Integer> listOfSums = new ArrayList<Integer>();
        int sum = 0 ;

        for (int row = 0 ; row < 4 ; row ++ ) {
            for (int col = 0 ; col < 4 ; col ++ ) {
                sum = sumOfI(arr,row,col);
                listOfSums.add ( sum );
            }
        }

        return Collections.max(listOfSums).intValue();
    }

    // double dimensional arrays are reffered to as (row,col) not as (x,y)
    
    static int sumOfI(int[][] arr, int row, int col) {
//        System.out.println ( "row = " + row + " col = " + col );
        int sum = sum3x3Sq ( arr, row,col );
//        System.out.println ( "row = " + row + " col = " + col );
        int sum2 = (arr[row+1][col] + arr[row+1][col+2]);

//        System.out.println ( "sum = " + sum );
//        System.out.println ( "sum2 = " + sum2 );

        return sum - sum2 ;
    }

    static int sum3x3Sq(int[][] arr, int row, int col) {

        int sum = 0;

        for (int i = row ; i <= row+2 ; i ++ ) {
            for (int j = col ; j <= col+2 ; j ++ ) {
                sum += arr[i][j];
            }
        }

        return sum;
    }


}
