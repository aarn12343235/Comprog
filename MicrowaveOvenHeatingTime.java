//Written By: Aaron A. Bigno
//This program writes out recommended heating time depending on items heated
import java.util.Scanner;
public class MicrowaveOvenHeatingTime {
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);
        //initialization of variables
        short item, time; 
        int minutes, seconds;
        //input stream
        System.out.print("How many items to heat: ");
        item = scan.nextShort();
        System.out.print("Time for one item (Ex: 3:49 is 349): ");
        time = scan.nextShort();
        //statements below are conditions that recommended time depends.
        if(item < 4){
            if (item == 1)
                time *= 1;//1 item is just the time input
            else if (item == 2)
                time += time / 2;//2 items adds 50% to the heating time
            else
                time *= 2;//3 itmes doubles the heating time
            minutes = time / 100;
            seconds = time % 100;//this variable stores minutes and seconds using integer arithmetic
            if(seconds > 60){//if seconds exceed 60, adds 1 minute
                minutes += 1;
                seconds -= 60;
            }
            System.out.print("Heat for " + minutes + " minutes " + seconds + " seconds");//output
        }
        else //items more than 3 is not recommended
            System.out.println("Heating the following number of items is not recomended!");
        scan.close();//close method to prevent the input device from sending inputs to the program when not required.
    }   
}
