package com.collection_test.bll;

public class Student {
	 private String studentcode;
	 private String studentname;
	 private int age;
	 private String state;
	 
	 public Student() { // default constructor
		 
	 	}
	 
	// parameterized constructor
	 public Student(String studentcode, String studentname,int age, String state) {
		 this.studentcode= studentcode;
		 this.studentname=studentname;
		 this.age=age;
		 this.state=state;
	 	}

	 //getters and setters
	 public String getStudentCode() {
		 return studentcode;
	 	}
	 
	 public void setStudentCode(String studentcode) {
		 this.studentcode=studentcode;
	 	}
	 
	 public String getStudentName() {
		 return studentname;
	 	}
	 
	 public void setStudentName(String studentname) {
		 this.studentname=studentname;
	 	}
	 
	 public  String getState() {
		 return state;
	 	}
	 
	 public void setState(String state) {
		 this.state=state;
	 	}
	 
	 public int getAge() {
		 return age;
	 	}
	 
	 public void setAge(int age) {
		 this.age=age;
	 	} 
	 
	 
	 //toString()method
	 @Override
	 public String toString() {
		 return "Student[studentcode=" + studentcode + ", studentname=" +
	              studentname + ", age=" + age + ", state="+ state + "]";
	 	}

}
