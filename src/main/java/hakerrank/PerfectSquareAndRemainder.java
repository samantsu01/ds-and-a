package hakerrank;

import java.util.Scanner;

public class PerfectSquareAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int perfectSquare = 0;
        int remainder = 0;

        for (int i = 1; i * i <= number; i++) {
            perfectSquare = i * i;
            remainder = number - perfectSquare;
        }

        System.out.println("Largest perfect square less than or equal to " + number + " is " + perfectSquare);
        System.out.println("The remaining part is " + remainder);

        scanner.close();
    }
}

