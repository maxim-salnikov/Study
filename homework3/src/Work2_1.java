public class Work2_1 {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2 = "Мама" + "мыла" + "раму";
        System.out.println(str1 == str2); //false, т.к. оператор + конкатенирует 3 строки, следовательно в str2 новый объект
    }
}
