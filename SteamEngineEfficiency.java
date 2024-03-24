//Written By: Aaron A. Bigno
//This programs the steam engine efficiency
import java.util.Scanner;
public class SteamEngineEfficiency {
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);
        short Tair, Tsteam;//initialization variables
        float efficiency;
        //input stream
        System.out.print("Enter air temperature: ");
        Tair = scan.nextShort();
        System.out.print("Enter steam temperature: ");
        Tsteam = scan.nextShort();

        efficiency = 1 - Tair / Tsteam;//calculates efficiency
        if(Tsteam < 373)//if steam is less than 373 Kelvin, efficiency is zero
            efficiency = 0;
        System.out.print("Maximum possible efficiency of a steam engine is: " + efficiency);//output
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
