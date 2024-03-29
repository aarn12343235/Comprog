//Written By Aaron A. Bigno
//This program is the modification from previous wherein it reads the string in a text file:))
import java.util.Scanner;//scanner class
import java.text.DecimalFormat;//decimal format for accurate percentage

public class CharacterCounterWithFileInput {//class name
    public static void main(String[] args) {//main method
        DecimalFormat decform = new DecimalFormat("##.##");
        Scanner scan = new Scanner(System.in);
        //initialization of variables
        String strInput = "";//I assigned this string with empty string so it stores the strings from a text file using loop
        int vowel = 0, consonants = 0, space = 0, punctuation = 0;

        while (scan.hasNextLine()) {//this loop reads all the lines in the text file and stores the string to the variable strInput
            strInput += scan.nextLine();
        }

        strInput = strInput.toUpperCase();//convert string to uppercase 
        int totalChars = strInput.length();//stores the number of length of string in the text file

        for (int i = 0; i < strInput.length(); i++) {//this loop reads and determines specific types of characters, as following:
            char ch = strInput.charAt(i);
            switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel++;//if character is vowel
                    break;
                case ' ':
                    space++;//if character is a whitespace
                    break;
                case '?':
                case '!':
                case '.':
                case '\'':
                case '{':
                case '}':
                case '[':
                case ']':
                case '(':
                case ')':
                case '-':
                case '_':
                case '"':
                    punctuation++;//if character is a punctuation
                    break;
                default:
                    consonants++;//else, consonants
                    break;
            }
        }
        //output stream
        System.out.println("\nTotal characters in the file: " + totalChars);
        System.out.println("The number of vowels are: " + vowel);
        System.out.println("Percentage of vowel in the file is: " + decform.format((double) vowel / totalChars * 100) + "%");//returns equivalent percentage
        System.out.println("The number of consonants are: " + consonants);
        System.out.println("Percentage of consonants in the file is: " + decform.format((double) consonants / totalChars * 100) + "%");//returns equivalent percentage
        System.out.println("The number of spaces are: " + space);
        System.out.println("Percentage of spaces in the file is: " + decform.format((double) space / totalChars * 100) + "%");//returns equivalent percentage
        System.out.println("The number of punctuations are: " + punctuation);
        System.out.println("Percentage of punctuations in the file is: " + decform.format((double) punctuation / totalChars * 100) + "%");//returns equivalent percentage

        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}