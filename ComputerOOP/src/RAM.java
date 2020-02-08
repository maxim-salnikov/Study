import api.HDDStandarts;
import api.IParts;
import api.IStandart;
import api.RAMStandarts;

public class RAM implements IParts {
    private RAMStandarts standart;

    public RAM (RAMStandarts standart) {
        this.standart = standart;
    }

    @Override
    public IStandart getStandart() {
        return standart;
    }

//    @Override
//    public boolean compare(IStandart [] standarts) {
//        for (IStandart [] standart : standarts) {
//            if (R == standart) {
//                return true;
//            }
//        }
//        System.out.println("RAM не совместим");
//        return false;
//    }
}
