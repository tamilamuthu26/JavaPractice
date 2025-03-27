import java.util.Map;
import java.util.TreeMap;

public class PersonHeightMap {
    public static void main(String[] args) {
        TreeMap<String, Double> personMap = new TreeMap<>();
        personMap.put("Bob", 6.0);
        personMap.put("Alice", 5.6);
        personMap.put("Charlie", 5.9);

        personMap.remove("Charlie");

        for (Map.Entry<String, Double> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
