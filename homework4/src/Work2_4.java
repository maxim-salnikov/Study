import java.util.Scanner;

public class Work2_4 {
    //найти все простые делители заданного натурального числа
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int number = in.nextInt();
        int divider = 0;
        System.out.println("Простые делители: ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divider++;
                System.out.println(i);
            }
        }
    }
}
