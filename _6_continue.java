//Write a Java program that demonstrates the use of the continue statement in a loop
class _6_continue{
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            if(i==5){
                System.out.println("Skipping 5");
                continue;
            }
            System.out.println(i);
        }
    }
}