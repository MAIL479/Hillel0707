package Homeworks.Lessons12;


import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        int summa = 100;
        System.out.println("\n" +
                "Welcome to MakronDalns restaurant! You ordered a burger for the price " + summa + " UAH." + " Want to add extra ingredients?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            System.out.println("Please note that when choosing additional ingredients, the price changes.\n" +
                    "Do you agree?");
            answer = scanner.nextLine();
            while (answer.equals("yes")) {
                System.out.println(
                        "Choose additional ingredients \n1 Cheese +15 UAH\n2 Cutlet +25 UAH\n3 Sauce +10 UAH");
                answer = scanner.nextLine();
                if (answer.equals("1") || answer.equals("Cheese")) {
                    summa += 15;
                } else if (answer.equals("2") || answer.equals("Cutlet")) {
                    summa += 25;
                } else if (answer.equals("3") || answer.equals("Sauce")) {
                    summa += 10;
                }
                System.out.println("Great choice! Now the price of a burger " + summa + " UAH." + " Want to add extra ingredients?");
                answer = scanner.nextLine();
            }
        }
        System.out.println("To pay " + summa + " UAH");


    }
}


