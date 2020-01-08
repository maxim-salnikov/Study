import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float a = in.nextFloat();
        System.out.println("Введите операцию: ");
        char operation = in.next().charAt(0);
        System.out.println("Введите второе число: ");
        float b = in.nextFloat();
        Calculate calc = new Calculate();
        switch (operation) {
            case '+':
                System.out.println("Сумма: " + calc.plus(a, b));
            break;
            case '-':
                System.out.println("Вычитание: " + calc.minus(a, b));
            break;
            case '/':
                System.out.println("Деление: " + calc.del(a, b));
            break;
            case '*':
                System.out.println("Умножение: " + calc.mult(a, b));
            break;
        }
    }
}