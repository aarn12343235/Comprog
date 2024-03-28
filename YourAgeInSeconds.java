//Written By: Aaron A. Bigno
import java.util.Scanner;//scanner class for input
import java.text.DecimalFormat;//decimal format class for whole number accuracy
public class YourAgeInSeconds {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);
        DecimalFormat decform = new DecimalFormat("###,###,###");

        int years, months, days, totalDays, ageInSeconds;//initialization of variables
        double lifeSpanPercent;
        //input streams
        System.out.println("How old are you?: ");
        years = scan.nextInt();
        System.out.println("What month were you born? (Ex: June = 6, Febraury = 2 etc.): ");
        months = scan.nextInt();
        System.out.println("Which day of the month were you born?: ");
        days = scan.nextInt();

        totalDays = years * 365;//calculate the from your age
        //statements below adds up the number of days in the months from the year they are born
        if(months == 1)
            totalDays += 31;//january
        else if(months == 2)
            totalDays += 28;//febraury
        else if(months == 3)
            totalDays += 31;//march
        else if(months == 4)
            totalDays += 30;//april
        else if(months == 5)
            totalDays += 31;//may
        else if(months == 6)
            totalDays += 30;//june
        else if(months == 7)
            totalDays += 31;//july
        else if(months == 8)
            totalDays += 31;//auagust
        else if(months == 9)
            totalDays += 30;//september
        else if(months == 10)
            totalDays += 31;//october
        else if(months == 11)
            totalDays += 30;//november
        //it is not sensible to include december it is added already from the 365 days
        ageInSeconds = (totalDays + days) * 24 * 60 * 60;//this equation calculates total seconds(total days * 24 hours * 60 minutes * 60 seconds)
        lifeSpanPercent = (ageInSeconds / 2.5e9) * 100;//this equation calculates the total percentage of the user's life from an average human life expectancy
        //outputs
        System.out.println("The total seconds of you being alive is: " + decform.format(ageInSeconds) + " :O");
        System.out.printf("You have lived %.2f percent of the 2.5 billion seconds (average human life expectancy)of your lifespan%n", lifeSpanPercent);
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}