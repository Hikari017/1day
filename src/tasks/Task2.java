package tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 =  Integer.parseInt(scanner.nextLine());

        scanner.close();

        float average = (number1 + number2) / 2.0f;

        System.out.println(average);

    }
}
