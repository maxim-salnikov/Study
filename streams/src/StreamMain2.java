import java.util.Random;
import java.util.stream.Stream;

public class StreamMain2 {
    public static void main(String[] args) {
        long count = Stream
                .generate(() -> new Random().nextInt(255))
                .limit(1000)
                .filter(intValue -> intValue != 0)
                .map(intValue -> (char) intValue.intValue())
                .peek((System.out::print))
                .count();
        System.out.println();
    }
}
