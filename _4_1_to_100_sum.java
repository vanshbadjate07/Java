//Create a Java program using a while loop to calculate the sum of integers from 1 to 100.
class _4_1_to_100_sum{
    public static void main(String args[]){
        int sum = 0, i=1;
        while(i<=100){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of 1 to 100: "+sum);

    }
}