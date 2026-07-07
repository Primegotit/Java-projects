package MarkProgram;
import java.util.Scanner;

public class MarkProg {
    public static void main(String[] args) {

        int marks[] = new int[40] ;
        int total = 0;
        int average = 0;
        //i dont need the total and the average variable
        getMarks(marks);
        total = getSum(marks);

    

        average = total / 40;
        System.out.println("The average is: " + average);
        System.out.println("The highest mark is: " + highest_mark(marks));

    }


    public static void getMarks(int[] marks_array){

        int x = 0;
        Scanner input = new Scanner(System.in);
        int current_num = 0;
        for(x = 0; x < 40; x++){
            System.out.println("Enter mark " + (x+1));
            current_num = input.nextInt();
            marks_array[x] = current_num;
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


    public static int getSum(int[] entered_marks_array){
        int total = 0;
        for (int mark : entered_marks_array) {
            total += mark;
        }
        return total;
    }

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
