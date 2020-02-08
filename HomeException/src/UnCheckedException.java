public class UnCheckedException {
    public static void main(String[] args) throws Throwable {
       try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception e) {
            System.out.println("Перехват ошибки компиляции");
            try {
                Throwable t1 = new Error();
                throw t1;
            } catch (Error ex) {
                err();
            } finally {
                runtime();
                 }
        }
    }
    private static void runtime() throws RuntimeException {
        throw new RuntimeException("Много ошибок");
    }
    private static void err() throws Error {
        throw new Error("Ошибка");
    }
}






