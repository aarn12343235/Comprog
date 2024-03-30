//Written By: Aaron A. Bigno
//This program asks the user to enter a word. The program will then repeat word for as many times as it has characters.
import java.util.Scanner;//scanner class

public class RepeatedlyEchoAWord {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables
        String inputString;
        int times, i = 1;
        //input stream
        System.out.println("Enter a word:");
        inputString = scan.nextLine();
        times = inputString.length();//this variable stores the length of a string 
        System.out.println("\n");

        while (i <= times) {//this loop iterates and prints the string until it is equal to the length of the string
            System.out.println(inputString);//output
            i++;
        }
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
