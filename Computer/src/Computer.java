import api.IParts;
import api.IStandart;

public class Computer {
    private IParts[] parts;
    private IStandart[] standarts;

    public Computer(IParts[] parts, IStandart[] standarts) {
        this.parts = parts;
        this.standarts = standarts;
    }

    public boolean start() {
//        if (parts[0].compare() && parts[1].compare() && parts[3].compare()
//                && parts[0].test() && parts[1].test() && parts[2].test()) {
//            System.out.println("Запущен");
//            return true;
//        } else {
//            return false;
//        }
        return true;
    }
}