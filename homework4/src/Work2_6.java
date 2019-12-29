import java.util.Scanner;

public class Work2_6 {
    //найти количество различных цифр у заданного натурального числа.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int number1 = in.nextInt();
        int number2 = number1;
        int c1 = 0;
        int c2 = 0;
        int count = 0;
        int dif = 0;
        for (int i = 1; number1 > 0; number1 /= 10) {
            c1 = number1 % 10;
            count = 0;
            number2 = number1;
            for (int j = 1; number2 > 0; number2 /= 10) {
                c2 = number2 % 10;
                if (c1 == c2) {
                    count++;
                }
            }
            if (count < 2) {
                dif++;
            }
        }
        System.out.println("Количество различных цифр: " + dif);
    }
}
