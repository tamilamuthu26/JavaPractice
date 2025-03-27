import java.util.*;

public class MapOperations {
    public static void main(String[] args) {
        Map<Integer, String> cityMap = new HashMap<>();
        cityMap.put(3, "New York");
        cityMap.put(1, "London");
        cityMap.put(2, "Tokyo");
        cityMap.put(5, "Paris");
        cityMap.put(4, "Berlin");

        int searchKey = 2;
        String searchValue = "Tokyo";

        System.out.println("Key " + searchKey + " exists: " + cityMap.containsKey(searchKey));
        System.out.println("Value '" + searchValue + "' exists: " + cityMap.containsValue(searchValue));

        for (Map.Entry<Integer, String> entry : cityMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        TreeMap<Integer, String> sortedMap = new TreeMap<>(Comparator.naturalOrder());
        sortedMap.putAll(cityMap);
        System.out.println("Sorted Map: " + sortedMap);

        cityMap.clear();
        System.out.println("Map after deletion: " + cityMap);
    }
}
