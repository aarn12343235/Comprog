//Written By: Aaron A. Bigno
//this program computes X^N where X is a floating point number and N is a positive integer.
import java.util.Scanner;//scanner class

public class PowerOfANumber {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables
        double x, power = 1, i = 1;
        int n = 1;
        
        while(n >= 0){//this executes statements and only terminates if the user enter a negative value of N
            //input stream
            System.out.println("\nEnter x: ");
            x = scan.nextDouble();
            System.out.println("Enter N: ");
            n = scan.nextInt();
            
            if(n < 0)//conditional statement wherein if user enters negative value of N, it automatically falsified the loop
                System.out.println("N must be positive integer.");
            else{
                while (i <= n){//this loop iterates 1 to N and calculates it's power

                    power *= x;
                    i++; 
                }
                //output
                System.out.printf("%.2f raised to the power of %d is: %.5f", x, n, power);
                System.out.println("\n\n" + "-------------");
            }
        }
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
