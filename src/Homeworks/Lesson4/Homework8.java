package Homeworks.Lesson4;

public class Homework8 {
    static int minNumberPrint(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        } else {
            return number1;
        }
    }

    public static void main(String[] args) {
        System.out.println(minNumberPrint(7, 3));
    }
}
