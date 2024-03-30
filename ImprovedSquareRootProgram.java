//Written By: Aaron A. Bigno
//this program repeatedly prompts the user until the number that is entered is positive.
import java.util.Scanner;//scanner class

public class ImprovedSquareRootProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable declarations
        double number, squareRoot;
        boolean continueLoop;
        String response;

        do{//outer loop executes if user wishes to continue the program by inputting "yes"
            do{//this loop will execute if user inputs number less than negative
                System.out.print("Enter a number--> ");
                number = scan.nextDouble();

                if (number < 0) 
                    System.out.println(">>>number must be positive<<<");

            } while (number < 0);

            squareRoot = Math.sqrt(number);//formula in getting the root
            System.out.println("Square root of " + number + " is " + squareRoot);//output

            do{//this loop checks whether the user wishes to continue the program or not
                System.out.print("Do you wish to continue (yes or no)? ");
                response = scan.next().toLowerCase();//lowerCase method to ensure the output will be equals to "yes" or "no"

                if (!response.equals("yes") && !response.equals("no"))//user is asked again if response is not "yes" or "no"
                    System.out.println(">>>Please respond with (yes or no)<<<");

            } while (!response.equals("yes") && !response.equals("no"));

            continueLoop = response.equals("yes");//continues the loop if response is yes

        } while (continueLoop);

        System.out.println("Bye");//bye
        scan.close();
    }
}