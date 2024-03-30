//Written By: Aaron A. Bigno
//This program calculates the sequence of integers based on whether it is even or odd.
//The program then outputs the maximum of the sequence.
import java.util.Scanner;//scanner class
import java.lang.Math;//math class for maximum

public class HailstoneNumbers {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        //initialization of variables
        int initial, maxValue = 1;

        System.out.print("Enter initial: ");//input stream
        initial = scan.nextInt();

        while (initial > 1){//this loop iterates not until the initial values to 1

            maxValue = Math.max(maxValue, initial);//this varible keeps track of the maximum and updates if current value of initial is greater

            if(initial % 2 == 0){//checks if initial is even
                System.out.println(initial + "\t (even,\tnext value is " + initial + "/2 )");
                initial /= 2;//calculates the initial so it will decrease to 1
            }
            else{//odd
                System.out.println(initial + "\t (odd,\tnext value is " + "3*" + initial + "+1 )");
                initial = 3 * initial + 1;//calculates initial so it will decrease to 1
            }
        }
        if(initial == 1)//this condition outputs the number 1 and stops calculation
            System.out.println(initial + "\t (stop calculation)");

        System.out.println("\nThe maximum value in the sequence is : " + maxValue + "\n");//output of maximum
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
