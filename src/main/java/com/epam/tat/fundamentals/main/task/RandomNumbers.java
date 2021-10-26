package com.epam.tat.fundamentals.main.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class RandomNumbers {
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

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int numberOfRandomNum = Integer.parseInt(bufferedReader.readLine());
		randomNumbers(numberOfRandomNum);
	}
}
