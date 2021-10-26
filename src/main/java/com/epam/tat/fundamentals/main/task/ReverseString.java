package com.epam.tat.fundamentals.main.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReverseString {
	public static String reverseString(String string) {
		return new StringBuffer(string).reverse().toString();
	}

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter your string");
		String reversedString = bufferedReader.readLine();
		System.out.print("Reversed: " + reverseString(reversedString));
	}
}
