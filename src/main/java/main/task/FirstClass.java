package main.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class FirstClass {
	public static void main(String []args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String name = bufferedReader.readLine();
		System.out.println("Hello, " + name);
		String reverse = new StringBuffer(name).reverse().toString();
		System.out.println(reverse);
	}
}
