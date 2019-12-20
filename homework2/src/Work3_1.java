import java.util.Arrays;
import java.util.Random;

public class Work3_1 {
    //Сортировка выбором
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
        //сама сортировка
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
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}