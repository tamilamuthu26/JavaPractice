import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberUtils {
    public static <T extends Number> Map<String, Integer> sumEvenOdd(List<T> numbers) {
        int evenSum = sumByCondition(numbers, n -> n.intValue() % 2 == 0);
        int oddSum = sumByCondition(numbers, n -> n.intValue() % 2 != 0);
        return Map.of("EvenSum", evenSum, "OddSum", oddSum);
    }

    private static <T extends Number> int sumByCondition(List<T> numbers, Predicate<T> condition) {
        return numbers.stream().filter(condition).mapToInt(Number::intValue).sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, Integer> result = sumEvenOdd(numbers);
        System.out.println("Even Sum: " + result.get("EvenSum"));
        System.out.println("Odd Sum: " + result.get("OddSum"));
    }
}
