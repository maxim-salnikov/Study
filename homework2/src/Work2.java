import java.util.Scanner;

public class Work2 {
    //Все циклы, вывести значения чисел массива. Каждый второй элемент массива.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = in.nextInt();
        int array[] = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите значение " + (i + 1) + "го элемента: " );
            array[i] = in.nextInt();
        }
        int i = 0;
        //do...while
        System.out.println("Цикл do...while:");
        do {
            System.out.println("Значение " + (i + 1) + "-го элемента = " + array[i]);
            i++;
        }
        while (i < array.length);
        //while
        System.out.println("Цикл while:");
        i = 0;
        while (i < array.length) {
            System.out.println("Значение " + (i + 1) + "-го элемента = " + array[i]);
            i++;
        }
        //for
        System.out.println("Цикл for:");
        for (i = 0; i < array.length; i++) {
            System.out.println("Значение " + (i + 1) + "-го элемента = " + array[i]);
        }
        //foreach
        System.out.println("Цикл foreach:");
        for( int k : array){
            System.out.println(k);
        }
        //2.2
        System.out.println("Каждый 2-й элемент массива:");
        for(i = 1; i < array.length; i += 2) {
            System.out.println("Элемент " +  (i + 1) + "-й: " + array[i]);
        }
    }
}
