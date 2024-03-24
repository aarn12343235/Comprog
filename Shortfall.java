//Written By: Aaron A. Bigno
public class Shortfall{//class name, must be public
  public static void main ( String[] args ){//main method
    short value = 32;//initialization, assingment of a value in a variable
    System.out.println("A short: " +  value);//output
  }
}
/*
    Experiment Results:
 1. Running the program with 'value' equals 32 or 365 works fine.
 2. Changing the value to 35000 with short data type does not run since value exceeds the short data memory.
 3. Changing the data type from short to int compiles the code and runs perfecty fine since int data type holds more memory.
 */