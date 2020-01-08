import api.CPUStandarts;
import api.HDDStandarts;
import api.IParts;
import api.IStandart;

public class CPU implements IParts {
    private IStandart[] standarts;

    public CPU(IStandart[] standarts) {
        this.standarts = standarts;
    }

//    @Override
//    public IStandart[] getStandarts() {
//        return standarts;
//    }

    @Override
    public boolean compare() {
        for (IStandart standart : standarts) {
            if (standart == CPUStandarts.INTEL) {
                return true;
            }
        }
        System.out.println("CPU не совместим");
        return false;
    }

//    @Override
//    public boolean test () {
//            return true;
//        }
    }

