package oopsconcept;

import java.util.*;
/* Program's aim is to use of Array and find it's index which number include in array. */
public class ElementIndexFinder {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number you want element is array : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		System.out.print("Enter the array elements :");
		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.print("Enter the element to find its index : ");
		int target = scanner.nextInt();
		int index = findElementIndex(array, target);
		if (index != -1) {
			System.out.println("Element " + target + " found at index " + index);
		} else {
			System.out.println("Element " + target + " not found in array");
		}
		scanner.close();
	}

	public static int findElementIndex(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

}