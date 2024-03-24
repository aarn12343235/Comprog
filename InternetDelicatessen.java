//Written By: Aaron A. Bigno
//this program writes out order and charges
import java.util.Scanner;//scanner class
public class InternetDelicatessen {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables and constants
        String item;
        final float regularDelivery = 2.00f, expressDelivery = 3.00f;
        float price, total, delivery = 0;
        int deliveryChoice;
        //input stream
        System.out.print("Enter item: ");
        item = scan.nextLine();
        System.out.print("Enter the price: ");
        price = scan.nextFloat();
        System.out.print("Overnight delivery (Enter 0 if No, 1 if Yes.): ");
        deliveryChoice = scan.nextInt();//adds charges depending on delivery
        //output stream
        System.out.println("Invoice:");
        System.out.printf("\t%s\t\t%.2f", item, price);
        if(price < 10)
            delivery += regularDelivery;//charged if price is less than $10
        if(deliveryChoice == 1)
            delivery += expressDelivery;//charged if delivery expressed is wanted
        total = price + delivery;//calculation for total
        System.out.printf("\n\tdelivery\t%.2f", delivery);
        System.out.printf("\n\ttotal\t\t%.2f", total);
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
