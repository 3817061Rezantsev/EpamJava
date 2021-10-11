package com.epam.tat.classes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CustomerArray {

	private Customer[] customers;

	public CustomerArray() {
	}

	public CustomerArray(Customer[] customers) {
		this.customers = customers;
	}

	public CustomerArray(CustomerArray A) {
		this.customers = A.getCustomers();
	}

	public Customer[] alphabetSort() {
		for (int i = 0; i < customers.length; i++) {
			for (int j = 0; j < customers.length - 1; j++) {
				if (customers[j].getLastName().compareTo(customers[j + 1].getLastName()) > 0) {
					Customer s = customers[j];
					customers[j] = customers[j + 1];
					customers[j + 1] = s;
				}
			}
		}
		for (int i = 0; i < customers.length; i++) {
			for (int j = 0; j < customers.length - 1; j++) {
				if (customers[j].getLastName().compareTo(customers[j + 1].getLastName()) == 0) {
					if (customers[j].getFirstName().compareTo(customers[j + 1].getFirstName()) > 0) {
						Customer s = customers[j];
						customers[j] = customers[j + 1];
						customers[j + 1] = s;
					}

				} else
					continue;
			}
		}
		for (int i = 0; i < customers.length; i++) {
			for (int j = 0; j < customers.length - 1; j++) {
				if (customers[j].getLastName().compareTo(customers[j + 1].getLastName()) == 0) {
					if (customers[j].getFirstName().compareTo(customers[j + 1].getFirstName()) == 0) {
						if (customers[j].getSecondName().compareTo(customers[j + 1].getSecondName()) > 0) {
							Customer s = customers[j];
							customers[j] = customers[j + 1];
							customers[j + 1] = s;
						}
					}

				} else
					continue;
			}
		}
		return customers;

	}

	public Customer[] getByCreditCards(BigInteger a, BigInteger b) {
		List<Customer> list = new ArrayList<>();
		for (Customer c : customers) {
			if (c.getCreditCard().compareTo(a) >= 0) {
				if (c.getCreditCard().compareTo(b) <= 0) {
					list.add(c);
				}
			}
		}
		return (Customer[]) list.toArray();
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

}
