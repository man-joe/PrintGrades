/*
Write a program that uses a while loop to prompt the user
to enter any number of exam scores
and the resulting program will print out the grade, A, B, C, D or F.

If you're finished:
Modify your program to print + or - after the grade.
A+ 97 to 100
A 94 to 96
A- 90 to 93
B+ 87 to 89
B 84 to 86
B- 80 to 83
C+ 77 to 79
C 74 to 76
C- 70 to 73
D 60 to 69
Go back to School if you get below 60



You can convert a string to an integer as follows"

String input = "99";
int score = Integer.parseInt(input);
 */

import java.util.Scanner;

public class PrintGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        int exam_score;
        String y_or_n;

        do{
            System.out.print("Enter an exam score: ");
            exam_score = sc.nextInt();
            System.out.println();

            if(exam_score >= 97 && exam_score <=100)
                System.out.println("Good Job. Your grade is A+");
            else if(exam_score >= 94 && exam_score <= 96)
                System.out.println("Good Job. Your grade is A");
            else if(exam_score >= 90 && exam_score <= 93)
                System.out.println("Good Job. Your grade is A-");
            else if(exam_score >= 87 && exam_score <= 89)
                System.out.println("Good Job. Your grade is B+");
            else if(exam_score >= 84 && exam_score <= 86)
                System.out.println("Good Job. Your grade is B");
            else if(exam_score >= 80 && exam_score <= 83)
                System.out.println("Good Job. Your grade is B-");
            else if(exam_score >= 77 && exam_score <= 79)
                System.out.println("Good Job. Your grade is C+");
            else if(exam_score >= 74 && exam_score <= 76)
                System.out.println("Good Job. Your grade is C");
            else if(exam_score >= 70 && exam_score <= 73)
                System.out.println("Good Job. Your grade is C-");
            else if(exam_score >= 60 && exam_score <= 69)
                System.out.println("Good Job. Your grade is D");
            else if(exam_score >= 0 && exam_score < 60)
                System.out.println("Go back to School if you get below 60");
            else
                System.out.println("Bad Input.");

            System.out.print("Do you want enter another score(Y/N)? ");
            y_or_n = sc.next();
            if(y_or_n.toLowerCase().equals("y"))
                cont = true;
            else if(y_or_n.toLowerCase().equals("n"))
                cont = false;

        } while(cont);

    }
}
