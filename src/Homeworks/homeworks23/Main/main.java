package Homeworks.homeworks23.Main;

import Homeworks.homeworks23.Subcategories.individual_entrepreneur.IndividualEntrepreneur;
import Homeworks.homeworks23.Subcategories.legal_face_entrepreneur.LegalFaceEntrepreneur;
import Homeworks.homeworks23.Subcategories.physical_face_entrepreneur.PhysicalFaceEntrepreneur;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        IndividualEntrepreneur ie = new IndividualEntrepreneur(1000);
        ie.getSumm();

        ie.deposit(100);
        ie.getSumm();
        ie.getMoney(100);
        ie.getSumm();


        LegalFaceEntrepreneur lfe = new LegalFaceEntrepreneur(500);
        lfe.getSumm();

        lfe.deposit(100);
        lfe.getSumm();
        lfe.getMoney(100);
        lfe.getSumm();

        PhysicalFaceEntrepreneur pfe = new PhysicalFaceEntrepreneur(500);
        pfe.getSumm();

        pfe.deposit(100);
        pfe.getSumm();
        pfe.getMoney(100);
        pfe.getSumm();
    }




    /*static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Result operation: " + result);
    }

    public static int getInt() {
        System.out.println("Enter your balance");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("You made a mistake, try again");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Choose an operation");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("You made a mistake, try again");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("You made a mistake, try again");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}
*/
}