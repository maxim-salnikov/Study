import java.util.Scanner;

public class Work2_5 {
    //найти НОД и НОК двух натуральных чисел a и b.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-ое натуральное число: ");
        int number1 = in.nextInt();
        System.out.println("Введите 2-ое натуральное число: ");
        int number2 = in.nextInt();
        System.out.println("НОД: " + nod(number1, number2));
        System.out.println("НОК: " + nok(number1, number2));
    }

    public static int nod(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        return n1;
    }
    public static int nok(int a, int b){
        return a / nod(a, b) * b;
    }
}