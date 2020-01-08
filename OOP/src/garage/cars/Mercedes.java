package garage.cars;

import garage.cars.api.ACars;
import garage.parts.api.IKey;
import garage.parts.api.ILock;
import garage.parts.engine.api.IEngine;

public class Mercedes extends ACars{
    private String model;
    private IEngine engine;
    private final ILock lock;

    public Mercedes(String model, IEngine engine, ILock lock){
        this.model = model;
        this.engine = engine;
        this.lock = lock;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }

    @Override
    public boolean open(IKey key) {
        return lock.open(key);
    }
}
