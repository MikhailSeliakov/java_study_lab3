package lab3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммирования: ");
        int count = scanner.nextInt();
        int sum = 0;
        int numbersFound = 0;
        System.out.println("Числа, удовлетворяющие условию:");
        for (int i = 1; numbersFound < count; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum += i;
                numbersFound++;
            }
        }
        System.out.println("Сумма чисел: " + sum);
    }
    public static void while_loop(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммирования: ");
        int count = scanner.nextInt();
        int sum = 0;
        int numbersFound = 0;
        int i = 1;
        System.out.println("Числа, удовлетворяющие условию:");
        while (numbersFound < count) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum += i;
                numbersFound++;
            }
            i++;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
