
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMain3 {
    public static void main(String[] args) {
        String message = "Мама мыла раму. Мама готовила борщ";
        Pattern pt = Pattern.compile("Мама");
        Matcher matcher = pt.matcher(message);
        while (matcher.find()){
            System.out.println(matcher.start());
        }
    }
}
