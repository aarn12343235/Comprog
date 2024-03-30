//Written By: Aaron A. Bigno
//this program asks the user 10 single-digit multiplication questions and checks the user's answers for each
import java.util.Random;//random class
import java.util.Scanner;//class name
public class MultiplicationQuiz{//class name
    public static void main(String[] args) {//main method
        Random rand = new Random();//randon objec
        Scanner scan = new Scanner(System.in);//scan
        //initialization of variables
        int product, answer, wrongAnswer = 0, i = 1, score;
        //statements
        while (i <= 10){//this loop iterates 10 times for a 10 item multiplication quiz
            int num1 = rand.nextInt(10);//these variables stores the random number genrated to be multiplied
            int num2 = rand.nextInt(10);
            //input stream
            System.out.print(i + ". " +"What is " + num1 + " * " + num2 + " ? ");
            answer = scan.nextInt();

            product = num1 * num2;//this calculates product

            if(product == answer)
                System.out.println("Correct!");//this outputs correct
            else{
                System.out.println("wrong. " + num1 + " * " + num2 + " is " + product);
                wrongAnswer++;//this increments wrong asnwer to be deducted from right answers
            }
            System.out.println();
            i++;
        }
        score = 10 - wrongAnswer;//10 item quiz minus wrong asnwers

        System.out.println("You got " + score + " out of 10 questions correct!" );//output
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}