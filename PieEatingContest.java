//Written By: Aaron A. Bigno
//At the State Fair Pie Eating Contest all contestants in the 
//heavyweight division must weigh within 30 pounds of 250 pounds.
import java.util.Scanner; // scanner class utility
public class PieEatingContest {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        short weight;//in pounds

        System.out.println("Welcome to pie eating contest!");
        System.out.println("In order to be qualified, your weight must be within 30 of 250 pounds!");
        System.out.print("Let's see what your weight is! Enter your weight (in pounds): ");
        weight = scan.nextShort();//inpput stream
        
        if(weight >= 30 && weight <= 250)//statements that decide if input is qualified or not
            System.out.println("Congratulations! You are qualified into the contest!");
        else
            System.out.println("Sorry, you are not eligible in the contest!");
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
