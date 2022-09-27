package basicSyntaxExercise;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int first = 0;
        int second = 0;
        int third = 0;


        if (firstNum >= secondNum && firstNum >= thirdNum) {
            first = firstNum;

        }

        if (secondNum >= firstNum && secondNum >= thirdNum) {
            first = secondNum;

        }
        if (thirdNum >= firstNum && thirdNum >= secondNum) {
            first = thirdNum;

        }

        if (firstNum <= secondNum && firstNum <= thirdNum) {
            third = firstNum;

        }
        if (secondNum <= firstNum && secondNum <= thirdNum) {
            third = secondNum;
            if (secondNum > thirdNum) {
                second = secondNum;
                third = thirdNum;
            } else {
                second = thirdNum;
                third = secondNum;
            }

        }
        if (thirdNum <= firstNum && thirdNum <= secondNum) {
            third = thirdNum;


        }
        if (firstNum != first && firstNum != third) {
            second = firstNum;
        }
        if (secondNum != first && secondNum != third) {
            second = secondNum;
        }
        if (thirdNum != first && thirdNum != third) {
            second = thirdNum;
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


    }
}
