import java.util.Random;

public class Work1 {
    public static void main(String[] args) {
        //орел и решка
        int orel=0;
        int reshka=0;
        int a = 0;
        for (int i = 0; i < 1000; i++)
        {
            Random rnd = new Random();
            a = rnd.nextInt(2);
            if(a == 1) {
                orel++;
            }
            else {
                    reshka++;
                }
        }
        System.out.println("Орел: " + orel + " раз");
        System.out.println("Решка: " + reshka + " раз");
    }
}
