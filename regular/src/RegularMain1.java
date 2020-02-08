
public class RegularMain1 {
    public static void main(String[] args) {
        String str = "Test     string for split";
        String[] words = str.split(" ");
        for (String word : words){
            System.out.println(word + " ");
        }
    }
}
