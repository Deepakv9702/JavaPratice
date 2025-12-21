package comp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingPractice {
	
	
	public static void main(String[] args) {
		Integer[] arr = {2,3,1,7,4};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		

//		List<Integer>list = new ArrayList<>(Arrays.asList(arr));
//		Collections.sort(list);
//		System.out.println(list);
		
		
		Student[] students = {
				new Student(101,"dee", 200),new Student(105,"nani", 500),new Student(106,"deepak", 300),
				new Student(102,"deasdfe", 200),new Student(103,"nasdfasdfaani", 500),new Student(104,"deepaasdfasdfk", 300)
		};
		
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
		

		
		
	}

}
