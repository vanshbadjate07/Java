/*
Print the Pattern as per given etc
1 1 1 1 1
1 1 1 1
1 1 1
1 1
1
 */
class _23_pattern_one{
    public static void main(String args[]){
        int rows = 5;
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}