import api.HDDStandarts;
import api.IParts;
import api.IStandart;

public class HDD implements IParts {
    private IStandart[] standarts;

    public HDD(IStandart[] standarts){
        this.standarts = standarts;
    }

    @Override
    public IStandart[] getStandarts() {
        return standarts;
    }

//    @Override
//    public boolean compare() {
//        return true;
//    }

    @Override
    public boolean test() {
        return true;
    }
}
