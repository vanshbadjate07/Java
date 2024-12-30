//Find the Second largest array element in Java
import java.util.*;
class _13_second_large{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }   
        int max = arr[0];
        int second_large = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                second_large = max;  
                max = arr[i];
            } 
            else if (arr[i] > second_large && arr[i] != max) {
                second_large = arr[i];
            }
        }
        System.out.println("Second Largest Array Element is: "+second_large);
        
    }
}