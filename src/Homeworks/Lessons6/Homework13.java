package Homeworks.Lessons6;

import java.util.Arrays;
import java.util.Random;

public class Homework13 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int number = 0; number < arr.length; number++) {
            arr[number] = random.nextInt(10) + 10;
        }
        System.out.println(Arrays.toString(arr));

        if (arr.length > 0) {
            double sum = 0;
            for (int formula = 0; formula < arr.length; formula++) {
                sum += arr[formula];
            }
            double average = sum / arr.length;
            System.out.println(average);
        }
    }
}
