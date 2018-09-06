package java_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
	
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compareTo(Student s) {

		return this.id - s.id;
		// return s.id - this.id;
	}

	public String toString() {
		return "{id>" + id + " " + "Name>" + name + "}";

	}
}

class OrderbyId implements Comparator<Student> {
	public int compare(Student s1, Student s2) {

		return s1.id - s2.id;
	}

	/*public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}

public class ArrayListSortingWithCustomObjects {

	public static void main(String ar[]) {

		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(2, "Baskar"));
		listOfStudents.add(new Student(1, "Arun"));

		Collections.sort(listOfStudents);
		System.out.println("ArrayList After Sorting by Custom Object > " + listOfStudents);

		System.out.println("***********************************************************************");

		Collections.sort(listOfStudents, new OrderbyId());
		System.out.println("ArrayList After Sorting Using Comparator > " + listOfStudents);

	}

}
