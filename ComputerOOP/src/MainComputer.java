import api.*;

public class MainComputer {
    public static void main(String[] args) {
        IStandart[] standarts = new IStandart[3];
        standarts[0] = HDDStandarts.SATA;
        standarts[1] = CPUStandarts.INTEL;
        standarts[2] = RAMStandarts.DDR4;

        HDD hdd = new HDD(HDDStandarts.SATA);
        CPU cpu = new CPU(CPUStandarts.INTEL);
        RAM ram = new RAM(RAMStandarts.DDR4);
        IParts[] parts = new IParts[3];
        parts[0] = hdd;
        parts[1] = cpu;
        parts[2] = ram;
        Computer computer = new Computer(parts, standarts);
        computer.start();
    }
}
