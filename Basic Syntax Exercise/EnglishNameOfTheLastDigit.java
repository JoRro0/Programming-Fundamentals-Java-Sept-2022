package basicSyntaxExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean noMoreNum = false;


        while (true) {
            int currentNum = num % 10;

            if (currentNum == 0) {
                System.out.println("zero");
            } else if (currentNum == 1) {
                System.out.println("one");
            } else if (currentNum == 2) {
                System.out.println("two");
            } else if (currentNum == 3) {
                System.out.println("three");
            } else if (currentNum == 4) {
                System.out.println("four");
            } else if (currentNum == 5) {
                System.out.println("five");
            } else if (currentNum == 6) {
                System.out.println("six");
            } else if (currentNum == 7) {
                System.out.println("seven");
            }else if (currentNum == 8) {
                System.out.println("eight");
            } else if (currentNum == 9) {
                System.out.println("nine");
            } else {
                noMoreNum = true;
                break;
            }
            num = Integer.parseInt(scanner.nextLine());
        }

    }
}
