import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);

        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 3, 4, 5, 6, 7);

        boolean areEqual = list1.equals(list2);
        System.out.println("Are lists equal? " + areEqual);

        List<Integer> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined List: " + joinedList);

        List<Integer> clonedList = new ArrayList<>(list1);
        System.out.println("Cloned List: " + clonedList);
    }
}
