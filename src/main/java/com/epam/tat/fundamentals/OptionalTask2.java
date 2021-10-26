package com.epam.tat.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Set;
import java.util.TreeSet;

public class OptionalTask2 {
	public static int findSumOfNumbersBetweentwoPositiveNumbers(int[] row) {
		int sum = 0;
		boolean isFirstPositiveNumberFound = false;
		for (int i = 0; i < row.length; i++) {
			if (!isFirstPositiveNumberFound && (row[i] > 0)) {
				isFirstPositiveNumberFound = true;
				continue;
			}
			if (isFirstPositiveNumberFound && (row[i] <= 0)) {
				sum += row[i];
			}
			if (isFirstPositiveNumberFound && (row[i] > 0)) {
				return sum;
			}
		}
		return 0;
	}

	public static int[][] findMaxElementInMatrixAndRemoveAllRowsAndColumnsFromMatrixThatContainIt(int matrix[][],
			int M) {
		int max = -M;
		int n = matrix[0].length;
		Set<Integer> iset = new TreeSet<>(); // rows with max element
		Set<Integer> jset = new TreeSet<>(); // columns with max element
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == max) {
					iset.add(i);
					jset.add(j);
				}
			}
		}

		int i1 = 0, j1 = 0;
		int[][] newMatrix = new int[n - iset.size()][n - jset.size()];
		for (int i = 0; i < n; i++) {
			if (!iset.add(i)) {
				continue;
			}
			for (int j = 0; j < n; j++) {
				Set<Integer> set = new TreeSet<>(jset);
				if (!set.add(j)) {
					continue;
				}
				newMatrix[i1][j1] = matrix[i][j];
				j1++;

			}
			j1 = 0;
			i1++;
		}
		return newMatrix;
	}

	public static int largestNumberOfIncreasingMatrixElementsInARow(int[][] matrix) {
		int[] matrixInARow = new int[matrix.length * matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrixInARow[i * matrix.length + j] = matrix[i][j];
			}
		}
		int count = 1, max = 1;
		for (int i = 0; i < matrixInARow.length - 1; i++) {
			if (matrixInARow[i] <= matrixInARow[i + 1]) {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				count = 1;
			}
		}
		return max;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter from the console n - the dimension of the matrix");
		int n = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter number M for generating random numbers on the interval [-M, M]");
		int M = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Matrix a[n][n]");
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = (int) (Math.random() * 2 * M - M);
			}
		}
		printMatrix(a);
		System.out.println("Ñhoose action:");
		System.out.println(
				"1 - Sort the rows of the matrix in ascending order of the values of the elements of the k-th column.");
		System.out.println("2 - Find and display the largest number of increasing matrix elements in a row");
		System.out.println(
				"3 - Find the sum of the matrix elements located between the first and second positive elements of each row");
		System.out.println(
				"4 - Find the maximum element in a matrix and remove all rows and columns from the matrix that contain it");
		System.out.println("5 - Exit");
		boolean isRunning = true;
		while (isRunning) {
			int c = Integer.parseInt(bufferedReader.readLine());
			switch (c) {
			case 1:
				int k = Integer.parseInt(bufferedReader.readLine());
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n - 1; j++) {
						if (a[j][k] > a[j + 1][k]) {
							int[] temp = a[j];
							a[j] = a[j + 1];
							a[j + 1] = temp;
						}
					}
				}
				System.out.println("New matrix a[n][n]");
				printMatrix(a);
				break;
			case 2:
				System.out.println("The largest number of increasing matrix elements in a row: "
						+ largestNumberOfIncreasingMatrixElementsInARow(a));
				break;
			case 3:
				int sum = 0;
				for (int i = 0; i < n; i++) {
					sum += findSumOfNumbersBetweentwoPositiveNumbers(a[i]);
				}
				System.out.println(
						"Sum of the matrix elements located between the first and second positive elements of each row: "
								+ sum);
				break;
			case 4:
				int[][] d = findMaxElementInMatrixAndRemoveAllRowsAndColumnsFromMatrixThatContainIt(a, M);
				System.out.println("New matrix a[n][n]");
				printMatrix(d);
				break;
			case 5:
				isRunning = false;
				break;
			}
		}
	}

}
