import java.util.Scanner;

public class Work2_2 {
    //является ли число палиндромом
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int a = in.nextInt();
        int b = 0;
        int c = a;
        while (c > 0) {
            b = b * 10 + c % 10;
            c /= 10;
        }
        if (b == a){
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }
    }
}
