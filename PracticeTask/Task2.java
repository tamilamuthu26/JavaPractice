//2. Write a Java program to replace all occurrences of a specified element in an array list with another element.


package PracticeTask;
import java.util.*;
import java.util.stream.Collectors;

public class Task2{
public static void main(String[] args){

int element =  11;
int target = 6;
ArrayList<Integer> nums= new ArrayList<>(List.of(1,2,3,4,5,7,8,3,9,3,1,6,6,0));
List<Integer> results = nums.stream().map(num-> num == target ? element : num).collect(Collectors.toList());
System.out.print(results);

}
}