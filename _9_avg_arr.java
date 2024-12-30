//Write a Java program that finds the average of numbers stored in an integer array
import java.util.*;
class _9_avg_arr{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter "+size+" Array Elements");
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        double avg = sum/size;
        System.out.println("Average of Array: "+avg);
    }
}