//Written By: Aaron A. Bigno
//This program asks the user to enter a word. The program then writes that word one character per line.
import java.util.Scanner;//scanner class

public class OneLetterPerLine {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables
        String word;
        int wordLength, index = 0, i = 1;
        char letter;
        //input stream
        System.out.print("Enter a word: ");
        word = scan.nextLine();
        wordLength = word.length();//this method returns the number of characters in a string

        while (i <= wordLength) {//this loop iterates every character in the string
            letter = word.charAt(index);//this variable stores each character in the string index

            System.out.println(letter);//output
            index++;
            i++;
        }
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
