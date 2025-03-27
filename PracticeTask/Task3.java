
package PracticeTask;
import java.util.*;
import java.util.stream.Collectors;

public class Task3{
public static void main(String[] args){

List<Integer> li =  new ArrayList<>(List.of(1,3,5,6,4,1,3));

Set<Integer> s = li.stream()
			.collect(Collectors.groupingBy(e-> e, Collectors.counting()))
			.entrySet().stream()
			.filter(entry -> entry.getValue() > 1)
			.map(Map.Entry::getKey)
			.collect(Collectors.toSet());

System.out.println(s);
}

}