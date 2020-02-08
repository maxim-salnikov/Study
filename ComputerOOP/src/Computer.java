import api.*;

public class Computer {
    private IParts[] parts;
    private IStandart[] standarts;

    public Computer(IParts[] parts, IStandart[] standarts) {
        this.parts = parts;
        this.standarts = standarts;
    }

    public boolean start() {
        boolean result = true;
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].getStandart() == standarts[i]) {
                System.out.println(parts[i].getStandart() + " совместим");
            } else {
                System.out.println(parts[i].getStandart() + " несовместим");
                result = false;
                throw new IllegalArgumentException("Компьютер не запустился");
            }
        }
        if (result){
            System.out.println("Компьютер запустился");
        }
        return result;
    }
}
