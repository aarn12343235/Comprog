//Written By: Aaron A. Bigno
//this program outputs the phrase from the input acronym
import java.util.Scanner;//scanner class
public class InternetAcronyms{//class name
    public static void main ( String[] args ){//main method
        Scanner scan = new Scanner( System.in );
        //initialization of variables
        boolean response = true;//this variable controls a sentinel  loop below

        while (response){//this sentinel loop terminates if user wishes to exit the program by pressing 0
            System.out.println("Enter phrase or acronym (press 0 to exit program): ");
            String inputPhrase = scan.nextLine().trim();//this variable stores the input phrase
            if(inputPhrase == "0"){
                response = false;
                continue;
            }
            
            String outputPhrase = "";//this variable stores the equivalent phrase from diffecrent acronyms
            Scanner tokenizedInput = new Scanner(inputPhrase);//if user enters a line, this Scanner instance tokenizes the line

            while (tokenizedInput.hasNext()){//this loop iterates every token in the line
                String acronym = tokenizedInput.next().toUpperCase();
                String phrase;
                switch (acronym){//If a token matches an acronym, it is replaced with corresponding phrase
                    case "LOL":
                        phrase =  " Laugh Out Loud";
                        break;
                    case "BFF":
                        phrase =  " Best Friends Forever";
                        break;
                    case "SO":
                        phrase =  " Significant Other";
                        break;
                    case "THS":                  
                    case "THKS":                  
                    case "TX":                  
                        phrase =  " Thanks";
                        break;
                    case "AFAIK":
                        phrase =  " As Far As I Know";
                        break;
                    case "AMA":
                        phrase =  " Ask Me Anything";
                        break;
                    case "B4":
                        phrase =  " Before";
                        break;
                    case "BRB":
                        phrase =  " Be Right Back!";
                        break;
                    case "F2F":
                        phrase =  " Face To Face";
                        break;
                    default://if it is not an acronym, it remains unchanged
                        phrase =  " unknown" ;
                }
                outputPhrase += phrase;//the phrases from an input is stored in this variable(uses a sum statement to store all the phrases)
            }
            System.out.println(outputPhrase.trim());//output
            tokenizedInput.close();//close method to prevent the input device from sending inputs to the program when not required
        }
        scan.close();//close method to prevent the input device from sending inputs to the program when not required
  }
}