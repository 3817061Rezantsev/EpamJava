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

	public List<Student> getByFaculty(String faculty) {
		List<Student> facultyStudents = new ArrayList<>();
		for (Student student : students) {
			if (student.getFaculty().equals(faculty)) {
				facultyStudents.add(student);
			}
		}
		return facultyStudents;
	}

	public List<Student> getByGroup(String group) {
		List<Student> groupStudent = new ArrayList<>();
		for (Student student : students) {
			if (student.getGroup().equals(group)) {
				groupStudent.add(student);
			}
		}
		return groupStudent;
	}

	public void sortByFacultyAndCourse() {
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
					if (students[j].getCourse().compareTo(students[j + 1].getCourse()) > 0) {
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
		sortByFacultyAndCourse();
		return students;
	}

	public List<Student> getYoungerStudents(Date date) {
		List<Student> youngerStudents = new ArrayList<>();
		for (Student student : students) {
			if (student.getBirthday().after(date)) {
				youngerStudents.add(student);
			}
		}
		return youngerStudents;
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
