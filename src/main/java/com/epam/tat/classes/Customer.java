package com.epam.tat.classes;

import java.math.BigInteger;

public class Customer {
	private String id;
	private String firstName;
	private String secondName;
	private String lastName;
	private String adress;
	private BigInteger creditCard;
	private BigInteger bankAccount;

	public Customer() {
	}

	public Customer(String id, String firstName, String secondName, String lastName, String adress,
			BigInteger creditCard, BigInteger bankAccount) {
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.lastName = lastName;
		this.adress = adress;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
	}

	public Customer(Customer customer) {
		this.id = customer.getId();
		this.firstName = customer.getFirstName();
		this.secondName = customer.getSecondName();
		this.lastName = customer.getLastName();
		this.adress = customer.getAdress();
		this.creditCard = customer.getCreditCard();
		this.bankAccount = customer.getBankAccount();
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public BigInteger getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(BigInteger creditCard) {
		this.creditCard = creditCard;
	}

	public BigInteger getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BigInteger bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\n" + "First Name: " + firstName + "\n" + "Second Name: " + secondName + "\n"
				+ "Last Name: " + lastName + "\n" + "\n" + "Adress: " + adress + "\n" + "Credit Card: " + creditCard
				+ "\n" + "Bank Account: " + bankAccount + "\n";
	}

}
