package com.epam.tat.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentArray {

	private Student[] students;

	public StudentArray() {
	}

	public StudentArray(Student[] student) {
		this.students = student;
	}

	public Student[] getByFaculty(String faculty) {
		List<Student> list = new ArrayList<>();
		for (Student student : students) {
			if (student.getFaculty().equals(faculty)) {
				list.add(student);
			}
		}
		return (Student[]) list.toArray();
	}

	public Student[] getByGroup(String group) {
		List<Student> list = new ArrayList<>();
		for (Student student : students) {
			if (student.getGroup().equals(group)) {
				list.add(student);
			}
		}
		return (Student[]) list.toArray();
	}

	public void sortByFacultyAndGroup() {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length - 1; j++) {
				if (students[j].getFaculty().compareTo(students[j + 1].getFaculty()) > 0) {
					Student s = students[j];
					students[j] = students[j + 1];
					students[j + 1] = s;
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length - 1; j++) {
				if (students[j].getFaculty().compareTo(students[j + 1].getFaculty()) == 0) {
					if (students[j].getGroup().compareTo(students[j + 1].getGroup()) > 0) {
						Student s = students[j];
						students[j] = students[j + 1];
						students[j + 1] = s;
					}

				} else
					continue;
			}
		}
	}

	public Student[] getForEachFacultyAndGroup() {
		sortByFacultyAndGroup();
		return students;
	}

	public Student[] getByBDay(Date date) {
		List<Student> list = new ArrayList<>();
		for (Student student : students) {
			if (student.getBirthday().after(date)) {
				list.add(student);
			}
		}
		return (Student[]) list.toArray();
	}

	public StudentArray(StudentArray studentArray) {
		this.students = studentArray.getStudents();
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

}
