package main.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Set;
import java.util.TreeSet;

public class OTask2 {

	public static int findSum(int[] a) {
		int f = -1, s = 0;
		for (int i = 0; i < a.length; i++) {
			if ((f == -1) && (a[i] > 0)) {
				f = i;
				continue;
			}
			if ((f != -1) && (a[i] <= 0)) {
				s += a[i];
			}
			if ((f != -1) && (a[i] > 0)) {
				return s;
			}
		}
		return 0;
	}

	public static int[][] task4(int a[][], int M) {
		int max = -M;
		int n = a[0].length;
		int[][] d = a;
		int m = 0, l = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					m = i;
					l = j;
				}
			}
		}
		boolean flag = true;
		while (flag) {
			flag = false;
			int i1 = 0, j1 = 0;
			int[][] c = new int[d.length - 1][d.length - 1];
			for (int i = 0; i < d.length - 1; i++) {
				if (i == m) {
					i1++;
				}
				for (int j = 0; j < d.length - 1; j++) {
					if (j == l) {
						j1++;
					}
					if (((i + i1) >= d.length) || ((j + j1) >= d.length)) {
						continue;
					}
					c[i][j] = d[i + i1][j + j1];
				}
				j1 = 0;
			}
			d = c;
			for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d.length; j++) {
					if (d[i][j] == max) {
						flag = true;
						l = j;
						m = i;
					}
				}
			}
		}

		return d;
	}

	public static int[][] task4Mod(int a[][], int M) {
		int max = -M;
		int n = a[0].length;
		Set<Integer> iset = new TreeSet<>();
		Set<Integer> jset = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == max) {
					iset.add(i);
					jset.add(j);
				}
			}
		}

		int i1 = 0, j1 = 0;
		int[][] c = new int[n - iset.size()][n - jset.size()];
		for (int i = 0; i < n; i++) {
			if (!iset.add(i)) {
				continue;
			}
			for (int j = 0; j < n; j++) {
				Set<Integer> set = new TreeSet<>(jset);
				if (!set.add(j)) {
					continue;
				}
				c[i1][j1] = a[i][j];
				j1++;

			}
			j1 = 0;
			i1++;
		}
		return c;
	}

	public static int task2(int[] a) {
		int count = 1, max = 1;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] <= a[i + 1]) {
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

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int n = Integer.parseInt(bufferedReader.readLine());
		int M = Integer.parseInt(bufferedReader.readLine());
		int[][] A = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = (int) (Math.random() * 2 * M - M);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + " ");

			}
			System.out.println();
		}
		int[] B = new int[n * n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				B[i * n + j] = A[i][j];
			}
		}
		int k = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (A[j][k] > A[j + 1][k]) {
					int[] temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Task 2");
		System.out.println(task2(B));
		System.out.println("Task 3");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += findSum(A[i]);
		}
		System.out.println(sum);
		System.out.println("Task 4");
		int[][] d = task4(A, M);
		for (int i = 0; i < n - d[0].length; i++) {
			for (int j = 0; j < n - d[0].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}

}
