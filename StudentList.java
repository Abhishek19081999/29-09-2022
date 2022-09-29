/*
Create an ArrayList object students, and store the following students in that list.

Student AF0216238
	studentcode
	studentname
	age
	state
	
	***********************
Find the students aged over 20

Find students from the state Andhra Pradhesh

Sort students by their age.

Sort students by state and student name.


 */




package com.collection_test.bll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentList{
	
	 
		public static void main(String[] args) {
		  ArrayList<Student> students = new ArrayList<>(); //creating a list
		  
		  //adding values in the list
		  students.add(new Student("AF0216223",	"Aryan Raj",	    21, 	"Andhra Pradesh"));
		  students.add(new Student("AF0216224",	"Bivor Kumar",  	22, 	"Andhra Pradesh"));
		  students.add(new Student("AF0216227",	"SUSHMITA KUMARI",	23,     "Madhya Pradesh"));
		  students.add(new Student("AF0216231",	"Ragiv Zafar",	    24,	    "Maharashtra"));
		  students.add(new Student("AF0216232",	"RAHUL MAHTO",  	25,  	"Orissa"));
		  students.add(new Student("AF0216234",	"Nainsi Kumari",	19,     "Gujarath"));
		  students.add(new Student("AF0216236",	"MD ALI",	        26,	    "Madhya Pradesh"));
		  students.add(new Student("AF0216238",	"ABHISHEK KUMAR",	22,  	"Andhra Pradesh"));
		  students.add(new Student("AF0216240",	"AFROZ ANSARI", 	21,     "Maharashtra"));
		  students.add(new Student("AF0216259",	"RITIK RAJ",	    20, 	"Orissa"));
		  students.add(new Student("AF0216263",	"Anant Kumar",	    25,	    "Andhra Pradesh"));
		  students.add(new Student("AF0216305",	"BABU KUMAR",	    24, 	"Gujarath"));
		  students.add(new Student("AF0216307",	"NIKITA KUMARI",	23,	    "Madhya Pradesh"));
		  students.add(new Student("AF0216353",	"PRANAV PANDEY",	22,	    "Orissa"));
		  students.add(new Student("AF0216964",	"Radheshyam Kumar",	21, 	"Maharashtra"));
		  students.add(new Student("AF0216973",	"Ankur Utpal",  	19,	    "Gujarath"));
		  students.add(new Student("AF0217607",	"Banty Mishra",	    18,  	"Madhya Pradesh"));
		  students.add(new Student("AF0217615",	"RIYA KUMARI",  	20,	    "Madhya Pradesh"));
		  students.add(new Student("AF0217791",	"Priyadarshani Kumari",21,	"Maharashtra"));
		  students.add(new Student("AF0223373",	"Chanchal Thakur",	22,	    "Orissa"));
		  students.add(new Student("AF0221549",	"SATENDRA KUMAR",	23,	    "Maharashtra"));
		  students.add(new Student("AF0216212",	"Pappi Verma",	    24,     "Maharashtra"	));
		  students.add(new Student("AF0216244",	"Ramkrishna Kushwah",25,	"Andhra Pradesh"));
		  students.add(new Student("AF0216245",	"Yogita Tamoliya",	26,	    "Orissa"));
		  
	      
		
		/*
		//age more than 20
		System.out.println("Students with age greater than 20 years..");
			for(Student student: students) {
				if(student.getAge()>20)
				System.out.println(student);
			}
		
		*/
		  
		  
		/*	
		 
		//students from Andhra Pradesh
		System.out.println("Students from Andhra Pradesh...");
			for(Student student : students)
			{
				if(student.getState().equals("Andhra Pradesh"))
					System.out.println(student);
			}
			
		 */
		  
		  
		/*
		 //Sorting according to age
		 System.out.println("sorting by age...");  
		  
		 Collections.sort(students,new AgeComparator());  
		 for(Student student : students) {
			 System.out.println(student);
		 }
		*/
		  
		  
		  
		//sort students by their state and name
			System.out.println("Sorting by state and name... ");
			System.out.println();
			
			Collections.sort(students , new StateAndNameComparator());
			Iterator<Student> itr2 = students.iterator();
			int e = 0;
			while(itr2.hasNext()) {
				System.out.println(e++ + " . " + itr2.next());
			}
			System.out.println();
			System.out.println("****************************************************************");
			System.out.println();
		
		
		
		
		}

}



