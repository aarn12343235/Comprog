//Written By: Aaron A. Bigno
/*
 This program asks for: 
    1 The capacity of the gas tank, in gallons.
    2 The indication of the gas gauge in percent (full= 100, three quarters full = 75, and so on).
    3 The miles per gallon of the car.
    Then program outputs if they need gas or safe to proceed
 */
import java.util.Scanner;//scanner class
public class LastChanceGas {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object for input
        final short maximumDistance = 200;//maximum to decide if safe to proceed or get gas
        int tank, gauge, milesPerGallon;//initialization of variables
        double distance;
        String str1 = "Get Gas!", str2 = "Safe to Proceed!";//decision variables

        System.out.println("Tank capacity:");//input stream
        tank = scan.nextInt();
        System.out.println("Gauge capacity:");
        gauge = scan.nextInt();
        System.out.println("Miles per gallon:");
        milesPerGallon = scan.nextInt();
        
        distance = (tank * milesPerGallon) * ((double)gauge/100);//formula in calculating distance, using integer arithmetic
        //if calculated distance is less than maximum distance: 
        if(distance < maximumDistance)
            System.out.println(str1);//outpts get gas!
        else
            System.out.println(str2);//outputs proceed
        scan.close(); //close method to prevent the input device from sending inputs to the program when not required.
    }
}
