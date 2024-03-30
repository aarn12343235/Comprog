//Written By: Aaron A. Bigno
//This program calcultes sum of input integers while terminating the program if user input 0.
import java.util.Scanner;//scanner class

public class AddingIntegers {//class name
    public static void main(String[] args) {//main method
    Scanner scan = new Scanner( System.in );//scanner object
    
    int value, sum = 0;//initialization of variables      

    System.out.print( "Enter first integer (enter 0 to quit): " );//input stream
    value = scan.nextInt();

    if(value == 0)//this condition will falsified the loop if user wishes to quit
        System.out.println("No integers were entered.");
        
    while(value != 0){//this loop iterates every integer entered and calculates sum

        System.out.print("Enter next integer: ");//input stream
        value = scan.nextInt();
        
        sum += value;//calculates sum

        System.out.println( "Sum of the integers: " + sum );//output
    }
    System.out.println("bye");//bye :)
    
    scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}