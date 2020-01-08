import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.METHOD)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD}) //показывает в каком месте ее можно использовать
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    String info() default "1.0.0";
    }
