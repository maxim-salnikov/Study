import java.util.Comparator;

public class myComporator implements Comparator<Passport> {

    @Override
    public int compare(Passport first, Passport second) {
        return first.getId().compareTo((second.getId()));
    }
}
