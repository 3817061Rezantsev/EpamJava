package com.epam.tat.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainTask {
	private static final String[] MONTH_NAME = new String[] { "", "January", "February", "March", "April", "May",
			"June", "July", "August", "September", "October", "November", "December" };

	public static void greetings(String name) {
		System.out.println("Hello, " + name);
	}

	public static String reverseString(String string) {
		return new StringBuffer(string).reverse().toString();
	}

	public static void randomNumbers(int numberOfRandomNum) {
		for (int i = 0; i < numberOfRandomNum; i++) {
			int b = (int) (Math.random() * 20);
			System.out.print(b + " ");
		}
		System.out.println();
		for (int i = 0; i < numberOfRandomNum; i++) {
			int b = (int) (Math.random() * 20);
			System.out.println(b);
		}
	}

	public static void sumAndMulOfConsoleNumbers() throws NumberFormatException, IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int sum = 0, mul = 1;
		while (true) {
			String temp = bufferedReader.readLine();
			if (temp.equals(""))
				break;
			int n = Integer.parseInt(temp);
			sum += n;
			mul *= n;
		}
		System.out.println("Sum: " + sum);
		System.out.println("Mul: " + mul);
	}

	public static void monthNameOutput(int monthNum) {
		if ((monthNum > 0) && (monthNum < 13)) {
			System.out.println(MONTH_NAME[monthNum]);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter your name");
		String name = bufferedReader.readLine();
		greetings(name);
		System.out.println("Reversed");
		System.out.println(reverseString(name));
		System.out.println("Enter number of random numbers");
		int numberOfRandomNum = Integer.parseInt(bufferedReader.readLine());
		randomNumbers(numberOfRandomNum);
		System.out.println("Enter numbers for sum and mul");
		sumAndMulOfConsoleNumbers();
		System.out.println("Enter month number");
		int monthNum = Integer.parseInt(bufferedReader.readLine());
		monthNameOutput(monthNum);
	}
}
