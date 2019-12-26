public class Work2_1 {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2 = "Мама" + " мыла" + " раму"; //true т.к. компилятор меняет 3 литерала на 1 строку
        System.out.println(str1 == str2);
    }
}
