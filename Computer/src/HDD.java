import api.HDDStandarts;
import api.IParts;
import api.IStandart;

public class HDD implements IParts {
    private IStandart[] standarts = new IStandart[3];

    public HDD(IStandart[] standarts){
        this.standarts = standarts;
    }

//    @Override
//    public IStandart[] getStandarts() {
//        return standarts;
//    }

    @Override
    public boolean compare() {
        for (IStandart standart : standarts) {
            if (standart == HDDStandarts.SATA) {
                return true;
            }
        }
        System.out.println("HDD не совместим");
        return false;
    }

//    @Override
//    public boolean test() {
//        return true;
//    }
}
