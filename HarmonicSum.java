//Written By: Aaron A. Bigno
//This program that computes the following sum:
//sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N
import java.util.Scanner;//scanner class

public class HarmonicSum{//class name
    public static void main(String[] args){//main method
        Scanner scan = new Scanner(System.in);
        //initialization of variables
        int n, i = 1;
        double sum = 0;
        //input stream
        System.out.println("Enter N:");
        n = scan.nextInt();

        while (i <= n){//this loop iterates number of times corresponding the input and sums of using formula 1.0/N
            sum += 1.0/i;
            i++; 
        }
        System.out.println("\n" + sum);//output
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}