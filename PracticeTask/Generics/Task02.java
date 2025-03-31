import java.util.Arrays;

public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        if (i < 0 || j < 0 || i >= array.length || j >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index positions.");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        swap(numbers, 1, 3);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"apple", "banana", "cherry", "date"};
        swap(words, 0, 2);
        System.out.println(Arrays.toString(words));
    }
}
