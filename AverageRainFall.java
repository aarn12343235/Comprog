//Written By: Aaron A. Bigno
public class AverageRainFall {//class name. must be public
    public static void main(String[] args) {//main method
        byte April, May, June;//initialization of variables
        double average;

        April = 12;//assignment of values in variables
        May = 14;
        June = 8;
        average = (double)(April + May + June) / 3;//formula for average
        System.out.println("Rainfall for April:\t" + April);
        System.out.println("Rainfall for May:\t" + May);
        System.out.println("Rainfall for June:\t" + June);
        System.out.println("Average Rainfall:\t" + average);//Ouput result
    }
}
