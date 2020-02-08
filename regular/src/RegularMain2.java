
public class RegularMain2 {
    public static void main(String[] args) {
        String[] mails = new String[]{
                "westdragon0@gmail.com"
        };

        for (String mail : mails) {
            System.out.println("Мэил " + mail + ". Результат проверки "+ mail.matches("[a-zA-Z0-9]+@[a-zA-Z0-9.]+"));
        }
    }
}
