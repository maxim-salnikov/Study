import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class HomeException {
    public static void main(String[] args) throws CheckException, IOException {
        double i;
        double j;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        try {i = scanner.nextDouble();
         System.out.println("Введите делитель");
            j = scanner.nextDouble();
            checkEx(j);
            HomeException2.checkEx(j);
            System.out.println("Результат деления: " + i / j);
        } catch (InputMismatchException ex) {
            HomeException3.ioException();
    }
    }
    public static double checkEx(double s) throws CheckException {
      if(s == 0)
          throw new CheckException("Деление на ноль не допустимо! ");
       return s;

    }
}
