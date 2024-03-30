//Written By: Aaron A. Bigno
//This program determines how many months the drug can remain in storage.

import java.util.Scanner;//scanner class

public class DrugPotency {//class name
    public static void main(String[] args){//main method
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables
        double effectiveness;
        int month = 0;
        //input stream
        System.out.print("Enter the amount of effectiveness from the drug: ");
        effectiveness = scan.nextDouble();

        while(effectiveness >= 50.0){//this loop iterates until the effectiveness will be less than 50
           
            System.out.println("month: " + month + "\teffectiveness: " + effectiveness);
            month++;
            effectiveness *= 0.96;//this equation calculates the effctive ness by multiplying to 4% which can be converted to 0.96

            if (effectiveness < 50)//this condition would terminate the loop and outputs the last month and discard
                System.out.println("month: " + month + "\teffectiveness: " + effectiveness + " DISCARDED");
        }
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}