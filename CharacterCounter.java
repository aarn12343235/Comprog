//Written By: Aaron A. Bigno
//This program determines the number of consonants, vowels, punctuation characters, and spaces in an input line.
import java.util.Scanner;//scanner class
public class CharacterCounter{
	public static void main(String[] args){//main method
        Scanner scan = new Scanner(System.in);
        //initialization of variables
		String str;
        int vowel = 0, consonants = 0, space = 0,punctuation = 0;
        //input stream
        System.out.println("Enter a word or phrase: ");
        str = scan.nextLine();
		str = str.toUpperCase();
        
        for(int i = 0; i < str.length(); i++){//this loop checks every character in the string using charAt method
            char ch = str.charAt(i);
	        switch(ch){//switch cases checks the characters if it is a vowel, consonants, punctuation, or a space.
                case 'A':
	            case 'E':
	            case 'I':
	            case 'O':
	            case 'U':
	                vowel++;//incremets vowel counts
	                break;
	            case ' ':
	                space++;//increments space counts
	                break;
	            case '?':
	            case '!':
	            case '.':
	            case '\'':
                    punctuation++;//increments punctuations counts
                    break;
	            default:
	                consonants++;//increments consonants
	                break;
	       }
	    }
        //output
		System.out.println("The number of vowels are:  "+ vowel);
		System.out.println("The number of consonants are:  "+ consonants);
		System.out.println("The number of spaces are:  "+ space);
		System.out.println("The number of punctuations are:  "+ punctuation);
		
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
	}
}