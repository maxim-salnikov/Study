import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Calculate implements ICalculate {
    @Override
    @Version(info = "2.0.0")
    public float plus(float a1, float b1) {
        float sum = a1 + b1;
        return sum;
    }
    @Override
    public float minus(float a2, float b2) {
        float min = a2 - b2;
        return min;
    }
    @Override
    public float mult(float a3, float b3) {
        float m = a3 * b3;
        return m;
    }

    @Override
    public float del(float a4, float b4) {
        float d = a4 / b4;
        return d;
    }
}
