package com.collection_test.bll;
import java.util.ArrayList;

public class MinimumFront {
	public static void minToFront(ArrayList<Integer> array) {
	    int minIndex = 0;
	    //functionality of minToFront() method
	    for (int i = 1; i < array.size(); i++) //traversing the list
	    {
	        if (array.get(minIndex) > array.get(i)) {  //condition: if array.get(minIndex) > array.get(i)
	            minIndex = i;   //make minIndex as i after each step
	        }
	    }
	    
	    int minValue = array.remove(minIndex); //remove minimum index value from minValue
	    array.add(0, minValue); //add minValue to front index i.e.0
	}
}
