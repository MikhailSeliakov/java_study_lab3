package lab3;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        char[] charArray = new char[size];
        char startChar = 'а';
        for (int i = 0; i < size; i++) {
            charArray[i] = (char) (startChar + 2 * i);
        }
        System.out.println("Массив в прямом порядке:");
        System.out.println(Arrays.toString(charArray));
        System.out.println("Массив в обратном порядке:");
        reverseArray(charArray);
        System.out.println(Arrays.toString(charArray));
    }
    private static void reverseArray(char[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
