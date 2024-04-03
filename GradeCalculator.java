import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continueProgram = true;
        String choice, continueChoice;
        double quiz, labworks, midtermExam, finalExam, midtermGrade, finalGrade, midtermGradeForFinals;

        do {
            System.out.println("\nGRADING SYSTEM");
            System.out.println("Options:");
            System.out.println("[1] Compute Midterm Grade");
            System.out.println("[2] Compute Final Grade");
            System.out.println("[3] Quit Application");
            System.out.print("Please press [1] or [2] or [3]: ");
            choice = scan.nextLine();

            switch (choice) {
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
                    System.out.println("REMARKS: " + (midtermGrade >= 1.0 && midtermGrade <= 3.9 ? "PASSED" : "FAILED"));
                    break;

                case "2":
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
                        if (midtermGradeForFinals < 0 || midtermGradeForFinals > 3.9) 
                            System.out.println("Inavlid grade. Must be within 0 - 3.9!");
                    } while (midtermGradeForFinals < 0 || midtermGradeForFinals > 3.9);

                    finalGrade = (quiz * 0.20) + (labworks * 0.40) + (finalExam * 0.40);
                    finalGrade = Math.floor((finalGrade + (midtermGradeForFinals * 0.40)) * 10) / 10;
                    System.out.println("Final Grade: " + finalGrade);
                    System.out.println("REMARKS: " + (finalGrade >= 1.0 && finalGrade <= 3.9 ? "PASSED" : "FAILED"));
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
                if (continueChoice.equals("n") || continueChoice.equals("no")) {
                    System.out.println("Byee!");
                    continueProgram = false;
                } 
                else if (continueChoice.equals("y") || continueChoice.equals("yes"))
                    continueProgram = true;
                else
                    System.out.println("Invalid input! Please try again.");
            } while (!(continueChoice.equals("n") || continueChoice.equals("no") || continueChoice.equals("y") || continueChoice.equals("yes")));

        } while (continueProgram);

        scan.close();
    }
}