package ivlevks;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int array[] = random.ints(10, 0, 100).toArray();

        System.out.print("Начальный массив: ");
        show(array);
        System.out.print("Сортированный массив: ");
        show(Sort.selectionSort(array));
    }

    public static void show(int[] array) {
        Arrays.stream(array).forEach(n -> {
            System.out.print(n + " ");
        });
        System.out.println();
    }
}
