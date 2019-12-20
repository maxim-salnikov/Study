import java.util.Scanner;

public class Work2_3 {
    //        определить является ли заданное натуральное число простым
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int a = in.nextInt();
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Простое");
        } else {
            System.out.println("Составное");
        }
    }
}
