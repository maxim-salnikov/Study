import java.util.Scanner;

public class Work2_2 {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку Мама мыла раму: ");
        String str2 = in.nextLine();
        String str2interned = str2.intern();
        System.out.println(str1 == str2interned);  //true, intern идет в пул строк и проверяет есть ли там уже такая строка,
        //если да, он не создает новый объект
    }
}
