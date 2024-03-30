//Written By: Aaron A. Bigno
//this program calculates two things:  (a) the sum of all odd integers from 1 to N, and (b) N^2
import java.util.Scanner;//scanner class

public class SumOfOddIntegersFrom1ToN {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object

        int N, sum = 0, squareN = 0;//initialization of variables

        System.out.print("Enter N: ");//input stream
        N = scan.nextInt();

        for(int i = 1; i <= N; i+=2)//this loop iterates to every odd number, by incrementing +2
            sum += i;//sum of odd

        squareN = N * N;//square of N
        //output
        System.out.println("The sum of all odd integers from 1 to " + N + " is: " + sum);
        System.out.println("The square of " + N + " is: " + squareN);
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
