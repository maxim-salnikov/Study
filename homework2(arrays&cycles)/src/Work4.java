import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random(10);
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
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
        //удаление дубликатов
        int dubl = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i-1] == array[i]){
                dubl++;
            }
        }
        int[] arraySorted = new int[array.length - dubl];
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i] == array[i-1]){
                arraySorted[index] = array[i];
            }
            if(array[i] != array[i-1]){
                index++;
                arraySorted[index] = array[i];
            }
        }
        System.out.println("Массив без дубликатов: " + Arrays.toString(arraySorted));
    }
}
