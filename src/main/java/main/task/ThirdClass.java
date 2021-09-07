package main.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ThirdClass {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int sum = 0, mul = 1;
		while (!bufferedReader.readLine().equals("")) {
			int n = Integer.parseInt(bufferedReader.readLine());
			sum += n;
			mul *= n;
		}
		System.out.println(sum + " " + mul);

	}
}
