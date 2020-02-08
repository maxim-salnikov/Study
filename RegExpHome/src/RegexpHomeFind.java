import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpHomeFind {
    public static int findWord(String pat) {
        int count = 0;
        String fileName = "D:/Study/RegExpHome/src/Война и мир.txt";
        Pattern pt = Pattern.compile(pat);
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String text=scanner.nextLine();
                Matcher matcher = pt.matcher(text);
                while (matcher.find()) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();}

        return count;

    }
}

