package lab3;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10, 1, 100);
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив в порядке возрастания:");
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println("Отсортированный массив в порядке убывания:");
        System.out.println(Arrays.toString(array));
    }
    private static int[] generateRandomArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        return array;
    }
    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
