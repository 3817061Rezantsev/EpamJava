package com.epam.tat.classes;

import java.math.BigInteger;
import java.util.List;

public class CustomerRunner {
	static BigInteger[] bankInformation = { new BigInteger("12121212121212121212121212121212"),
			new BigInteger("12121212121212121212121212121234"), new BigInteger("12121212121212121212121213434343"),
			new BigInteger("45454545454545454545454545454545"), new BigInteger("12121212121212121212121212121222") };

	static Customer[] customers = {
			new Customer("001", "Bom", "Poht", "Crus", "home1", bankInformation[0], bankInformation[0]),
			new Customer("002", "Tod", "Eott", "Kris", "home1", bankInformation[1], bankInformation[0]),
			new Customer("003", "Cof", "Matt", "Vrys", "home1", bankInformation[2], bankInformation[0]),
			new Customer("004", "Tok", "Hot", "Zras", "home1", bankInformation[3], bankInformation[0]),
			new Customer("005", "Tol", "Ott", "Hres", "home1", bankInformation[4], bankInformation[0]) };

	public static void main(String[] args) {
		System.out.println("List of customers in alphabetical order: ");
		CustomerArray customerArray = new CustomerArray(customers);
		Customer[] alphabetCustomers = customerArray.alphabetSort();
		for (Customer c : alphabetCustomers) {
			System.out.println(c.toString());
		}
		System.out.println("List of customers whose credit card number is in the range of");
		System.out.println("[12121212121212121212121212121222, 12121212121212121212121213434343]");
		List<Customer> bankCustomers = customerArray.getByCreditCards(
				new BigInteger("12121212121212121212121212121222"), new BigInteger("12121212121212121212121213434343"));
		for (Customer c : bankCustomers) {
			System.out.println(c.toString());
		}
	}
}
