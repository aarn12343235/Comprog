//Written By: Aaron A. Bigno
//this program calculates miles per gallon for a list of cars.
//The user signals that there are no more cars by entering a negative initial odometer reading.
import java.util.Scanner;//scanner class

public class MilesPerGallon{//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables
        int initialMiles = 0, finalMiles, gallon;
        double milesPerGallon;

        System.out.println("Miles Per Gallon Program");

        while (initialMiles >= 0){//this loop executes whenever user enters values but terminates if user inputs negative value in "initial miles"

            System.out.println("Initial Miles:");
            initialMiles = scan.nextInt();

            if (initialMiles < 0){//this is the sentinel value that terminates loop if this condition will be true
                System.out.println("bye");
                return;//return makes the loop terminate
            }

            System.out.println("Final Miles:");//input stream
            finalMiles = scan.nextInt();

            System.out.println("Gallons");
            gallon = scan.nextInt();

            milesPerGallon = (finalMiles - initialMiles) / gallon;//calculates milespergallon

            System.out.println("Miles per gallon: " + milesPerGallon + "\n");//output
            scan.close();//close method to prevent the input device from sending inputs to the program when not required.
        }
    }
}