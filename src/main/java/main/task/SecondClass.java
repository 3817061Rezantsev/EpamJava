package main.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SecondClass {
	public static void main(String []args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i<n;i++) {
			int b = (int) (Math.random()*20);
			System.out.print(b);
		}
		for (int i = 0; i<n;i++) {
			int b = (int) (Math.random()*20);
			System.out.println(b);
		}
	}
}
