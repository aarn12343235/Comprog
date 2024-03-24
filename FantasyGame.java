//Written By: Aaron A. Bigno
//This program asks for a name for the character and asks for the point value of for each of the three characteristics.
//However total points must be less than 15.
import java.util.Scanner;//scanner class
public class FantasyGame {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);
        //initialization of variables
        String characterNAme;
        int strength, health, luck, total;
        //input stream
        System.out.println("Enter the name of your character: ");
        characterNAme = scan.nextLine();
        System.out.println("Enter strength (1-10): ");
        strength = scan.nextInt();
        System.out.println("Enter health (1-10): ");
        health = scan.nextInt();
        System.out.println("Enter luck (1-10): ");
        luck = scan.nextInt();

        total = strength + health + luck;//this equation checks if the total is 15 or not
        if (total > 15){//this condition executes if total is less than 15
            strength = 5;
            health = 5;
            luck = 5;
            System.out.print("You have give your character too many points!  Default values have been assigned:");
        }
        System.out.print("\n" + characterNAme + "," + "strength: " + strength + "," + "health: " + health + "," + "luck: " + luck);//output
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
