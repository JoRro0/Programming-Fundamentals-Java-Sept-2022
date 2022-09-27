package basicSyntaxExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String personType = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;

        if (personType.equals("Students")){
            if (weekDay.equals("Friday")){
                price = 8.45;
                totalPrice = price * people;
            } else if (weekDay.equals("Saturday")) {
                price = 9.80;
                totalPrice = price * people;
            } else if (weekDay.equals("Sunday")) {
                price = 10.46;
                totalPrice = price * people;

            }
            if (people >= 30) {
                totalPrice = totalPrice - (totalPrice * 0.15);
            }

        } else if (personType.equals("Business")) {
            if (weekDay.equals("Friday")){
                price = 10.90;
                totalPrice = price * people;
            } else if (weekDay.equals("Saturday")) {
                price = 15.60;
                totalPrice = price * people;

            } else if (weekDay.equals("Sunday")) {
                price = 16;
                totalPrice = price * people;

            }
            if (people >=100) {
                totalPrice = totalPrice - (price * 10);
            }
            
        } else if (personType.equals("Regular")) {
            if (weekDay.equals("Friday")){
                price = 15;
                totalPrice = price * people;
            } else if (weekDay.equals("Saturday")) {
                price = 20;
                totalPrice = price * people;

            } else if (weekDay.equals("Sunday")) {
                price = 22.50;
                totalPrice = price * people;

            }
            if (people >= 10 && people <= 20){
                totalPrice = totalPrice - (totalPrice * 0.05);
            }
            
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
