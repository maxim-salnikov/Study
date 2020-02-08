public class RegexpHomeFindMain {
    public static void main(String[] args) {
        System.out.println("Количество слова война: " + RegexpHomeFind.findWord("\\b[В|в]ойна\\b"));
        System.out.println("Количество слова мир: " + RegexpHomeFind.findWord("\\b[М|м]ир\\b"));
        System.out.println("Количество союза и: " + RegexpHomeFind.findWord("\\bИ|и\\b"));


    }
}

