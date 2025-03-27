import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteration {
    public static void main(String[] args) {
        Set<String> months = new HashSet<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        System.out.println("Iterating through HashSet:");
        Iterator<String> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIs order preserved? " + (months instanceof HashSet ? "No" : "Yes"));
    }
}
