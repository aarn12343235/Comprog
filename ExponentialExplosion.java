//Written By: Aaron A. Bigno
public class ExponentialExplosion{//class name, must be public
  public static void main ( String[] args ){//main method
    double value = 32;//initialization and assignment of value
    System.out.println("e to the power value: " +  Math.exp( value ) );//outputs the exponential value
    //uses math function
  }
}
/*
    Experiment Results:
    1. Changing the value to a higher number results in a out of bounds error since double data type does not hold too much memory
 */