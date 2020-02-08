
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMain4 {
    public static void main(String[] args) {
        String urls = "https://tut.byhttp://onliner.byttps://hell";
        Pattern pattern = Pattern.compile("(http|https)://[a-zA-Z]+.([a-zA-Z]{2})");
        Matcher matcher = pattern.matcher(urls);

        Map<String, Integer> protocols = new HashMap<>();
        Map<String, Integer> zones = new HashMap<>();

        while (matcher.find()) {
            incrementer(matcher.group(1), protocols);
            incrementer(matcher.group(2), zones);
        }

        printMap(protocols);
        printMap(zones);
    }

    public static void incrementer(String key, Map<String, Integer> data){
        if(!data.containsKey(key)){
            data.put(key, 1);
        } else {
            data.put(key, data.get(key) + 1);
        }
    }

    public static void printMap(Map data){
        for (Object key : data.keySet()) {
            System.out.println("Key: " + key + " Value: " + data.get(key));
        }
    }
}
