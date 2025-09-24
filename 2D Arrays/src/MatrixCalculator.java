import java.util.Scanner;

public class MatrixCalculator {

    public int findMax(int[][] arr) {

        int max = arr[0][0];

        for(int i = 0 ; i < arr.length ; i++) {

            for(int j = 0 ; j < arr[i].length ; j++) {

                if(arr[i][j] > max) {

                    max = arr[i][j];

                }

            }

        }
        return max;
    }

    public int findMax(int[][] arr) {

        int min = arr[0][0];

        for(int i = 0 ; i < arr.length ; i++) {

            for(int j = 0 ; j < arr[i].length ; j++) {

                if (arr[i][j] < min ) {

                    min = arr[i][j];

                }
            }
        }
        return min;
    }

    public int findSumOfArray(int[][] arr) {

        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++) {

            for(int j = 0 ; j < arr[i].length ; j++) {

                sum += arr[i][j];

            }
        }
        return sum;
    }

    public void rowSum(int[][] arr) {

        int tempSum = 0;

        for(int i = 0 ; i < arr.length ; i++) {

            for(int j = 0 ; j < arr[i].length ; j++) {

                tempSum += arr[i][j];

                System.out.println("Sum of Row" + tempSum);

                tempSum = 0;

            }
        }
    }

    public void colSum(int[][] arr) {

        int tempSum = 0;

        for(int i = 0 ; i < arr[i].length ; i++) {

            for(int j = 0 ; j < arr.length ; j++) {

                tempSum += arr[i][j];

                System.out.println("Sum of Column" + tempSum);

                tempSum = 0;
                
            }


        }
    }

    public static void main (String[] args) {




    }
}
