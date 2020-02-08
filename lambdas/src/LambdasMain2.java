public class LambdasMain2 {
    public static void main(String[] args) {
        FuncInterface2 func = (b, c) -> b + c;

        System.out.println(func.plus(1, 5));

    }
}
