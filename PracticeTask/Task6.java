package PracticeTask;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6{
public static void main(String[] args){
List<Integer> li = new ArrayList<>(List.of(1,2,4,5,8,9));
int k =2;

Queue<Integer> queue= new LinkedList<>(li);
for(int i = 0 ; i< k ; i++){
	queue.add(queue.poll());
}

System.out.println("Before rotate : " + li);
System.out.println("After rotate : " + new ArrayList<>(queue));


}
}
