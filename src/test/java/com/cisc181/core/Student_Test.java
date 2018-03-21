package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		 ArrayList<Course> cl = new ArrayList<Course>();
		 ArrayList<Semester> sem = new ArrayList<Semester>();
		 ArrayList<Section> sec = new ArrayList<Section>();
		 ArrayList<Student> stu = new ArrayList<Student>();
		 //Add three Course records, add them to an ArrayList of Course
		 //Add two Semesters, one for Fall, one for Spring.  
		 //Add them to an ArrayList of Semester
		 cl.add(new Course(UUID.randomUUID(), "English", 78, eMajor.NURSING));
		 cl.add(new Course(UUID.randomUUID(), "English", 90, eMajor.NURSING));
		 cl.add(new Course(UUID.randomUUID(), "English", 67, eMajor.NURSING));
		 
		 //Add two Sections for each Course & Semester (total of six Sections).  
		 //Add them to an ArrayList of Section
		 //Create ten Student records, add them to an ArrayList of Student.

		 sem.add(new Semester(UUID.randomUUID(), new Date(Calendar.AUGUST), new Date(Calendar.DECEMBER)));
		 sem.add(new Semester(UUID.randomUUID(), new Date(Calendar.FEBRUARY), new Date(Calendar.MAY)));
	 
		 sec.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 206));
		 sec.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 206));
		 sec.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 206));
		 sec.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 206));
		 sec.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 206));
		 sec.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 206));
		 //(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
					//String Address, String Phone_number, String Email)
		 for(int x = 0; x < 10; x++) {
			 stu.add(new Student("Dman", "Jangus", "Ferggy", new Date(1999,18,02), eMajor.COMPSI, "Down there", "088777111", "@gmail"));
		 }
	}

	@Test
	public void test() {
		
		assertEquals(1, 1);
	}
}