//Written By: Aaron A. Bigno
//This program generates random character names :))
import java.util.Random;//random class for randomize cases
import java.util.Scanner;// :)
public class RandomNames {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();//random object
        //initialization of variables
        int firstNameCases = 0, lastNameCases = 0, choice;
        String firstName = "", lastName = "";
        boolean response = true;
        
        while(response){//this is a sentinel loop, which terminates the program whenever user wishes to
            firstNameCases = rand.nextInt(10)+1;//this assigns the random cases to be executed
            //input stream for choice
            System.out.println("Welcome to character name generator!");
            System.out.println("Press 1 to start(0 to Exit)");
            choice = scan.nextByte();
            if (choice != 1){
                response = false;
                break;
            }
            switch (firstNameCases) {//these cases are randomized and holds corresponding firstnames
                case 1:
                    firstName = "Alice";
                    break;
                case 2:
                    firstName = "Guinevere";
                    break;
                case 3:
                    firstName = "Lesley";
                    break;
                case 4:
                    firstName = "Nana";
                    break;
                case 5:
                    firstName = "Melissa";
                    break;
                case 6:
                    firstName = "Valentina";
                    break;
                case 7:
                    firstName = "Eudora";
                    break;
                case 8:
                    firstName = "Layla";
                    break;
                case 9:
                    firstName = "Hanabi";
                    break;
                case 10:
                    firstName = "Kagura";
                    break;
            }
            int min = 11, max = 15;
            lastNameCases = rand.nextInt(max - min + 1) + min;//randomized cases bound from 11 - 15

            switch (lastNameCases) {//these cases are randomized and holds corresponding lastnames
                case 11:
                    lastName = "Paxley";
                    break;
                case 12:
                    lastName = "Vance";
                    break;
                case 13:
                    lastName = "Baroque";
                    break;
                case 14:
                    lastName = "Ansaac";
                    break;
                case 15:
                    lastName = "Solinst";
                    break;
            }
            //output
            System.out.println("Your character name is: " + firstName + " " + lastName);
            System.out.println("\nDo you wish to continue? (1 if yes, 0 if No): ");
            choice = scan.nextInt();
            if(choice == 0)
                System.exit(0);
        }
        scan.close();//close method to prevent the input device from sending inputs to the program when not required                            
    }
}
