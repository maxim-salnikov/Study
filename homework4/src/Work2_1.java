import java.util.Scanner;

public class Work2_1 {
    //найти наибольшую цифру натурального числа
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int a = in.nextInt();
        int max = a % 10;
        a /= 10;
        while (a > 0) {
            if (a % 10 > max) {
                max = a % 10;
            }
            a /= 10;
        }
        System.out.println("Наибольшая цифра: " + max);
    }
}
