/*  Write a method minToFront that takes an ArrayList of integers as a parameter 
 * and that moves the minimum value in the list to the front, otherwise preserving
 *  the order of the elements. 
For example, if a list stores the following values: {3, 8, 92, 4, 2, 17, 9} and you 
make this call: minToFront(list); it should store the following values after the call: 
{2, 3, 8, 92, 4, 17, 9} 
You may assume that the list stores at least one value
*/



package com.collection_test.bll;
import java.util.ArrayList;

public class MinimumToFront extends MinimumFront{

	public static void main(String[] args) {
		//{3, 8, 92, 4, 2, 17, 9} 
		
			    ArrayList<Integer> origList = new ArrayList<Integer>(); //creating an integer list 
			    
			    //adding the values in the list
			    origList.add(3);
			    origList.add(8);
			    origList.add(92);
			    origList.add(4);
			    origList.add(2);
			    origList.add(17);
			    origList.add(9);
			    
			    //printing the original list
			    System.out.println("Original List :-");
			    System.out.println(origList);
			   
			    //printing the list after performing minToFront() method
			    System.out.println("List after performing minToFront method :-");
			    minToFront(origList); //applying minToFront() method
			    System.out.println(origList);
			    	    
	 }

}
