package MarkProgram;
import java.util.Scanner;

public class MarkProg {
    public static void main(String[] args) {
        //initializing the array and the variables i will use
        int marks[] = new int[40] ;
        int total = 0;
        int average = 0;
        
        getMarks(marks);
        total = getSum(marks);

        average = total / 40;
        System.out.println("The average is: " + average);
        System.out.println("The highest mark is: " + highest_mark(marks));
    }

    //void function for getting the marks entered by the user 
    public static void getMarks(int[] marks_array){
        int x = 0;
        Scanner input = new Scanner(System.in);
        int current_num = 0;
        //creating a loop that will iterate 40 times so that 40 students will enter their mark
        for(x = 0; x < 40; x++){
            System.out.println("Enter mark " + (x+1));
            current_num = input.nextInt();
            marks_array[x] = current_num;
            //mark validation to check if it's between 1 and 100
            if (current_num < 0) {
                System.out.println("Invalid mark, mark must be greater than 0");
                System.out.println("Enter mark " + (x+1));
                current_num = input.nextInt();   
                marks_array[x] = current_num;
            }
            else{
                if (current_num > 100) {
                    System.out.println("Invalid mark, mark must be less than 100");
                    System.out.println("Enter mark " + (x+1));
                    current_num = input.nextInt();   
                    marks_array[x] = current_num;
                }
                else{
                    System.out.println("Mark successfully recorded!");
                }
            }
        }
    }

    //a function that returns the sum of all marks entered by the user
    public static int getSum(int[] entered_marks_array){
        int total = 0;
        for (int mark : entered_marks_array) {
            total += mark;
        }
        return total;
    }

    //a function that returns the highest mark from all the marks entered by the user
    public static int highest_mark(int[] marks_array){
        int highest = 0;
        for (int i : marks_array) {
            if(i >= highest){
                highest = i;
            }
        }
        return highest;

    }
}
