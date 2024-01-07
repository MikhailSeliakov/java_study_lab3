package lab3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);
        System.out.println("Целые числа от " + min + " до " + max + ":");
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
    public static void while_loop(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);
        System.out.println("Целые числа от " + min + " до " + max + ":");
        int i = min;
        while (i <= max) {
            System.out.println(i);
            i++;
        }
    }
}
