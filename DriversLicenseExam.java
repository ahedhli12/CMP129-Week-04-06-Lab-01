import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DriversLicenseExam {
    private static final char[] ANSWER_KEY = {
        'B', 'D', 'A', 'A', 'C',
        'A', 'B', 'A', 'C', 'D',
        'B', 'C', 'D', 'A', 'D',
        'C', 'C', 'B', 'D', 'A'
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] studentAnswers = new char[ANSWER_KEY.length];

        System.out.println("Drivers License Exam Checker");
        System.out.println("Enter the student's answers for the " + ANSWER_KEY.length + " questions.");
        System.out.println("Use A, B, C, or D for each answer.");

        for (int i = 0; i < ANSWER_KEY.length; i++) {
            studentAnswers[i] = promptAnswer(scanner, i + 1);
        }

        scanner.close();

        int correctCount = countCorrectAnswers(studentAnswers);
        int incorrectCount = ANSWER_KEY.length - correctCount;
        boolean passed = correctCount >= 15;

        System.out.println();
        System.out.println("Exam Results");
        System.out.println("----------------");
        System.out.println("Correct answers: " + correctCount);
        System.out.println("Incorrect answers: " + incorrectCount);
        System.out.println(passed ? "Status: Passed" : "Status: Failed");

        if (incorrectCount > 0) {
            printMissedQuestions(studentAnswers);
        }
    }

    private static char promptAnswer(Scanner scanner, int questionNumber) {
        while (true) {
            System.out.print("Question " + questionNumber + " answer (A, B, C, D): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Please enter A, B, C, or D.");
                continue;
            }

            char answer = Character.toUpperCase(input.charAt(0));
            if (answer >= 'A' && answer <= 'D' && input.length() == 1) {
                return answer;
            }

            System.out.println("Invalid answer. Please enter only A, B, C, or D.");
        }
    }

    private static int countCorrectAnswers(char[] studentAnswers) {
        int correct = 0;
        for (int i = 0; i < ANSWER_KEY.length; i++) {
            if (studentAnswers[i] == ANSWER_KEY[i]) {
                correct++;
            }
        }
        return correct;
    }

    private static void printMissedQuestions(char[] studentAnswers) {
        System.out.println();
        System.out.println("Missed questions:");
        for (int i = 0; i < ANSWER_KEY.length; i++) {
            if (studentAnswers[i] != ANSWER_KEY[i]) {
                System.out.println(" Question " + (i + 1) + ": student answered "
                    + studentAnswers[i] + ", correct answer is " + ANSWER_KEY[i]);
            }
        }
    }
}

