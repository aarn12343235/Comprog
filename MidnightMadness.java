//Written By: Aaron A. Bigno
//Sales of movie tickets has been dropping! In an effort to attract more viewers, the theater has started a new policy charging $4.00 for all tickets sold after 2200 (10 pm). 
//However, no children may purchase tickets after that time.
import java.util.Scanner;//scanner class
public class MidnightMadness {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables and constants
        byte age;
        short time;
        final double adultTix = 8.00, adultMatineeTix = 5.00, childTix = 4.00, childMatineeTix = 2.00, newPolicyDiscount = 4.00, price;
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
            if (time >= 100 && time <= 1700){//1 AM to 5 PM for matinee discount
                price = adultMatineeTix;
                System.out.println("Congratulations! You got a matinee discount!");
            }
            else{//the theater has started a new policy charging $4.00 for all tickets sold after 2200 (10 pm).
                if (time > 2200){
                    price = newPolicyDiscount;
                    System.out.println("You got the midnight discount!");
                }
                else
                    price = adultTix;//no discount hours later than 5 PM
            }   
        }
        else{//The normal children's ticket price is $4.00, however the children's matinee price is $2.00.
            if (time >= 100 && time <= 1700){//1 AM to 5 PM for matinee discount
                price = childMatineeTix;
                System.out.println("Congratulations! You got a matinee discount!");
            }
            else{
                if(time >= 2200){//no children may purchase tickets after that time.
                    System.out.println("Childrens are not allowed in this hour!");
                    price = 0;
                    System.exit(0);
                }
                else
                    price = childTix;//no discount hours later than 5 PM
            }
        }
        System.out.printf("The price of the ticket is: $%.2f", price);
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}