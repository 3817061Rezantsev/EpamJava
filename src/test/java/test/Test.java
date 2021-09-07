package test;

import static org.junit.jupiter.api.Assertions.*;

import main.task.OTask2;

class Test {

	@org.junit.jupiter.api.Test
	void testTask2() {
		int n = 3;
		int[] B = new int[n * n];
		for (int i = 0; i < n * n; i++) {
			B[i] = i;
		}
		assertEquals(9, OTask2.task2(B));
		for (int i = 0; i < n * n; i++) {
			B[i] = n * n - i;
		}
		assertEquals(1, OTask2.task2(B));
		for (int i = 0; i < n * n; i++) {
			B[i] = n * n - i;
		}
		B[0] = 0;
		B[1] = 1;
		B[2] = 2;
		assertEquals(4, OTask2.task2(B));
	}

	@org.junit.jupiter.api.Test
	void testTask3() {
		int[] a = { 1, 0, 0, 1 };
		int[] a1 = { 1, -5, 0, 1 };
		int[] a2 = { 1, 0, -5, 0 };
		int[] a3 = { -5, 0, 0, 1 };
		int[] a4 = { 1, -5, 1, -6, 1 };
		assertEquals(0, OTask2.findSum(a));
		assertEquals(-5, OTask2.findSum(a1));
		assertEquals(0, OTask2.findSum(a2));
		assertEquals(0, OTask2.findSum(a3));
		assertEquals(-5, OTask2.findSum(a4));
	}

	@org.junit.jupiter.api.Test
	void testTask4() {
		int[][] a = { { 3, 0, 1 }, { 0, 1, 2 }, { 2, 2, 1 } };
		int[][] b = { { 1, 2 }, { 2, 1 } };
		assertArrayEquals(b, OTask2.task4Mod(a, 3));
		int[][] a1 = { { 3, 0, 1, 2 }, { 0, 1, 1, 3 }, { 2, 2, 2, 1 }, { 1, 1, 1, 1 } };
		int[][] b1 = { { 2, 2 }, { 1, 1 } };
		assertArrayEquals(b1, OTask2.task4Mod(a1, 3));
		int[][] a2 = { { 3, 0, 1, 3 }, { 0, 1, 1, 1 }, { 2, 2, 2, 1 }, { 1, 1, 1, 1 } };
		int[][] b2 = { { 1, 1 }, { 2, 2 }, { 1, 1 } };
		assertArrayEquals(b2, OTask2.task4Mod(a2, 3));

	}

}
