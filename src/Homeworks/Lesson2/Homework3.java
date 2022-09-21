package Homeworks.Lesson2;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Введите число 1");
        Scanner scannernumber = new Scanner(System.in);
        int number = scannernumber.nextInt();
        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }
    }
}


    //Написать программу, в которой создаётся целочисленный
    //массив из 8 случайных чисел из диапозона  [0, 99]
    //и выводит максимальный элемент массива в консоль.

/*public static void arrMax() {
    int max = 0;
    int[] array = new int[8];
    for (int i = 0; i < array.length; i++)  {
        array[i] = (int)  (Math.random()  *  100);
        System.out.println(array[i]  +  "  ");
        if  (array[i] > max)  {
            max  =  array[i];
        }

    }
    System.out.println();
    System.out.println(max);

}*/


