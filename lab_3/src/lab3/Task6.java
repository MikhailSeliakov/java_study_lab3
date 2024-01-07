package lab3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Некорректное значение размера массива.");
        } else {
            int[] numbers = new int[size];
            int count = 0;
            for (int i = 2; count < size; i += 5) {
                numbers[count] = i;
                count++;
            }
            System.out.println("Числа, удовлетворяющие условию:");
            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }
}
