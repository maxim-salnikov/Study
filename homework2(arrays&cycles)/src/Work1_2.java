public class Work1_2 {
    //Ввести в cmd число и найти его факториал
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int factorial = 1;
        for(int i = 1; i <= a; i++){
            factorial *= i;
        }
        System.out.println("Факториал числа " + a + " = " + factorial);
        }
    }