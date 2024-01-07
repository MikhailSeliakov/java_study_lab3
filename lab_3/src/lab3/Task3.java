package lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int count = scanner.nextInt();
        int num1 = 1;
        int num2 = 1;
        System.out.print("Последовательность чисел Фибоначчи: ");
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <= count; i++) {
            int sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }
    }
    public static void while_loop(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int count = scanner.nextInt();
        int num1 = 1;
        int num2 = 1;
        System.out.print("Последовательность чисел Фибоначчи: ");
        System.out.print(num1 + " " + num2 + " ");
        int i = 3;
        while (i <= count) {
            int sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
            i++;
        }
    }
}
