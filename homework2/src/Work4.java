import java.util.Arrays;
import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите значение " + (i + 1) + "-го элемента массива");
            array[i] = in.nextInt();
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
            //сортировка пузырьком
            boolean sorted = false;
            int temp = 0;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        sorted = false;
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
            System.out.println("Отсортированный массив: " + Arrays.toString(array));

    }
}
