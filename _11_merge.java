//Design a Java program that merges two sorted arrays into a single sorted array.
import java.util.*;
class _11_merge{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = s.nextInt();

        int[] arr1 = new int[size];
        System.out.println("Enter "+size+" Array1 Elements: ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }

        for(int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        int[] arr2 = new int[size];
        System.out.println("Enter "+size+" Array2 Elements: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=s.nextInt();
        }

        for(int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }
        
        int[] merge = new int[size+size];
        for(int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merge[size+i]=arr2[i];
        }
        System.out.println("Merged Array Elements Are: ");
        for(int i =0;i<merge.length;i++){
            System.out.println(merge[i]);
        }

    }
}