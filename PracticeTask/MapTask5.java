import java.util.SortedMap;
import java.util.TreeMap;

public class MapRangeExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Cherry");
        map.put(40, "Date");
        map.put(50, "Elderberry");

        int startKey = 20;
        int endKey = 40;

        SortedMap<Integer, String> subMap = map.subMap(startKey, endKey);

        for (Map.Entry<Integer, String> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
