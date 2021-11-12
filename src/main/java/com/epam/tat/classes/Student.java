package com.epam.tat.classes;

import java.util.Date;

public class Student {
	private String id;
	private String firstName;
	private String secondName;
	private String lastName;
	private Date birthday;
	private String adress;
	private String phone;
	private String faculty;
	private String course;
	private String group;

	public Student(String id, String firstName, String secondName, String lastName, Date birthday, String adress,
			String phone, String faculty, String course, String group) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.adress = adress;
		this.phone = phone;
		this.faculty = faculty;
		this.course = course;
		this.group = group;
	}

	public Student(Student A) {
		this.id = A.getId();
		this.firstName = A.getFirstName();
		this.secondName = A.getSecondName();
		this.lastName = A.getLastName();
		this.birthday = A.getBirthday();
		this.adress = A.getAdress();
		this.phone = A.getPhone();
		this.faculty = A.getFaculty();
		this.course = A.getCourse();
		this.group = A.getGroup();
	}

	@Override
	public String toString() {
		return "Id: " + id + "\n" + "First Name: " + firstName + "\n" + "Second Name: " + secondName + "\n"
				+ "Last Name: " + lastName + "\n" + "Birthday: " + birthday + "\n" + "Adress: " + adress + "\n"
				+ "Phone: " + phone + "\n" + "Faculty: " + faculty + "\n" + "Course: " + course + "\n" + "Group: "
				+ group + "\n";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
}
