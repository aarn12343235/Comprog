//Written By: Aaron A. Bigno
//The program then calculates the cost per pound of lean (non-fat) beef for each package 
//and writes out which is the best value.
import java.util.Scanner;//import scanner class
public class GroundBeefValueCalculator {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//class object
        float packagePriceA, packagePriceB, packageACost, packageBCost;//initialization of variables
        byte percentLeanA, percentLeanB;

        System.err.println("Price per pound package A:");//input stream of variables
        packagePriceA = scan.nextFloat();
        System.out.println("Percent lean package A:");
        percentLeanA = scan.nextByte();
        System.out.println("Price per pound package B:");
        packagePriceB = scan.nextFloat();
        System.out.println("Percent lean package B:");
        percentLeanB = scan.nextByte();
        //equations to calculate cost
        packageACost = packagePriceA / percentLeanA * 100;
        packageBCost = packagePriceB / percentLeanB * 100;
        System.out.println("Package A cost per pound of lean: " + packageACost);//output
        System.out.println("Package B cost per pound of lean: " + packageBCost);
        //decision in which package is best value
        if(packageACost<packageBCost)
            System.out.println("Package A is the best value");
        else
            System.out.println("Package B is the best value");
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
