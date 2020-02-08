import api.CPUStandarts;
import api.HDDStandarts;
import api.IParts;
import api.IStandart;

public class CPU implements IParts {
    private CPUStandarts standart;

    public CPU(CPUStandarts standart) {
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
//        System.out.println("CPU не совместим");
//        return false;
//    }
}

