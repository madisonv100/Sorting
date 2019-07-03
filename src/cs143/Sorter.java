package cs143;

import java.util.ArrayList;
import java.util.Collections;

public class Sorter {
	
	
	public static void  insertionSort(ArrayList<Integer> sort )
	{
		for (int i = 0; i < sort.size(); i++) 
		{
			
			
			{
				for (int j = i ; j < sort.size(); j++ )
				{
					if (sort.get(j) < sort.get(i))
					{
				    
				     int LE = sort.get(i);
				     sort.set(i, sort.get(j));
				     sort.set(j, LE);
				
				   
					}
			}
			}
		}
	}

	
	public static void  selectionSort(ArrayList<Integer> sort )
	{
		
		for (int i = 0 ; i < sort.size(); i ++)
		{
			int largest = i ;
			
			
			for (int j = i ; j < sort.size(); j ++)
			{
				if (sort.get(j) < sort.get(largest))
				{
					largest = j ;
					
					
				}
				Collections.swap(sort, i, largest);
				
			}
		}
	}
	
	
	public static void  bubbleSort(ArrayList<Integer> sort )
	{
		int checks = 0;
		
		do {
		checks = 0;
			for (int i = 0; i < sort.size()-1; i ++)
			{
				if (sort.get(i)  > sort.get(i +1))
				{
					Collections.swap(sort, i , i +1);
					checks++;
				}
			}
	
		}while ( checks!= 0);
	}
	
	
	
}
