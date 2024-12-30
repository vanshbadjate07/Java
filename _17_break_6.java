//Program counts from 1 to 10 but breaks when it reaches 6.
class _17_break_6{
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }
    }
}