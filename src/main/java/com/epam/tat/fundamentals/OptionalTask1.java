package com.epam.tat.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class OptionalTask1 {

	public static boolean isAllNumbersEven(String number) {
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			if ((int) c % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSequenceIncreasing(String number) {
		if (number.length() == 1)
			return true;
		for (int i = 1; i < number.length(); i++) {
			if (number.charAt(i) < number.charAt(i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNumberContainsEqualAmountOfEvenAndNotEvenNumerals(String number) {
		int even = 0;
		int notEven = 0;
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			if ((int) c % 2 == 0) {
				even++;
			} else {
				notEven++;
			}
		}
		return notEven == even;
	}

	public static String fewDistinctDigits(String[] array) {
		int digitsCount = 1000;
		String fewestNumber = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() == 1)
				return array[i];
			char[] c = array[i].toCharArray();
			Set<Integer> set = new TreeSet<>();
			for (int j = 0; j < array[i].length(); j++) {
				set.add((int) c[j]);
			}
			if (set.size() < digitsCount) {
				digitsCount = set.size();
				fewestNumber = array[i];
			}

		}
		return fewestNumber;

	}

	public static int lengthOfNumber(int number) {
		int length = 0;
		while (number != 0) {
			number /= 10;
			length++;
		}
		return length;
	}

	public static String onlyDistinctDigits(String[] numbers) {
		String onlyDistinct = "";
		for (int i = 0; i < numbers.length; i++) {
			char[] c = numbers[i].toCharArray();
			Set<Integer> set = new TreeSet<>();
			for (int j = 0; j < numbers[i].length(); j++) {
				set.add((int) c[j]);
			}
			if (set.size() == numbers[i].length()) {
				onlyDistinct = numbers[i];
				break;
			}
		}
		return onlyDistinct;

	}

	public static int findAverageLength(String[] array) {
		int mid = 0;
		for (int i = 0; i < array.length; i++) {
			mid += array[i].length();
		}
		return mid / array.length;
	}

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter the number of digits");
		int numOfDigits = Integer.parseInt(bufferedReader.readLine());
		String[] arrayOfNumbers = new String[numOfDigits];
		System.out.println("Enter numbers");
		for (int i = 0; i < numOfDigits; i++) {
			arrayOfNumbers[i] = bufferedReader.readLine();
		}
		int[] numArray = new int[numOfDigits];
		for (int i = 0; i < numOfDigits; i++) {
			numArray[i] = Integer.parseInt(arrayOfNumbers[i]);
		}
		System.out.println("Ñhoose action:");
		System.out.println("1 - Find the shortest and longest number");
		System.out.println("2 - Print numbers in ascending order of their length values");
		System.out.println("3 - Print those numbers whose length is less than the average length for all numbers");
		System.out.println("4 - Find a number with as few distinct digits as possible");
		System.out.println("5 - Find the number of numbers, the number of only even digits, and among other things,");
		System.out.println("the number of numbers with an equal number of even and odd digits");
		System.out.println("6 - Find a number with digits in strict ascending order");
		System.out.println("7 - Find a number containing only distinct digits");
		System.out.println("8 - Exit");
		Arrays.sort(numArray);
		boolean isRunning = true;
		while (isRunning) {
			int n = Integer.parseInt(bufferedReader.readLine());
			switch (n) {
			case 1:
				System.out.println("Shortest number: " + numArray[0] + " Length: " + lengthOfNumber(numArray[0]));
				System.out.println("Longest number: " + numArray[numOfDigits - 1] + " Length: "
						+ lengthOfNumber(numArray[numOfDigits - 1]));
				break;
			case 2:
				System.out.println("Printing numbers in ascending order of their length values");
				for (int i = 0; i < numOfDigits; i++) {
					System.out.print(numArray[i] + " ");
				}
				System.out.println();
				break;
			case 3:
				int mid = findAverageLength(arrayOfNumbers);
				System.out.println("The average length for all numbers: " + mid);
				System.out.println("Numbers whose length is less than the average length for all numbers: ");
				for (int i = 0; i < numOfDigits; i++) {
					if (arrayOfNumbers[i].length() < mid)
						System.out.print(arrayOfNumbers[i] + " ");
				}
				System.out.println();
				break;
			case 4:
				System.out.println(
						"A number with as few distinct digits as possible: " + fewDistinctDigits(arrayOfNumbers));
				break;
			case 5:
				int count = 0;
				for (int i = 0; i < numOfDigits; i++) {
					if (isAllNumbersEven(arrayOfNumbers[i]))
						count++;
				}
				System.out.println("The number of only even digits: " + count);
				count = 0;
				for (int i = 0; i < numOfDigits; i++) {
					if (isNumberContainsEqualAmountOfEvenAndNotEvenNumerals(arrayOfNumbers[i]))
						count++;
				}
				System.out.println("The number of numbers with an equal number of even and odd digits: " + count);
				break;
			case 6:
				for (int i = 0; i < numOfDigits; i++) {
					if (isSequenceIncreasing(arrayOfNumbers[i])) {
						System.out.println("A number with digits in strict ascending order: " + arrayOfNumbers[i]);
						break;
					}
				}
				break;
			case 7:
				System.out.println("A number containing only distinct digits: " + onlyDistinctDigits(arrayOfNumbers));
				break;
			case 8:
				isRunning = false;
				break;

			}
		}
	}
}
