import api.*;

import java.awt.peer.CanvasPeer;

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
//        return true;
//    }
        if(standarts[0] == HDDStandarts.SATA && standarts[1] == CPUStandarts.INTEL && standarts[2] == RAMStandarts.DDR4) {
            System.out.println("Запущен");
            return true;
        } else {
            System.out.println("Не запустился");
            return false;
        }

//        for(IStandart standart : standarts){
//            if(parts == standarts){
//                System.out.println("Пуск");
//                return true;
//            } else {
//                System.out.println("Выкл");
//                return false;
//            }
//        }
    }
}