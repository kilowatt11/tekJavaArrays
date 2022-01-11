package com.pnc;

import java.util.Arrays;
import java.util.Random;

public class Runner {
	public static void main(String[] args) {
//		slide33();
//		slide43();
//		exercise1();
//		exercise2();
//		exercise3();
//		exercise4();
//		exercise5();
//		exercise6();
//		exercise7();
//		exercise8();
		exercise9();
		exercise10();
	}

	private static void slide33() {
		System.out.println("Slide 32/33");
		Random r = new Random();
		int[] deck = new int[52];

		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		// generate number 1-52 (random.nextInt(max + min) + min)
		int drawCard = (r.nextInt(53) + 1) / 13;
//		System.out.println(drawCard);

		switch (drawCard) {
		case 0:
			System.out.println("Spades");
			break;
		case 1:
			System.out.println("Hearts");
			break;
		case 2:
			System.out.println("Diamonds");
			break;
		case 3:
			System.out.println("Clubs");
			break;
		}
	}

	private static void slide43() {
		System.out.println("\nSlide 43:");
		Random r = new Random();
		int[][] seqArr = new int[10][10];
		int[][] randomArr = new int[5][5];
		for (int i = 0; i < seqArr.length; i++) {
			for (int j = 0; j < seqArr.length; j++) {
				seqArr[i][j] = j;
			}
		}

		System.out.println("\tSequential Array:");
		System.out.println(Arrays.deepToString(seqArr));

		for (int i = 0; i < randomArr.length; i++) {
			for (int j = 0; j < randomArr.length; j++) {
				randomArr[i][j] = r.nextInt(100) + 1;
			}
		}
		System.out.println();
		System.out.println("\tRandom Array:");
		System.out.println(Arrays.deepToString(randomArr));
	}

	private static void exercise1() {
		System.out.println("\nArray Exercise 1:");
		// Write a program that creates an array of integers with a length of 3.
		// Assign the values 1, 2, and 3 to the indexes. Print out each array element.

		int[] arr = { 1, 2, 3 };

		for (int num : arr) {
			System.out.println(num);
		}

	}

	private static void exercise2() {
		System.out.println("\nArray Exercise 2:");
		// Write a program that returns the middle element in an array.
		// Give the following values to the integer array: {13, 5, 7, 68, 2} and produce
		// the following output: 7
		int[] arr = { 13, 5, 7, 68, 2 };
		int midElement = arr.length / 2;

		System.out.println("The middle element is: " + arr[midElement]);
	}

	private static void exercise3() {
		System.out.println("\nArray Exercise 3:");
		// Write a program that creates an array of String type and initializes it with
		// the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
		// Make a copy using the clone( ) method. Use the Arrays.toString( ) method on
		// the new array to verify that the original array was copied.

		String[] stringArr = { "red", "green", "blue", "yellow" };
		System.out.println(stringArr.length);

		String[] arrCopy = Arrays.copyOf(stringArr, stringArr.length);
		System.out.println(Arrays.toString(arrCopy));

	}

	private static void exercise4() {
		System.out.println("\nArray Exercise 4:");
		int[] numsArr = { 4, 7, 2, 3, 9 };
		System.out.printf("First array element: %d\nLast element: %d\n", numsArr[0], numsArr[numsArr.length - 1]);
//		System.out.println(numsArr[numsArr.length]);  Exception: Index 5 out of bounds for length 5
//		numsArr[numsArr.length] = 6; Exception: Index 5 out of bounds for length 5
	}

	private static void exercise5() {
		System.out.println("\nArray Exercise 5:");
//		Write a program where you create an integer array with a length of 5.
//		Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array
		int[] myArr = new int[5];

		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = i;

		}
		System.out.println(Arrays.toString(myArr));
	}

	private static void exercise6() {
		System.out.println("\nArray Exercise 6:");
		// Write a program where you create an integer array of 5 numbers.
		// Loop through the array and assign the value of the loop control variable
		// multiplied by 2 to the corresponding index in the array.
		int[] myArr = new int[5];

		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = i * 2;

		}
		System.out.println(Arrays.toString(myArr));
	}

	private static void exercise7() {
		System.out.println("\nArray Exercise 7:");
		// Write a program where you create an array of 5 elements.
		// Loop through the array and print the value of each element, except for the
		// middle (index 2) element.
		int[] myArr = { 2, 6, 5, 8, 4 };
		int midElement = myArr.length / 2;

		for (int i = 0; i < myArr.length; i++) {
			if (i == midElement) {
				// skip printing the middle element with the value of 5
				continue;
			} else {
				System.out.println(myArr[i]);
			}

		}

	}

	private static void exercise8() {
		System.out.println("\nArray Exercise 8:");
		// Write a program that creates a String array of 5 elements and swaps
		// the first element with the middle element without creating a new array.

		String[] myArr = { "Tom", "Harry", "Sally", "John", "Mark" };
		System.out.println("Original element order\n" + Arrays.toString(myArr));
		int midElement = myArr.length / 2;
		String temp = myArr[0];

		myArr[0] = myArr[midElement];
		myArr[midElement] = temp;

		System.out.println("Swapped element order\n" + Arrays.toString(myArr));
	}

	private static void exercise9() {
		System.out.println("\nArray Exercise 9:");
//		Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
//			Array in ascending order: 0, 1, 2, 4, 9, 13
//
//			The smallest number is 0
//
//			The biggest number is 13

		int[] myArr = { 4, 2, 9, 13, 1, 0 };
		Arrays.sort(myArr);
		System.out.print("Array in ascending order: ");

		for (int ele : myArr) {
			System.out.print(ele + " ");
		}
		System.out.printf("\n\nThe smallest number is %d\n", myArr[0]);
		System.out.printf("\nThe Largest number is %d", myArr[myArr.length - 1]);

	}

	private static void exercise10() {
		System.out.println("\n\nArray Exercise 10:");
		// Create an array that includes an integer, 3 strings, and 1 double. Print the
		// array.

		Object[] myObjArray = { 12, "Tom", "Sarah", "Suzuki", 5.5, };
		System.out.println(Arrays.toString(myObjArray));
	}

}
