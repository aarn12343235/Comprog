//Written By: Aaron A. Bigno

//This program adds up integers that the user enters. 
//First the programs asks how many numbers will be added up. 
//Then the program prompts the user for each number. Finally it prints the sum.

import java.util.Scanner;//scanner class

public class AddingUpIntegers {//class name
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables
        int inputLimit, inputNumber, i = 1, sum = 0;
        //input stream
        System.out.println("How many integers will be added:");
        inputLimit = scan.nextInt();

        while(i <= inputLimit){//this loop iterates the number of integer to input desired by user
            System.out.println("Enter an integer:");
            inputNumber = scan.nextInt();

            sum += inputNumber;//this formula stores the integer and calculates sum
            i++;
        }
        System.out.println("The sum is " + sum);//output
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
