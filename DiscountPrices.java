//Written By: Aaron A. Bigno
import java.util.Scanner; //Scanner class for input stream
public class DiscountPrices {//class name
    public static void main (String[] args){//main method
        Scanner scan = new Scanner(System.in);//scan object
        final double discount = 0.10; //constant variable: discount 10%
        double price, discountedPrice;//initialization of variables

        System.out.println("Enter amount of purchases:");
        price = scan.nextDouble();//input stream for price

        discountedPrice = price * discount;//equation for calculating discounted price
        discountedPrice = price - discountedPrice;
        System.out.print("Discounted price: $" + (int)discountedPrice );//output
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
