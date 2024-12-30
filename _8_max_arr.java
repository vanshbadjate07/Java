//Create a method that accepts an array and returns the maximum value using a for loop.
import java.util.*;
class _8_max_arr{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int size = s.nextInt();
        int[] num = new int[size];
        System.out.println("Enter "+size+" Array Element: ");
        for(int i = 0;i<size;i++){
            num[i]=s.nextInt();
        }
        System.out.print("Entered Array Element: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+",");
        }

        int max = num[0];
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                max = num[i];
            }
        }
        System.out.println("\nMax Element is: "+max);
    }
}