import api.*;

public class Computer {
    private IParts[] parts;
    private IStandart[] standarts;

    public Computer(IParts[] parts, IStandart[] standarts) {
        this.parts = parts;
        this.standarts = standarts;
    }

    public boolean start() {
        if (parts[0].compare() && parts[1].compare() && parts[2].compare()) {
            System.out.println("УРА, Запущен");
            return true;
        } else {
            System.out.println("Плак, плак, не запустился");
            return false;
        }
    }
}

        //1 версия
//        if(standarts[0] == HDDStandarts.SATA && standarts[1] == CPUStandarts.INTEL && standarts[2] == RAMStandarts.DDR4) {
//            System.out.println("Запущен");
//            return true;
//        } else {
//            System.out.println("Не запустился");
//            return false;
//        }

        //2 задумка
//        for(IStandart standart : standarts){
//            if(parts == standarts){
//                System.out.println("Пуск");
//                return true;
//            } else {
//                System.out.println("Выкл");
//                return false;
//            }
//        }