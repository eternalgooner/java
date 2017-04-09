package SearchAndFind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author David
 *	class to demo some of the binary search implementations
 *	the collection must be sorted first, before performing the binary search
 *
 *	using binary search is mostly suited when performing on large data sets e.g. 100,00 elements etc
 *
 *	if number is found, method returns the index position at which it's found
 *	if number is not found, it returns a negative number at which the number could be inserted at if so wished
 *	e.g. if -8 returned, the number could be inserted at this position (8) if it were to fit into the sorted order
 */

public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] randomIntArray = createNewIntArray();
		
		//unsorted array - print all elements
		System.out.println("array unsorted");
		for(int i : randomIntArray){
			System.out.print(i + ", ");
		}
		
		//sorted array - print all elements
		Arrays.sort(randomIntArray);
		System.out.println("\narray now sorted");
		for(int i : randomIntArray){
			System.out.print(i + ", ");
		}
		
		//search for number 77
		int searchFor = 77;
		int notInArray = 100;
		int found = Arrays.binarySearch(randomIntArray, searchFor);
		int notFound = Arrays.binarySearch(randomIntArray, notInArray);
		System.out.println("\nlooking for number " + searchFor + ", found at position: " + found);
		System.out.println("\nlooking for number " + notInArray + ", found at position: " + notFound);
		
		//create ArrayList of person object
		List<Person> personList = createPersonArrayList();
		Person david = personList.get(0);
		
		//print object in current position (no sort)
		for(Person person : personList){
			System.out.print(person.getName() + ": salary = " + person.getSalary() + ", ");
		}
		
		System.out.println();
		Collections.sort(personList);
		//print object in sorted position
		for(Person person : personList){
			System.out.print(person.getName() + ": salary = " + person.getSalary() + ", ");
		}
		
		int foundAtIndex = Collections.binarySearch(personList, david);
		System.out.println("\n" + david.getName() + " was found at position: " + foundAtIndex + " after sorting");
	}

	
	private static List<Person> createPersonArrayList() {
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("david", 35, 33_000, "sales"));
		personList.add(new Person("ste", 38, 34_000, "waste"));
		personList.add(new Person("kev", 34, 13_000, "sport"));
		personList.add(new Person("lin", 42, 23_000, "finance"));
		personList.add(new Person("john", 22, 33_500, "banking"));
		personList.add(new Person("eoin", 25, 33_200, "tech"));
		personList.add(new Person("mary", 55, 38_000, "IT"));
		personList.add(new Person("sue", 45, 83_000, "sales"));
		personList.add(new Person("fay", 15, 73_000, "sales"));
		personList.add(new Person("ellen", 25, 133_000, "sales"));
		return personList;
	}


	/**
	 * 
	 * method to create a random int array of 100 ints - from 1-100
	 */
	private static int[] createNewIntArray() {
		return new Random().ints(100, 1, 100).toArray();
	}

}
