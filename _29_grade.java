/*
Create a program that allows a teacher to input grades for students in a class. The
program should continue to prompt for grades until the teacher enters -1 to stop. After
all grades have been entered, calculate and display the average grade, the highest grade,
and the number of students who passed (e.g., scored above a certain threshold). share
code
 */
import java.util.*;
class _29_grade{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int count = 0;
        double marks = 0.0;
        double total = 0.0;
        double highest = -1;
        int pass_count=0;


        while(true){
            System.out.println("Enter Grade: ");
            marks = s.nextDouble();
            
            if(marks==-1){
                break;
            }
            else{
                total += marks;
                if(marks>highest){
                    highest = marks;
                }
                if(marks>30){
                    pass_count++;
                }
                count++;
            }
        }
        System.out.println("Average of Grade: "+(total/count));
        System.out.println("Highest Grade Is: "+highest);
        System.out.println("Total Passed Students: "+pass_count);
    }
}