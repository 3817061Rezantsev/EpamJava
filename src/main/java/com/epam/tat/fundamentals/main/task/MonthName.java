package com.epam.tat.fundamentals.main.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MonthName {
	private static final String[] MONTH_NAME = new String[] { "", "January", "February", "March", "April", "May",
			"June", "July", "August", "September", "October", "November", "December" };

	public static void monthNameOutput(int monthNum) {
		if ((monthNum > 0) && (monthNum < 13)) {
			System.out.println(MONTH_NAME[monthNum]);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter month number");
		int monthNum = Integer.parseInt(bufferedReader.readLine());
		monthNameOutput(monthNum);
	}
}
