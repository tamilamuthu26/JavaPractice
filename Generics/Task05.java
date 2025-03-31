 
public class GenericsBoundedType {
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Max of 10 and 20: " + max(10, 20));
        System.out.println("Max of 5.5 and 2.3: " + max(5.5, 2.3));
        System.out.println("Max of 'apple' and 'banana': " + max("apple", "banana"));
    }
}
