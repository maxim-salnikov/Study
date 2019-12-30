import java.util.Arrays;
import java.util.Random;

public class Work1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        //
        int[] selection = selectionSort(array);
        System.out.println("Сортировка выбором: " + Arrays.toString(selection));
        //
        int[] bubble = bubbleSort(array);
        System.out.println("Сортировка пузырьком: " + Arrays.toString(bubble));
        //
        int[] cocktail = cocktailSort(array);
        System.out.println("Шейкерная сортировка: " + Arrays.toString(cocktail));
        //
        int[] insertion = insertionSort(array);
        System.out.println("Сортировка включением: " + Arrays.toString(insertion));
        //
        int[] merge = mergeSort(array, 0, array.length - 1);
        System.out.println("Сортировка слиянием: " + Arrays.toString(merge));
        //
        int[] q = quick(array, 0, array.length - 1);
        System.out.println("Быстрая сортировка: " + Arrays.toString(q));
    }
    public static int[] selectionSort(int[] arr1) {
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            int min = arr1[i];
            int imin = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < min) {
                    min = arr1[j];
                    imin = j;
                }
            }
            if (i != imin) {
                temp = arr1[i];
                arr1[i] = arr1[imin];
                arr1[imin] = temp;
            }
        }
        return arr1;
    }
    //сортировка пузырьком
    public static int[] bubbleSort(int[] arr2) {
        boolean sorted = false;
        int temp = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr2.length - 1; i++) {
                if(arr2[i] > arr2[i+1]) {
                    sorted = false;
                    temp = arr2[i];
                    arr2[i] = arr2[i+1];
                    arr2[i+1] = temp;
                }
            }
        }
        return arr2;
    }
    //шейкерная
    public static int[] cocktailSort(int[] arr3) {
        int temp = 0;
        int left = 0;
        int right = arr3.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (arr3[i] > arr3[i + 1]) {
                    temp = arr3[i];
                    arr3[i] = arr3[i + 1];
                    arr3[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr3[i] < arr3[i-1]) {
                    temp = arr3[i];
                    arr3[i] = arr3[i - 1];
                    arr3[i - 1] = temp;
                }
            }
            left++;
        } while (left < right);
        return arr3;
    }
    //включением
    public static int[] insertionSort (int[] arr4) {
        for (int left = 0; left < arr4.length; left++) {
            // Вытаскиваем значение элемента
            int value = arr4[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < arr4[i]) {
                    arr4[i + 1] = arr4[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            arr4[i + 1] = value;
        }
        return arr4;
    }
    //слиянием
    public static int[] mergeSort(int[] arr5, int left, int right){
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)){
            mergeSort(arr5, left, delimiter - 1);
            mergeSort(arr5, delimiter, right);
        }
        int[] buffer = new int [right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++){
            if (delimiter > right || arr5[cursor] > arr5[delimiter]) {
                buffer[i] = arr5[cursor];
                cursor ++;
            } else {
                buffer[i] = arr5[delimiter];
                delimiter ++;
            }
        }
        System.arraycopy(buffer, 0, arr5, left, buffer.length);
        return arr5;
    }
    //быстрая
    public static int[] quick(int[] arr6, int left, int right) {
        int left1 = left;
        int right1 = right;
        int middle = arr6[(left1 + right1) / 2];
        do {
            while (arr6[left1] < middle) {
                left1++;
            }
            while (arr6[right1] > middle) {
                right1--;
            }
            if (left1 <= right1) {
                if (left1 < right1) {
                    int temp = arr6[left1];
                    arr6[left1] = arr6[right1];
                    arr6[right1] = temp;
                }
                left1++;
                right1--;
            }
        } while (left1 <= right1);
        if (left1 < right){
            quick(arr6, left1, right);
        }
        if (left < right1){
            quick(arr6, left, right1);
        }
        return arr6;
    }
}
