package PracticeTask;

import java.util.*;

public class Task1{
	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5));
		System.out.println("Before trimming : "+ nums.size());
		nums.trimToSize();
		System.out.println("After trimming : "+ nums.size());

	}

}

//ensureCapacity(size of the list as per our demand);  -- to change the resizing capacity