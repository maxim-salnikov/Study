import java.util.Scanner;

public class Work1_3 {
    //Ввести число в cmd и перемножить его цифры
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int mult = 1;
        int d = a;
        while (a > 0)  {
            d = a % 10;
            mult *= d;
            a = a / 10;
                    }
        System.out.println(mult);
    }
}
