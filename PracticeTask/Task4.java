package PracticeTask;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task4{
public static void main(String[] args){

List<Integer> l1= new ArrayList<>(List.of(1,2,3,4,5,6));

List<Integer> l2= new ArrayList<>(List.of(7,8,9,10,11,2,3));

Stream<Integer> s1= l1.stream();
Stream<Integer> s2= l2.stream();

Stream<Integer>  mergedStream = Stream.concat(s1,s2).distinct();

mergedStream.forEach(System.out::println);

}

}


