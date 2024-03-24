//Written By: Aaron A. Bigno
// This program calculates the wind chill index given the temperature and the wind speed.
import java.util.Scanner;//scanner class
public class WindChillIndex {//class name
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object
        byte windSpeed, temp;//initialization of variables
        double windChill;

        System.out.println("Enter Wind Speed:");//input streams
        windSpeed = scan.nextByte();
        System.out.println("Enter Temperature:");
        temp = scan.nextByte();
        //Statements below determines follwing conditions.
        if(windSpeed < 3)//If wind speed is less than 3 mph then wind chill = current temperature
            windChill = temp;
        else if(temp > 50)//If the current temperature is greater than 50° F then wind chill = current temperature
            windChill = temp;
        else//otherwise, wind chill = 35.74 + 0.6215*temp - 35.75*v0.16 + 0.4275*temp*v0.16
            windChill = 35.74 + (0.6215 * temp) - 35.75 * Math.pow(windSpeed, 0.16) + (0.4275 * temp) * Math.pow(windSpeed, 0.16);
        System.out.print("Wind Chill: " + windChill);//output
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }
}
