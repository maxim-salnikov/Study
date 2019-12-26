import java.util.Arrays;
import java.util.Random;

public class Work3_2 {
    public static void main(String[] args) {
        //сортировка пузырьком
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
        //сама сортировка
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
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
