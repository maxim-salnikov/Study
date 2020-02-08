public class LambdasMain {
    public static void main(String[] args) {
        AnonInterface anon = new AnonInterface() {
            @Override
            public void tukTuk() {
                System.out.println("стучу в дверь");
            }

            @Override
            public String getName() {
                return "Меня зовут ....";
            }
        };

        FuncInterface realisation = () -> 2;

        System.out.println(realisation.getValue());

        System.out.println(anon);
        System.out.println(realisation);

        anon.tukTuk();
        System.out.println(anon.getName());
    }
}
