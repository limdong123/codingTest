package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class List_Collections_sort {
	
	public class Person impelment Comparable<Person>{
		String name;
		int age;
		
		public Person(String name, int age) {
			this.age = age;
			this.name = name;
		}
		
		private void compareTo() {
			// TODO Auto-generated method stub

		}
		
	}
	
	public static void main(String[] args) {
		List<Person> nameList = new ArrayList<>();
		
		nameList.add(new Person("Heo", 28));
		nameList.add(new Person("Choi", 24));
		nameList.add(new Person("Lee", 26));

		
		
		System.out.println("- 정렬 전 " + nameList);
		
		Collections.sort(nameList);
		
		System.out.println("- 정렬 후 " +nameList);
		//result 
//		- 정렬 전 [Heo, Choi, Lee]
//		- 정렬 후 [Choi, Heo, Lee]
		
		
	}

}
