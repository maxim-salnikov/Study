import api.HDDStandarts;
import api.IParts;
import api.IStandart;
import api.RAMStandarts;

public class RAM implements IParts {
    private IStandart[] standarts;

    public RAM (IStandart[] standarts) {
        this.standarts = standarts;
    }

//    @Override
//    public IStandart[] getStandarts() {
//        return standarts;
//    }

    @Override
    public boolean compare() {
        for (IStandart standart : standarts) {
            if (standart == RAMStandarts.DDR4) {
                return true;
            }
        }
        System.out.println("RAM не совместима");
        return false;
    }

//    @Override
//    public boolean test() {
//        return true;
//    }
}
