import java.util.Collection;
import java.util.function.Predicate;

public class CollectionUtils {
    public static <T> long countByCondition(Collection<T> collection, Predicate<T> condition) {
        return collection.stream().filter(condition).count();
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = java.util.List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Odd numbers count: " + countByCondition(numbers, n -> n % 2 != 0));
        System.out.println("Prime numbers count: " + countByCondition(numbers, CollectionUtils::isPrime));
        System.out.println("Palindrome numbers count: " + countByCondition(numbers, CollectionUtils::isPalindrome));
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static boolean isPalindrome(int n) {
        String str = String.valueOf(n);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
