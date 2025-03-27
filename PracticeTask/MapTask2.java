import java.util.Map;
import java.util.TreeMap;

public class TreeMapCopy {
    public static void main(String[] args) {
        TreeMap<Integer, String> originalMap = new TreeMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");
        originalMap.put(3, "Cherry");
        originalMap.put(4, "Date");

        TreeMap<Integer, String> copiedMap = new TreeMap<>(originalMap);

        System.out.println("Original TreeMap: " + originalMap);
        System.out.println("Copied TreeMap: " + copiedMap);
    }
}
