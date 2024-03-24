//Written By: Aaron A. Bigno
//Write a program that asks a user for their birth year encoded as two digits (like "62") and for the current year, also encoded as two digits (like "99"). 
//The program is to correctly write out the users age in years.
//The program will have to determine when a two digit value such as "62" corresponds to a year in the 20th century ("1962") or the 21st century. 
import java.util.Scanner;//scanner class
public class Y2KProblemDetector {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        short birthYear, currentYear;//initialization of variables

        System.out.print("Year of birth (input the last two digits of the year. Ex. 2005 is 05): ");//input values
        birthYear = scan.nextByte();
        System.out.print("Current Year (input the last two digits of the year. Ex. 2005 is 05): ");
        currentYear = scan.nextByte();
        //these equations assumes that year only starts from 1900s to 2000s so on
        birthYear += 1900;
        currentYear += 2000;
        int age = currentYear - birthYear;//calculates age
        if (age > 100)//corrects age if its is more than 100
            age -= 100;
        System.out.print("Your age is: " + age);//output
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
