//Written By: Aaron A. Bigno
//This program determines the price of a movie ticket with a matinee discount.
//Matinee tickets starts anytime earlier than 5 pm!
import java.util.Scanner;//scanner class
public class MatineeMovieTickets {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables and constants
        byte age;
        short time;
        final double adultTix = 8.00, adultMatineeTix = 5.00, childTix = 4.00, childMatineeTix = 2.00, price;
        //input stream of values
        System.out.println("Welcome to the cinema!");
        System.out.print("Enter your age: ");
        age = scan.nextByte();
        System.out.print("Enter time of the day(Use 24-hour clock where noon is 1200 and 4:30 pm is 1630): ");
        time = scan.nextShort();
        //These statements decide the following conditions. Matinee tickets starts anytime earlier than 5 pm!
        //The normal adult ticket price is $8.00, 
        //however the adult matinee price is $5.00. Adults are those over 13 years.
        if (age > 13){
            if (time >= 100 && time <= 1700){
                price = adultMatineeTix;
                System.out.println("Congratulations! You got a matinee discount!");
            }
            else
                price = adultTix;
        }
        else{//The normal children's ticket price is $4.00, however the children's matinee price is $2.00.
            if (time >= 100 && time <= 1700){
                price = childMatineeTix;
                System.out.println("Congratulations! You got a matinee discount!");
            }
            else
                price = childTix;
        }
        System.out.printf("The price of the ticket is: $%.2f", price);
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
