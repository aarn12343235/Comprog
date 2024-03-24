//Written BY: Aaron A. Bigno
public class Trigonometry {//class
    public static void main(String[] args) {//main method
        double sinx, cosx, sumOfSqaures, value;//initialization

        value = 0.5236;//assignment of values
        sinx = Math.sin(value);
        cosx = Math.cos(value);

        sinx = sinx * sinx;//statements and equations
        cosx = cosx * cosx;
        sumOfSqaures = sinx + cosx;

        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sumOfSqaures);//output
    }
}