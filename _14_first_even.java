//Find the first even number in a list and breaks the loop when it finds.
import java.util.*;
class _14_first_even{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Size of array: ");
        int size = s.nextInt();

        System.out.println("Enter "+size+" Array Element: ");
        int[] arr = new int[size];

        for(int i = 0;i<arr.length;i++){
            arr[i] =  s.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("First Even Found which is "+arr[i]);
                break;
            }
        }
    }
}