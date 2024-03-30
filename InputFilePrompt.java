//Written By: Aaron A. Bigno
//this program asks the user for the name of the input file to be read by the program.
//But there are certain conditions in order to succesfully name a file :)
import java.util.Scanner;//scanner class

public class InputFilePrompt{//class name
    public static void main(String[] args){//main method
        Scanner scan = new Scanner(System.in);//scanner object

        String fileName;//declaration of variable file name

        do{//this loop will continue to execute if input does not meet the requirements
            System.out.print("input file: ");//input stream
            fileName = scan.nextLine();

            if (!fileName.endsWith(".dat")) //endsWith method to check if input has ".dat" else the user will be asked again
                System.out.println(">>>file name must end with .dat<<<");
            else if (fileName.contains(" ")) //"contains" method to chech if input has whitespace and if it's true then user is asked again
                System.out.println(">>>file name must not contain spaces<<<");
            else if (fileName.equals(".dat")) //if input does not have a name, this returns true and the user is asked again
                System.out.println(">>>file name missing<<<");
            else {
                System.out.println("OK");//if requirements are met, it terminates the program
                break;
            }
        } while (true);

        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}