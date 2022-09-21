package Homeworks.Lessons6;

public class Homework12 {
    public static void main(String[] args) {
        helloWorld();
    }

    private static void helloWorld() {
        for (int number = 1; number <= 100; number++) {
            if ((number % 5 != 0) && (number % 3 != 0)) {
                System.out.print(" " + number);
            }
            if ((number % 5 == 0) && (number % 3 == 0)) {
                System.out.print(" |HelloWorld|");
            } else {
                if (number % 5 == 0) {
                    System.out.print(" Hello");
                }
                if (number % 3 == 0) {
                    System.out.print(" World");
                }
            }
        }
    }
}