package lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String dayName = scanner.nextLine().toLowerCase();
        int dayNumber;
        if (dayName.equals("понедельник")) {
            dayNumber = 1;
        } else if (dayName.equals("вторник")) {
            dayNumber = 2;
        } else if (dayName.equals("среда")) {
            dayNumber = 3;
        } else if (dayName.equals("четверг")) {
            dayNumber = 4;
        } else if (dayName.equals("пятница")) {
            dayNumber = 5;
        } else if (dayName.equals("суббота")) {
            dayNumber = 6;
        } else if (dayName.equals("воскресенье")) {
            dayNumber = 7;
        } else {
            System.out.println("Такого дня нет");
            return;
        }
        System.out.println("Порядковый номер дня: " + dayNumber);
    }
    public static void switch_case(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String dayName = scanner.nextLine().toLowerCase();
        int dayNumber;
        switch (dayName) {
            case "понедельник" -> dayNumber = 1;
            case "вторник" -> dayNumber = 2;
            case "среда" -> dayNumber = 3;
            case "четверг" -> dayNumber = 4;
            case "пятница" -> dayNumber = 5;
            case "суббота" -> dayNumber = 6;
            case "воскресенье" -> dayNumber = 7;
            default -> {
                System.out.println("Такого дня нет");
                return;
            }
        }
        System.out.println("Порядковый номер дня: " + dayNumber);
    }
}
