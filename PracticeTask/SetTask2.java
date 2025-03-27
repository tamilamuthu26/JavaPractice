import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {
    public static void main(String[] args) {

        int[] numbers = {45, 78, 90, 1, 8, 0, 23};
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int num : numbers) {
            linkedHashSet.add(num);
        }

        Set<Integer> treeSet = new TreeSet<>();
        for (int num : numbers) {
            treeSet.add(num);
        }

        System.out.println("LinkedHashSet (Maintains Insertion Order):");
        Iterator<Integer> linkedIterator = linkedHashSet.iterator();
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + " ");
        }

        System.out.println("\n\nTreeSet (Maintains Sorted Order):");
        Iterator<Integer> treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()) {
            System.out.print(treeIterator.next() + " ");
        }
    }
}
