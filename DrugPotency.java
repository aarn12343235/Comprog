import java.util.Scanner;
public class DrugPotency {
    public static void main(String[] args) {
        double effectiveness = 100.0;
        int month = 0;
        while(effectiveness >= 50.0){
            System.out.println("month: " + month + "\teffectiveness: " + effectiveness);
            month++;
            effectiveness *= 0.96;
            if (effectiveness <50){
                System.out.println("month: " + month + "\teffectiveness: " + effectiveness + " DISCARDED");
            }
        }
    }
}
