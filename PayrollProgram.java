//Written By: Aaron A. Bigno
public class PayrollProgram{  //class name, must be public
  public static void main ( String[] args )  {//main method
    long   hoursWorked;
    double payRate, taxRate;
    
    hoursWorked = 40;    //Initialization and assignment of variables
    payRate = 10.0;
    taxRate = 0.10;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );//outputs amount 
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );//outputs tax
  }
}
/*
    Experiment Results
    1. Removing one of the declarations results in error
    2. Removing the initialization cannot compile the program
 */