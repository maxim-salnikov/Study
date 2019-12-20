import java.util.Scanner;

public class Work2_2 {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку Мама мыла раму: ");
        String str2 = in.nextLine();
        System.out.println(str1 == str2);  //false т.к. создается новый объект класса Scaner, который потом считываем
                                            // и записываем в String, а значит str2 - новый объект
    }
}
