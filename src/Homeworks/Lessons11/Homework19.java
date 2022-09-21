
package Homeworks.Lessons11;
import java.util.*;
public class Homework19 {


    public static void main(String args[]) {

        ArrayList al = new ArrayList();
        System.out.println("First size: " + al.size());

        // Добавляем элементы в ArrayList
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
        al.add("6");
        al.add(1, "A2");
        System.out.println("LAST al AFTER: " + al.size());

        // Выводим на экран элементы ArrayList
        System.out.println("MAIN al: " + al);

        display("Tom", 34);
        display("Bob", 28);
        display("Sam", 23);
    }
    static void display(String name, int age){

        System.out.println(name);
        System.out.println(age);
    }
}

