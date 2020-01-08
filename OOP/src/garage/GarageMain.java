package garage;

import garage.cars.Mercedes;
import garage.parts.Key;
import garage.parts.Lock;
import garage.parts.api.IKey;
import garage.parts.api.ILock;
import garage.parts.engine.Engine;
import garage.parts.engine.api.FuelType;

public class GarageMain {
    public static void main(String[] args) {
        ILock lock = new Lock("asd");
        IKey key = new Key("asd");
        IKey key2 = new Key("asdы");

        Mercedes mercedes1 = new Mercedes("GL666",
                new Engine(1600, FuelType.PETROL, "WSDOUYSH@^&(@"),
                lock);

        System.out.println("Открываю замок " + lock.open(key));
        System.out.println("Открываю замок " + lock.open(key2));
        System.out.println("Открываю машину " + mercedes1.open(key));
        System.out.println("Открываю машину " + mercedes1.open(key2));
//        Mercedes mercedes2 = new Mercedes("GL666", new NoNameEngine());
    }
}
