package ivlevks;

/**
 * IvlevKS
 */
public class Sort {

    // bubble sorting
    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        return array;
    }

    // insertion sorting
    public static int[] insertionSort(int[] array) {
        for (int out = 1; out < array.length; out++) {
            int temp = array[out];
            int in = out;
            while (in > 0 && array[in-1] >= temp) {
                array[in] = array[in-1];
                in--;
            }
            array[in] = temp;
        }
        return array;
    }

    //selection sorting
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }

}






















