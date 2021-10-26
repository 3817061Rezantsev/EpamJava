package com.epam.tat.fundamentals.main.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SumOfSequence {

	public static void sumOfSequence() throws NumberFormatException, IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int sum = 0;
		while (true) {
			String temp = bufferedReader.readLine();
			if (temp.equals(""))
				break;
			int n = Integer.parseInt(temp);
			sum += n;
		}
		System.out.println("Sum Of Sequence: " + sum);
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Enter numbers to add");
		sumOfSequence();
	}
}
