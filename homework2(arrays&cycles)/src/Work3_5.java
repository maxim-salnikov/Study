import java.util.Arrays;
import java.util.Random;

public class Work3_5 {
    //сортировка слиянием
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random(10);
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        mergeSort(array, 0, array.length-1);
        System.out.println("Отсортированный: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] arr, int left, int right){
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)){
            mergeSort(arr, left, delimiter - 1);
            mergeSort(arr, delimiter, right);
        }
        int[] buffer = new int [right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++){
            if (delimiter > right || arr[cursor] > arr[delimiter]) {
                buffer[i] = arr[cursor];
                cursor ++;
            } else {
                buffer[i] = arr[delimiter];
                delimiter ++;
            }
        }
        System.arraycopy(buffer, 0, arr, left, buffer.length);
    }

}
