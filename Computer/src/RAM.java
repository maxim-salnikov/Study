import api.IParts;
import api.IStandart;

public class RAM implements IParts {
    private IStandart[] standarts;

    public RAM (IStandart[] standarts) {
        this.standarts = standarts;
    }

    @Override
    public IStandart[] getStandarts() {
        return standarts;
    }

    @Override
    public boolean compare() {
        return true;
    }

    @Override
    public boolean test() {
        return true;
    }
}
