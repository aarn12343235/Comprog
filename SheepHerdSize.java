//Written By: Aaron A. Bigno
//this program calculates the years need for the sheep herd to be supervised
//until the population reaches 80 or more.

public class SheepHerdSize {//class name
    public static void main(String[] args) {//main method
        //initialization of variables
        double N, power = 1.0; // Initialize power to 1.0

        System.out.println("\nYear\tPopulation");

        for (int t = 0; t <= 25; t++) {//this loop iterates until t is 25
            N = 220.0 / (1 + 10 * power);//N is the population wherein the initial number is 20

            System.out.printf("%d\t%.2f\n", t, N);//output

            if (N >= 80) {//this condition breaks the loop when population is reached 80 or more
                System.out.println("The sheep herd must be supervised for " + t + " years until they can maintain themselves.");
                break;
            }
            power *= 0.83; // Update power for the next iteration, thus incrementing the population
        }
    }
}