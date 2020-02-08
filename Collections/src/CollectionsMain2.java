
import java.util.HashSet;
import java.util.Set;

public class CollectionsMain2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("2");
        set.add("1");
        set.add("01");
        set.add("01");

        for (String s : set) {
            System.out.println(s);
        }

    }
}
