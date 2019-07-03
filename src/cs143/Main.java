package cs143;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> sortMe = new ArrayList<>(); 
		
		for (int i = 0; i <100; i++) {
			
			sortMe.add(i);
		}
		
		System.out.println("Bubblesort");
		Collections.shuffle(sortMe);
		
		System.out.println("Before");
		printList(sortMe);
		System.out.println();
		System.out.println("After");
		Sorter.bubbleSort(sortMe);
		printList(sortMe);
		System.out.println();
		
		System.out.println("Insertion Sort");
		Collections.shuffle(sortMe);
		
		System.out.println("Before");
		printList(sortMe);
		System.out.println();
		System.out.println("After");
		Sorter.insertionSort(sortMe);
		printList(sortMe);
		System.out.println();
		
		
		System.out.println("Selection Sort");
		Collections.shuffle(sortMe);
		
		System.out.println("Before");
		printList(sortMe);
		System.out.println();
		System.out.println("After");
		Sorter.selectionSort(sortMe);
		printList(sortMe);
		System.out.println();
	}

	
	public static void printList(ArrayList<Integer> print)
	{
		
		for (int i = 1; i <101; i++) {
			
			System.out.format("%4d", print.get(i-1));
			if (i % 10 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
	}
}
