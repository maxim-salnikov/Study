import java.util.Arrays;
import java.util.Random;

public class Work3_6 {
    //быстрая сортировка
    public static void main(String[] args) {
        int temp;
        int[] array = new int[10];
        Random rand = new Random(10);
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        quick(array, 0, array.length-1);
        System.out.println("Отсортированный: " + Arrays.toString(array));
    }

    public static void quick(int[] arr, int left, int right) {
        int left1 = left;
        int right1 = right;
        int middle = arr[(left1 + right1) / 2];
        do {
            while (arr[left1] < middle) {
                left1++;
            }
            while (arr[right1] > middle) {
                right1--;
            }
            if (left1 <= right1) {
                if (left1 < right1) {
                    int temp = arr[left1];
                    arr[left1] = arr[right1];
                    arr[right1] = temp;
                }
                left1++;
                right1--;
            }
        } while (left1 <= right1);
        if (left1 < right){
            quick(arr, left1, right);
        }
        if (left < right1){
            quick(arr, left, right1);
        }
    }
}
