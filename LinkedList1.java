/*
Create a list of elements as shown below into the LinkedList and name it as languages.

C
C++
Java
Kotlin
Python
Perl
Ruby

Display the created list.

Remove an element at index 5 and display the list

Remove ‘Kotlin’ and display the list

Remove all the scripting languages (Python, Ruby, Perl) with one statement and display the list.

Remove all the elements from the list and display the list.

  */




package com.collection_test.bll;
import java.util.LinkedList;
import java.util.Arrays;

public class LinkedList1 {

	public static void main(String[] args) {
LinkedList<String> languages = new LinkedList<>();
		
		//adding value in linked list
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("Python");
		languages.add("Perl");
		languages.add("Ruby");
		/*
		//Display languages
		System.out.println("*******Languages********");
		for(int i=0; i<languages.size(); i++) {
			
			System.out.print(languages.get(i)+"  ");
		}
		*/
		
		
		
		/*
		// Remove an element at index 5
		System.out.println("**********************");
		languages.remove(5);
		
		System.out.println("After remove element of index 5");
		
		for(int i=0; i<languages.size(); i++) {
			
			System.out.print(languages.get(i)+"   ");
		}
		*/
		
		
		
		/*
		//Remove "Kotlin" element
		System.out.println("**********************");
		languages.remove("Kotlin");
		
		System.out.println("After remove Kotlin");
		
		for(int i=0; i<languages.size(); i++) {
			
			System.out.print(languages.get(i)+"   ");
		}
		*/
		
		/*
		//Removing the scripting languages 
		System.out.println("**********************");
		LinkedList<String>scripting_lang=new LinkedList<>(Arrays.asList("Python","Ruby","Perl"));
		languages.removeAll(scripting_lang);
		System.out.println("After remove scripting languages :-");
		
		for(int i=0; i<languages.size(); i++) {
			
			System.out.print(languages.get(i)+"   ");
		}
		*/
		
		
		
		/*
		//remove All element
		System.out.println("**********************");
		language.removeAll(languages);
		
		System.out.println("After removeAll the language");
				
		for(int i=0; i<languages.size(); i++) {
					
			System.out.print(languages.get(i)+"   ");
		}
		*/
	}

}
