import java.util.Random;
import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введіть довжину початкового масиву");
        int N = scanner.nextInt();
        System.out.println("Введіть значення нульового елементу нового масиву");
        int myValue = scanner.nextInt();
        int[] myArray = new int[N];
        System.out.print("Масив із " + N + " елементів: ");
        for (int i = 0; i < N; i++) {
            myArray[i] = random.nextInt(100); // заповнюємо масив цілими числами від 0 до 100
            System.out.print(myArray[i] + " ");
        }
        System.out.print("\nЗбільшений на 1 масив: ");
        int[] increaseBy1 = increaseBy1(myArray);
        for (int i = 0; i < increaseBy1.length; i++) System.out.print(increaseBy1[i] + " ");
        System.out.print("\nЗбільшений на 1 масив з додаванням нульового елементу: ");
        int[] increaseBy1AndZeroIndex = increaseBy1AndZeroIndex(myArray, myValue);
        for (int i = 0; i < increaseBy1AndZeroIndex.length; i++) System.out.print(increaseBy1AndZeroIndex[i] + " ");
    }

    static int[] increaseBy1(int[] array) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    static int[] increaseBy1AndZeroIndex(int[] array, int value) {
        int[] result = new int[array.length + 1];
        for (int i = 1; i < result.length; i++) {
            result[i] = array[i - 1];
        }
        result[0] = value;
        return result;
    }

}
