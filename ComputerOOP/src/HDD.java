import api.HDDStandarts;
import api.IParts;
import api.IStandart;

public class HDD implements IParts {
    private HDDStandarts standart;

    public HDD(HDDStandarts standart){
        this.standart = standart;
    }

    @Override
    public IStandart getStandart() {
        return standart;
    }

//    @Override
//    public boolean compare(IParts[] parts) {
//        for (IParts part : parts) {
//            if (part.getStandart() == standart) {
//                return true;
//            }
//        }
//        System.out.println("HDD не совместим");
//        return false;
//    }

//    @Override
//    public boolean test() {
//        return true;
//    }
}
