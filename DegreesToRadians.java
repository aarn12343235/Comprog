//Written By: Aaron A. Bigno
public class DegreesToRadians {
    public static void main(String[] args) {
        double sinx, cosx, sumOfSqaures, rad;
        int degrees;//initialization

        degrees = 30;//assignment of values
        
        rad = degrees * Math.PI/180;//converts the degrees to radians
        sinx = Math.sin(rad);
        cosx = Math.cos(rad);
        sinx = sinx * sinx;//statements and equations
        cosx = cosx * cosx;
        sumOfSqaures = sinx + cosx;

        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sumOfSqaures);//output
    }
}
