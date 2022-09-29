package com.collection_test.bll;
import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{
	
	
	@Override
	public int compare(Student student1, Student student2) { //comparison of objects 
		
		
		if(student1.getAge() == student2.getAge()) {
			return 0;
		}
		else if(student1.getAge() > student2.getAge()) {
			return 1;
		}
		else 
			return -1;
	}
}

