//Prints all odd numbers from 1 to 20, using continue to skip even numbers.
class _15_odd_continue{
    public static void main(String args[]){
        for(int i =1;i<=20;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ,");
        }
    }
}