//Written By: Aaron A. Bigno
import java.util.Scanner;//scanner class utility
public class OrderChecker {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object for input
        final int boltPrice = 5, nutPrice = 3, washerPrice = 1;//constant for price
        int bolts, nut, washers,totalCost;//initialization of variables

        System.out.print("Number of bolts:"); //input stream
        bolts = scan.nextInt();
        System.out.print("Number of nuts:");
        nut = scan.nextInt();
        System.out.print("Number of washers:");
        washers = scan.nextInt();

        totalCost = (bolts * boltPrice) + (nut * nutPrice) + (washers * washerPrice);//equation for total cost
        System.out.print("Check Order: ");
        //this statement checks if order is correct
        if (nut < bolts)//nuts must be atleast as many as bolts
            System.out.print("Too few nuts!");
        else{
            if (washers < (bolts * 2))//washers must be atleast as twice many as bolts
                System.out.print("Too few washers!");
            else
                System.out.print("Order is Ok!");//order is okay if order is right
        }
        System.out.print("\nTotal Cost: " + totalCost);//output cost
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
