package PracticeTask;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5{
public static void main(String[] args){

List<Integer> li= new ArrayList<>(List.of(1,3,4,6,8));
Set<Integer>  set = new HashSet<>(List.of(2,5,8,9,6,8));

List<Integer> SetToList = set.stream().collect(Collectors.toList());

Set<Integer> ListToSet = li.stream().collect(Collectors.toSet());

System.out.println(SetToList);
System.out.println(ListToSet);


}
}
