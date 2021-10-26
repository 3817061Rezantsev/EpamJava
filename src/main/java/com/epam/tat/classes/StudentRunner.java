package com.epam.tat.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class StudentRunner {
	static Calendar[] calendars = { new GregorianCalendar(2017, 0, 25), new GregorianCalendar(2000, 0, 25),
			new GregorianCalendar(2007, 0, 25), new GregorianCalendar(2107, 0, 25),
			new GregorianCalendar(2010, 0, 25) };
	static Student[] students = {
			new Student("001", "Tom", "Mott", "Crut", calendars[0].getTime(), "home1", "3838383", "math", "2", "A"),
			new Student("002", "Tod", "Scott", "Cruts", calendars[1].getTime(), "home1", "3838383", "math", "2", "A"),
			new Student("003", "Tedd", "Lott", "Crit", calendars[2].getTime(), "home1", "3838383", "IT", "2", "B"),
			new Student("004", "Bom", "Fortt", "Cut", calendars[3].getTime(), "home1", "3838383", "IT", "1", "D"),
			new Student("005", "Bot", "Mrot", "Cru", calendars[4].getTime(), "home1", "3838383", "IT", "2", "B"), };

	public static void main(String[] args) throws NumberFormatException, IOException {
		StudentArray studentArray = new StudentArray(students);
		System.out.println("List of students from IT faculty:");
		List<Student> ITStudents = studentArray.getByFaculty("IT");
		for (Student s : ITStudents) {
			System.out.println(s.toString());
		}
		studentArray.sortByFacultyAndCourse();
		System.out.println("List of students for each faculty and course:");
		for (int i = 0; i < studentArray.getStudents().length; i++) {
			System.out.println(studentArray.getStudents()[i].toString());
		}
		System.out.println("Stydents, born after 2017");
		List<Student> youngStudents = studentArray.getYoungerStudents(new GregorianCalendar(2017, 11, 31).getTime());
		System.out.println("List of young students:");
		for (Student s : youngStudents) {
			System.out.println(s.toString());
		}
		System.out.println("List of students from group B:");
		List<Student> studentsFromB = studentArray.getByGroup("B");
		for (Student s : studentsFromB) {
			System.out.println(s.toString());
		}
	}

}
