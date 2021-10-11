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
	
	public static boolean isAllNumbersEven(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!((int) c % 2 == 0)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSequenceIncreasing(String str) {
		if (str.length() == 1)
			return true;
		for (int i = 1; i < str.length(); i++) {
			char c = str.charAt(i);
			if (str.charAt(i) < str.charAt(i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isNumberContainsEqualAmountOfEvenAndNotEvenNumerals(String str) {
		int even = 0, notEven = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((int) c % 2 == 0) {
				even++;
			} else {
				notEven++;
			}
		}
		if (notEven == even)
			return true;
		else
			return false;
	}

	public static String numMinDiff(String[] s) {
		int minCount = 1000;
		String res = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == 1)
				return s[i];
			char[] c = s[i].toCharArray();
			Set<Integer> set = new TreeSet<>();
			for (int j = 0; j < s[i].length(); j++) {
				set.add((int) c[j]);
			}
			if (set.size() < minCount) {
				minCount = set.size();
				res = s[i];
			}

		}
		return res;

	}

	public static int lengthOfNumber(int a) {
		int l = 0;
		while (a != 0) {
			a /= 10;
			l++;
		}
		return l;
	}

	public static String numMaxDiff(String[] s) {
		String res = "";
		for (int i = 0; i < s.length; i++) {
			char[] c = s[i].toCharArray();
			Set<Integer> set = new TreeSet<>();
			for (int j = 0; j < s[i].length(); j++) {
				set.add((int) c[j]);
			}
			if (set.size() == s[i].length()) {
				res = s[i];
			}

		}
		return res;

	}

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int n = Integer.parseInt(bufferedReader.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = bufferedReader.readLine();
		}
		int[] iarr = new int[n];
		for (int i = 0; i < n; i++) {
			iarr[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(iarr);
		Arrays.sort(arr);
		System.out.println("task 1");
		System.out.println(iarr[0] + " " + lengthOfNumber(iarr[0]));
		System.out.println(iarr[n - 1] + " " + lengthOfNumber(iarr[n - 1]));
		System.out.println("task 2");
		int mid = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(iarr[i] + " ");
			mid += arr[i].length();
		}
		System.out.println();
		System.out.println("task 3");
		mid /= n;
		for (int i = 0; i < n; i++) {
			if (arr[i].length() < mid)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(mid);
		System.out.println("task 4");
		System.out.println(numMinDiff(arr));
		System.out.println("task 5");
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (isAllNumbersEven(arr[i]))
				count++;
		}
		System.out.println(count);
		count = 0;
		for (int i = 0; i < n; i++) {
			if (isNumberContainsEqualAmountOfEvenAndNotEvenNumerals(arr[i]))
				count++;
		}
		System.out.println(count);
		System.out.println("task 6");
		for (int i = 0; i < n; i++) {
			if (isSequenceIncreasing(arr[i])) {
				System.out.println(arr[i]);
				break;
			}
		}
		System.out.println("task 7");
		System.out.println(numMaxDiff(arr));

	}
}
