import java.util.Arrays;
import java.util.Random;

public class Work1 {
        public static void main(String[] args) {
            int[] array = new int[10];
            Random rand = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(10);
            }
            System.out.println("Исходный массив:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            //
            selectionSort(array);
            System.out.println("Сортировка выбором: " + Arrays.toString(array));
            //
            bubbleSort(array);
            System.out.println("Сортировка пузырьком: " + Arrays.toString(array));
            //
            сocktailSort(array);
            System.out.println("Шейкерная сортировка: " + Arrays.toString(array));
            //
            insertionSort(array);
            System.out.println("Сортировка включением: " + Arrays.toString(array));

    }
    public static int[] selectionSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int imin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    imin = j;
                }
            }
            if (i != imin) {
                temp = array[i];
                array[i] = array[imin];
                array[imin] = temp;
            }
        }
        return array;
    }
    //сортировка пузырьком
    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]) {
                    sorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }
    //шейкерная
    public static int[] сocktailSort(int[] array) {
        int temp = 0;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i-1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
        } while (left < right);
        return array;
    }
    public static int[] insertionSort (int[] array) {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        return array;
    }

}
