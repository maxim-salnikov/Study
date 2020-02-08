import dto.Passport;
import java.util.*;

public class CollectionaMain4 {
    public static void main(String[] args) {
        Passport passport1 = new Passport();
        passport1.setId("MP..123r4");
        passport1.setEffectiveAt(new Date());
        passport1.setFio("Илья Иванович...");

        List<Passport> list = new LinkedList<>();
        list.add(passport1);

        Map<String, Passport> pas = new HashMap<>();
        pas.put(passport1.getId(), passport1);

        pas.get(passport1.getId());
    }
}
