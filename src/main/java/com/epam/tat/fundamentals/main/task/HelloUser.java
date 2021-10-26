package com.epam.tat.fundamentals.main.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class HelloUser {
	public static void greetings(String name) {
		System.out.println("Hello, " + name);
	}

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter your name");
		String name = bufferedReader.readLine();
		greetings(name);
	}
}
