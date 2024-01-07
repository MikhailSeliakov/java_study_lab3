package lab3;

public class Task8 {
    public static void main(String[] args) {
        char[] charArray = new char[10];
        char currentChar = 'A';
        for (int i = 0; i < charArray.length; i++) {
            if (isConsonant(currentChar)) {
                charArray[i] = currentChar;
                currentChar++;
            } else {
                currentChar++;
                i--;
            }
        }
        System.out.println("Содержимое массива:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
    private static boolean isConsonant(char ch) {
        return ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U';
    }
}
