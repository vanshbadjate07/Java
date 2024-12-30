//Write a Java program to reverse the array
import java.util.*;
class _12_reverse_arr{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter "+size+" Array Element: ");
        for(int i = 0;i<arr.length; i++){
            arr[i]=s.nextInt();
        }

        System.out.println("Array Element Before Reverse:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int start = 0;
        int end = size - 1;//cause array start from 0 and store till size-1 thats why array last element is at size -1
        for(int i=0;i<arr.length;i++){
            if(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;//moving pointer to next
                end--;//moving pointer to behind
            }
        }

        System.out.println("\nArray Element After Reverse: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}