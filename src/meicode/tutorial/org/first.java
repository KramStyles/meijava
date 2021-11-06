package meicode.tutorial.org;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        System.out.println("Type in a name: ");
        String name1 = scanner.next();

        System.out.println("Number: " + number1 + " Name: ".concat(name1));
    }
}
