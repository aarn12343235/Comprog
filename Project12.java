import java.util.Scanner;
public class Project12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continueProgram = true, validInput;
        double quiz, labworks, midtermExam, finalExam, midtermGrade, finalGrade;
        String options, continueChoice;
        
        do {
            System.out.println("\nGRADING SYSTEM");
            System.out.println("Options:");
            System.out.println("[1] Compute Midterm Grade");
            System.out.println("[2] Compute Final Grade");
            System.out.println("[3] Quit Application");
            System.out.print("Please press [1] or [2] or [3]: ");
            options = scan.nextLine();
            
            switch (options) {
                case "1":
                    System.out.println("You choose to calculate your midterm grade.");
                    do {
                        System.out.print("Enter quiz grade: ");
                        quiz = scan.nextDouble();
                        scan.nextLine();

                        if (quiz < 0 || quiz > 3.9) 
                            System.out.println("Invalid input! Grade must be between 0 and 3.9.");
                            
                    } while (quiz < 0 || quiz > 3.9);
    
                    do {
                        System.out.print("Enter lab works grade: ");
                        labworks = scan.nextDouble();
                        scan.nextLine();

                        if (labworks < 0 || labworks > 3.9)
                            System.out.println("Invalid input! Grade must be between 0 and 3.9.");

                    } while (labworks < 0 || labworks > 3.9);

                    do {
                        System.out.print("Enter midterm exam grade: ");
                        midtermExam = scan.nextDouble();
                        scan.nextLine();

                        if (midtermExam < 0 || midtermExam > 3.9)
                            System.out.println("Invalid input! Grade must be between 0 and 3.9.");
                            
                    } while (midtermExam < 0 || midtermExam > 3.9);

                    midtermGrade = Math.floor(((quiz * 0.20) + (labworks * 0.40) + (midtermExam * 0.40)) * 10) / 10;
                    
                    System.out.println("Midterm Grade: " + midtermGrade);

                    if (midtermGrade >= 1.0 && midtermGrade <= 3.9)
                        System.out.println("REMARKS: PASSED");
                    else
                        System.out.println("REMARKS: FAILED");

                    break;

                case "2":
                    double midtermGradeForFinals;

                    System.out.println("You choose to calculate your final grade.");
                    do {
                        System.out.print("Enter quiz grade: ");
                        quiz = scan.nextDouble();
                        scan.nextLine();

                        if (quiz < 0 || quiz > 3.9) 
                            System.out.println("Invalid input! Grade must be between 0 and 3.9.");

                    } while (quiz < 0 || quiz > 3.9);
        
                    do {
                        System.out.print("Enter lab works grade: ");
                        labworks = scan.nextDouble();
                        scan.nextLine();

                        if (labworks < 0 || labworks > 3.9)
                            System.out.println("Invalid input! Grade must be between 0 and 3.9.");
                        
                    } while (labworks < 0 || labworks > 3.9);

                    do {
                        System.out.print("Enter final exam grade: ");
                        finalExam = scan.nextDouble();
                        scan.nextLine();

                        if (finalExam < 0 || finalExam > 3.9)
                            System.out.println("Invalid input! Grade must be between 0 and 3.9.");
                            
                    } while (finalExam < 0 || finalExam > 3.9);

                    do {
                        System.out.print("Enter midterm grade: ");
                        midtermGradeForFinals = scan.nextDouble();
                        scan.nextLine();

                        if (midtermGradeForFinals < 0 || finalExam > 3.9)
                            System.out.println("Inavlid grade. Must be within 0 - 3.9!");
                            
                    } while (midtermGradeForFinals < 0 || midtermGradeForFinals > 3.9);
                        
                    finalGrade = (quiz * 0.20) + (labworks * 0.40) + (finalExam * 0.40);
                    finalGrade = Math.floor((finalGrade + (midtermGradeForFinals * 0.40)) * 10) / 10;

                    System.out.println("Final Grade " + finalGrade);

                    if (finalGrade >= 1.0 && finalGrade <= 3.9)
                        System.out.println("REMARKS: PASSED");
                    else
                        System.out.println("REMARKS: FAILED");

                    break;

                case "3":
                    System.out.println("BYE!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Input!!");
                    break;
            }

            do {
                System.out.println("\nDo you wish to try again? [y, yes]/ [n, no]");
                continueChoice = scan.nextLine().toLowerCase();

                validInput = continueChoice.equals("n") || continueChoice.equals("no") ||
                continueChoice.equals("y") || continueChoice.equals("yes");

                if (!validInput) 
                    System.out.println("Invalid input! Please try again.");
                else if (continueChoice.equals("n") || continueChoice.equals("no")) {
                    System.out.println("Byee!");
                    continueProgram = false;
                } 
                else 
                    continueProgram = true;
            } while (!validInput);

        } while (continueProgram);

        scan.close();
    }
}