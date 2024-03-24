//Written By: Aaron A. Bigno
//This program calculates charge of dump depending on the pound of trash.
import java.util.Scanner;//scanner class
public class TownDump {
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);
        //initialization of variables
        final byte townDumpCharge = 20;
        short weight;
        int charge;
        //input stream
        System.out.print("Enter the weight of a load of trash: ");
        weight = scan.nextShort();
        //below are the statemntes for charging
        if (weight < 300)
            charge = townDumpCharge;//garbage 200 pounds charges 20 dollars
        else{
            weight -= 200;
            charge = weight/ 100 * 8;
            charge += townDumpCharge;//for every hundred pounds added, charges additional 8 dollars
        }
        System.out.println("Your charge is: $" + charge);//output
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
