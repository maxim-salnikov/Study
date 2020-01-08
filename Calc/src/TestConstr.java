import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestConstr {
    public static void main(String[] args) {
        Constructor<?>[] constructors = Calculate.class.getConstructors();

        for(Constructor<?> constructor : constructors) {
            Version annotation = constructor.getAnnotation(Version.class);
            if(annotation != null){
                System.out.println(annotation.info());
            }
        }

//        for(Method method) {
//            Version annotation = constructor.getAnnotation(Version.class);
//            if(annotation != null){
//                System.out.println(annotation.info());
//            }
//        }

        Method[] methods = Calculate.class.getMethods();
    }
}
