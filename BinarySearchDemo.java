package SearchAndFind;

import java.util.Arrays;
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
	}

	
	/**
	 * 
	 * method to create a random int array of 100 ints - from 1-100
	 */
	private static int[] createNewIntArray() {
		return new Random().ints(100, 1, 100).toArray();
	}

}
