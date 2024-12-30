//Write a Java program that sums the elements of a 2D array.
import java.util.*;
class _10_sum_2dArray{
    public static void main(String args[]){
        int[][] arr= {{1,2,3},
                      {4,5,6},
                      {7,8,9}};

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of elements: " + sum);
    }
}
